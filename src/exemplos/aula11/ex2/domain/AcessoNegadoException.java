package exemplos.aula11.ex2.domain;

public class AcessoNegadoException extends Exception{

	private static final long serialVersionUID = -2929609067337201914L;
	
	public AcessoNegadoException() {
		super("Você não tem permissão para acessar esta funcionalidade");
	}
}
