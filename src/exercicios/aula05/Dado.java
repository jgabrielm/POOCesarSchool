package exercicios.aula05;

import java.util.Random;

public class Dado {
	public int lancar() {
		Random random = new Random();
		return 1 + random.nextInt(6);
	}
	
	public static void main(String[] args) {
		Dado dado = new Dado();
		for(int i = 0; i < 50; i++) {
			System.out.println(dado.lancar());
		}
	}
}
