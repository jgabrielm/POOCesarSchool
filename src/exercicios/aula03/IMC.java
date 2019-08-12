package exercicios.aula03;

import java.util.Scanner;

public class IMC {
	
	public void calcular(Pessoa pessoa) {
		float altura =  (float)pessoa.getAlturaEmM();
		float imc = pessoa.getPesoEmKg()/(altura * altura);
		pessoa.setImc(imc);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu peso em quilos");
		int peso = scanner.nextInt();
		
		System.out.println("Digite sua altura em metros");
		float altura = scanner.nextFloat();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setAlturaEmM(altura);
		pessoa.setPesoEmKg(peso);
		
		IMC imc = new IMC();
		imc.calcular(pessoa);
		System.out.println("Seu IMC é: " + pessoa.getImc());
		
		scanner.close();
	}
}
