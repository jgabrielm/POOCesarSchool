package exercicios.aula11.exception;

public class ContaNaoEncontradaException extends Exception{
	
	private static final long serialVersionUID = -8864475589605155918L;

	public ContaNaoEncontradaException() {
		super("Conta corrente não encontrada");
	}
}
