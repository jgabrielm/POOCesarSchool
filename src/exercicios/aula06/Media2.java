package exercicios.aula06;

import java.util.ArrayList;
import java.util.Scanner;

public class Media2 {
	
	public static double calcular(ArrayList<Double> valores) {
		
		if(valores.size() > 0) {
			double soma = 0;
			for(double valor : valores) {
				soma += valor;
			}
			
			return soma/valores.size();
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double valor;
		boolean parar = false;
		ArrayList<Double> valores = new ArrayList<Double>();
		final double valorParada = 0.001;
		
		do {
			System.out.println("digite o valor:");
			valor = scanner.nextDouble();
			
			if(valor != valorParada) {
				valores.add(valor);
			}
			else {
				parar = true;
			}
		}while(!parar);
	
		scanner.close();
		System.out.println("Média: " + Media2.calcular(valores));
	}
}
