package exercicios.aula04;

public class Fatorial {
	
	public int calcular(int numero) {
		
		if(numero < 0) {
			System.out.println("O numero não pode ser menor que zero!");
			return 0;
		}
		
		int fatorial = 1;
		while(numero > 0) {
			fatorial *= numero--;
		}
		
		return fatorial;
	}
	
	public static void main(String[] args) {
		Fatorial fatorial = new Fatorial();
		System.out.println(fatorial.calcular(0));
	}
}
