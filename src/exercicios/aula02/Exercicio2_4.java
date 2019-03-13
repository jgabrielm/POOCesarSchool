package exercicios.aula02;
import java.util.Scanner;

public class Exercicio2_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("primeiro numero");
		double primeiro = input.nextDouble();
		
		System.out.println("segundo numero");
		double segundo = input.nextDouble();
		
		System.out.println("terceiro numero");
		double terceiro = input.nextDouble();
		
		input.close();
		
		System.out.printf("Soma %f%n", primeiro + segundo + terceiro);
		System.out.printf("Produto %f", primeiro * segundo * terceiro);
	}
}
