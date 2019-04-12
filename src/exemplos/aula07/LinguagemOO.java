package exemplos.aula07;

public enum LinguagemOO {
	
	JAVA("Java"), C_SHARP("C#"), C_PLUS_PLUS("C++"), APEX("Apex"), RUBY("Ruby");
	
	private String nome;
	
	private LinguagemOO(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
}
