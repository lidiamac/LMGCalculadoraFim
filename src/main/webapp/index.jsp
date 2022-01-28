<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculadora</title>
<link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"/>
</head>
<body>
	<form action="ServletCalculadora" method="post" class="row align-items-center flex-column" style="margin-top: 50px;" autocomplete="off">
        <div class="col-4 d-flex align-items-center flex-column border border-2 rounded-3 border-secondary p-5">
            <h1 class="mt-1 mb-3 fs-3 text-muted ">CALCULADORA</h1>
            
            <div class="mt-3">
                <label for="valor1" id="">VALOR 1</label>
                <input type="text" name="valor1" id="valor1">
            </div>
            <div class="mt-3">
                <label for="valor2" class="">VALOR 2</label>
                <input type="text" name="valor2" id="valor2">
            </div>

            <div class="btn-group col-12 mt-4" role="group" aria-label="Basic outlined example">
                <button type="submit" value="somar" class="btn btn-outline-success">+</button>
                <button type="submit" value="somar" class="btn btn-outline-success">-</button>
                <button type="submit" value="somar" class="btn btn-outline-success">*</button>
                <button type="submit" value="somar" class="btn btn-outline-success">/</button>
            </div>
            
            <div class="btn-group col-12 mt-4" role="group" aria-label="Basic outlined example">
				<button type="reset" value="limpar" class="btn btn-outline-warning">LIMPAR</button>
			</div>
			
        </div>
        
        <div class="col-4 border border-2 rounded-3 border-secondary ps-5 pt-2 pb-3 fs-5 mt-1">
        	<span class="">Resultado = ${requestScope.res}</span>
        </div>
    </form>
</body>
</html>