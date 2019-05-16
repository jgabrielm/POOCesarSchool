package exemplos.aula11.ex2.interf;

import exemplos.aula11.ex2.domain.AcessoNegadoException;
import exemplos.aula11.ex2.domain.TipoUsuario;

public interface LocalRestrito {
	
	void verificarAcesso(TipoUsuario tipo) throws AcessoNegadoException;
}
