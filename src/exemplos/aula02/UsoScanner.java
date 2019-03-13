package exemplos.aula02;
import java.util.Scanner;

class UsoScanner {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("Digite seu nome");
		String nome = input.nextLine();
		System.out.printf("Olá %s%n", nome);

		System.out.println("Digite o primeiro número: ");
		double primeiro = input.nextDouble();

		System.out.println("Digite o segundo número: ");
		double segundo = input.nextDouble();

		System.out.printf("Soma %.2f%n", primeiro + segundo);
		System.out.printf("Subtração %.2f%n", primeiro - segundo);
		System.out.printf("Multiplicação %.2f%n", primeiro * segundo);
		System.out.printf("Divisão %.2f%n", primeiro / segundo);
		System.out.printf("Resto %.2f%n", primeiro % segundo);
		input.close();
		
		boolean igual = primeiro == segundo;
		System.out.printf("primeiro == segundo? %b\n", igual);
		
		boolean diferente = primeiro != segundo;
		System.out.println("primeiro != segundo? " + diferente);
		
		boolean menor = primeiro < segundo;
		System.out.println("primeiro < segundo? " + menor);
		
		boolean menorIgual = primeiro <= segundo;
		System.out.println("primeiro <= segundo? " + menorIgual);
		
		boolean maior = primeiro > segundo;
		System.out.println("primeiro > segundo? " + maior);
		
		boolean maiorIgual = primeiro >= segundo;
		System.out.println("primeiro >= segundo? " + maiorIgual);
	}
}
