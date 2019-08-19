package exercicios.aula02;
import java.util.Scanner;

public class Exercicio2_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("primeiro numero");
		int primeiro = input.nextInt();
		
		System.out.println("segundo numero");
		int segundo = input.nextInt();
		
		System.out.println("terceiro numero");
		int terceiro = input.nextInt();
		
		input.close();
		
		System.out.printf("Soma %d%n", primeiro + segundo + terceiro);
		System.out.printf("Produto %d", primeiro * segundo * terceiro);
	}
}
