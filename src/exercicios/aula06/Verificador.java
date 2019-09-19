package exercicios.aula06;

import java.util.Random;

public class Verificador {
	
	public static boolean contemRepeticoes(int [] valores) {
		
		for(int i = 0; i < valores.length - 1; i++) {
			for(int j = i+1; j < valores.length; j++) {
				if(valores[i] == valores[j]) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		final int tamanho = 5;
		final int maiorInt = 31;
		int [] valores = new int[tamanho];
		
		for(int i = 0; i < tamanho; i++) {
			valores[i] = random.nextInt(maiorInt);
		}
		
		System.out.println(Verificador.contemRepeticoes(valores));
		
 	}
}
