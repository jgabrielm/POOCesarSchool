package exercicios.aula07;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Double.MIN_VALUE;
import static java.lang.Double.MAX_VALUE; 


public class Despesas {
	
	private ArrayList<Double> valores = new ArrayList<Double>();
	
	public Double getMaiorDespesa() {
		double maior = MIN_VALUE;
		for(double valor : valores) {
			if(valor > maior) {
				maior = valor;
			}
		}
		return maior;
	}
	
	public Double getMenorDespesa() {
		double menor = MAX_VALUE;
		for(double valor : valores) {
			if(valor < menor) {
				menor = valor;
			}
		}
		return menor;
	}
	
	public Double getMedia() {
		if(valores.size() > 0) {
			double soma = 0;
			for(double valor : valores) {
				soma += valor;
			}
			return soma/valores.size();
		}
		return 0.0;
	}
	
	public void adicionarValor(Double valor) {
		this.valores.add(valor);
	}
	
	@Override
	public String toString() {
		return "Média de despesas: " + this.getMedia() + ", Maior Despesa: " + this.getMaiorDespesa() + 
				", Menor despesa: " + this.getMenorDespesa();
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Despesas despesa = new Despesas();
		boolean parar = false;
		String linha;
		double valor;
		
		do {
			System.out.println("Digite um valor numerico ou parar para encerrar:");
			linha = scanner.nextLine();
			if(!linha.equals("parar")) {
				valor = Double.parseDouble(linha);
				despesa.adicionarValor(valor);
			}else {
				parar = true;
			}
		}while(!parar);
		
		scanner.close();
		
		System.out.println(despesa);
		
	}
}
