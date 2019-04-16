package exercicios.aula08;

public class Conta {
	protected String numero;
	protected double saldo;
	
	public Conta(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void creditar(double valor) {
		this.saldo += valor;
	}
	
	public void debitar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + "]";
	}
}
