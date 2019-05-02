package exemplos.aula09.interf;

public interface Writable {
	
	default String escreverDados(String dados) {
		return dados;
	}
}
