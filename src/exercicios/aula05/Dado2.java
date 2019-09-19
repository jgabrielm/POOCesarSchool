package exercicios.aula05;

import java.util.Random;

public class Dado2 {
	private Random random = new Random();
	
	public int lancar() {
		return lancar(6);
	}
	
	public int lancar(int lados) {
		if(lados < 4 || lados > 20) {
			System.out.println("Por favor digite valores entre 4 e 20");
			return 0;
		}
		
		return 1 + random.nextInt(lados);
	}
	
	public static void main(String[] args) {
		Dado2 dado = new Dado2();
		for(int i = 0; i < 50; i++) {
			System.out.println(dado.lancar());
		}
	}
}
