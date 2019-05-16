package exercicios.aula11.domain.interf;

import exercicios.aula11.exception.ContaNaoEncontradaException;

public interface RepositorioContas {
	
	void inserirConta(Conta conta);
	void deletarConta(String numero) throws ContaNaoEncontradaException;
	Conta buscarConta(String numero) throws ContaNaoEncontradaException;
}
