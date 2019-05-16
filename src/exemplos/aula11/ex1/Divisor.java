package exemplos.aula11.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisor {
	
	public static int dividir(int numerador, int denominador) {
		return numerador / denominador;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean parar = false;
		
		do {
			try {
				System.out.println("Insira o numerador");
				int numerador = scanner.nextInt();
				
				System.out.println("Insira o denominador");
				int denominador = scanner.nextInt();
				
				int resultado = Divisor.dividir(numerador, denominador);
				System.out.println("Resultado: " + resultado);
				parar = true;
			}catch(InputMismatchException e) {
				System.err.printf("%nException: %s%n", e);
				System.out.printf("Por favor insira um número inteiro");
				scanner.nextLine();
			}catch(ArithmeticException e) {
				System.err.printf("%nException: %s%n", e);
				System.out.printf("Não é possivel dividir por zero, tente novamente%n");
			}
			
		}while(!parar);
		
		scanner.close();
	}
}
