package exemplos.aula03;

public class Carro {
	public void ligar() {
		System.out.println("ligado!");
	}
	
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.ligar();
	}
}
