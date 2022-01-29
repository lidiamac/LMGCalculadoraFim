package br.com.calc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletCalculadora
 */
@WebServlet("/ServletCalculadora")
public class ServletCalculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCalculadora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if ((request.getParameter("val1") != null) && (request.getParameter("val2") != null)) {
			if ((request.getParameter("val1") != "") && (request.getParameter("val2") != "")) {
				
				int valor1 = Integer.parseInt(request.getParameter("val1"));
				int valor2 = Integer.parseInt(request.getParameter("val2"));
				
				Calcula c = new Calcula(valor1, valor2);
				
				if ((request.getParameter("operacao") == "soma")){
					request.setAttribute("result", c.soma());
				} else if ((request.getParameter("operacao") == "subtracao")) {
					request.setAttribute("result", c.subtracao());
				} else if ((request.getParameter("operacao") == "multiplicacao")) {
					request.setAttribute("result", c.multiplicacao());
				} else {
					request.setAttribute("result", c.divisao());
				}
				
				request.getRequestDispatcher("/").forward(request, response);
				
			} else {
				request.getRequestDispatcher("/").forward(request, response);
			} 
				
		} else {
			request.getRequestDispatcher("/").forward(request, response);
		}
	}
}

