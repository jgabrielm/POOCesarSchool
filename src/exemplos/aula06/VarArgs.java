package exemplos.aula06;

public class VarArgs {
	
	public int somar(int a, int b) {
		return a+b;
	}
	
	public int somar(int...valores) {
		int soma = 0;
		for(int valor : valores) {
			soma += valor;
		}
		
		return soma;
	}
	
	public static void main(String...args) {
		VarArgs varArgs = new VarArgs();
		/*int soma = varArgs.somar(10,10,20,40,50);
		System.out.println(soma);*/
		
		int[] valores = {10,50};
		int soma = varArgs.somar(valores);
		System.out.println(soma);
	}
}
