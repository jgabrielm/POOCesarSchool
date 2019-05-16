package exercicios.aula11.exception;

public class SaldoInsuficienteException extends Exception{

	private static final long serialVersionUID = -8802765508640927999L;
	
	public SaldoInsuficienteException() {
		super("Saldo insuficiente na conta para realizar a operação");
	}
}
