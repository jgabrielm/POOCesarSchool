package exercicios.aula05;

import java.util.Random;

public class Dado {
	public int lancar() {
		Random random = new Random();
		return 1 + random.nextInt(6);
	}
	
	public int lancar(int lados) {
		if(lados < 4 || lados > 20) {
			return 0;
		}
		
		Random random = new Random();
		return 1 + random.nextInt(lados);
	}
	
	public static void main(String[] args) {
		Dado dado = new Dado();
		for(int i = 0; i < 50; i++) {
			System.out.println(dado.lancar(20));
		}
	}
}
