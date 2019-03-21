package exemplos.aula05;

import java.util.Random;

public class UsoRandom {
	public static void main(String[] args) {
		Random random = new Random();
		
		for(int i = 0; i < 50; i++) {
			System.out.println(random.nextInt());
			System.out.println(random.nextDouble());
			System.out.println(random.nextGaussian());
		}
	}
}
