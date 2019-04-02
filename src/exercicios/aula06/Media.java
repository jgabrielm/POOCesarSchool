package exercicios.aula06;

public class Media {
	
	public static double calcular(double...valores) {
		double soma = 0;
		for(double valor : valores) {
			soma += valor;
		}
		
		return soma/valores.length;
	}
	
	public static void main(String... args) {
		double media = Media.calcular(1,3,5);
		System.out.println(media);
	}
}
