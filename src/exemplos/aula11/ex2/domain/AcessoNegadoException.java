package exemplos.aula11.ex2.domain;

public class AcessoNegadoException extends Exception{

	private static final long serialVersionUID = 2771475705978096125L;

	public AcessoNegadoException() {
		super("Você não tem permissão para acessar esta funcionalidade");
	}
	
	public AcessoNegadoException(String msg) {
		super(msg);
	}
}
