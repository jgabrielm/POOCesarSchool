package exemplos.aula09.interf;

public interface Escrevivel {

	default String escreverDados(String dados) {
		return dados;
	}
}
