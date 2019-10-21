package exemplos.aula09.interf;

public interface Escrevivel extends Writable{

	default String escreverDados(String dados) {
		return dados;
	}
}
