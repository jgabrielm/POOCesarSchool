package exemplos.aula07;

import java.util.ArrayList;

import exemplos.aula06.OutroPacote;

import static java.lang.Math.PI;
//import static exemplos.aula06.OutroPacote.PI;

public class ExemploPacote {
	
	private AcessoDefault acessoDefault = new AcessoDefault();
	
	public static void main(String[] args) {
		ExemploPacote exemploPacote = new ExemploPacote();
		ArrayList<Integer> numeros = exemploPacote.acessoDefault.getNumeros();
		
		for(int numero : numeros) {
			System.out.println(numero);
		}
		
		System.out.println(PI);
		System.out.println(OutroPacote.PI);
	}
}
