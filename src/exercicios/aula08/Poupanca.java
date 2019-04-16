package exercicios.aula08;

public class Poupanca extends Conta{

	public Poupanca(String numero) {
		super(numero);
	}
	
	public void renderJuros(double taxa) {
		this.saldo += this.saldo * taxa;
	}

}
