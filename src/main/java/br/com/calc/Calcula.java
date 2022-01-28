package br.com.calc;

public class Calcula {
	private int v1;
	private int v2;
	
	
	public Calcula() {
	
	}
	
	public Calcula(int v1, int v2) {
		super();
		this.v1 = v1;
		this.v2 = v2;
	}
	
	
	public int soma () {
		return v1+v2;
	}
	
	public int subtracao () {
		return v1-v2;
	}
	
	public int multiplicacao () {
		return v1*v2;
	}
	
	public double divisao () {
		return (double)v1/v2;
	}
	
	
	
	public int getV1() {
		return v1;
	}
	public void setV1(int v1) {
		this.v1 = v1;
	}
	public int getV2() {
		return v2;
	}
	public void setV2(int v2) {
		this.v2 = v2;
	}
	
}
