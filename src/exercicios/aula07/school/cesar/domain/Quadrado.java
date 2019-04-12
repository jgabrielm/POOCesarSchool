package exercicios.aula07.school.cesar.domain;

import exercicios.aula07.school.cesar.util.Calculadora;

public class Quadrado {
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public double getDiagonal() {
		return this.lado * Calculadora.getRaizQuadrada(2);
	}
	
	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado(10);
		System.out.println(quadrado.getDiagonal());
	}
}
