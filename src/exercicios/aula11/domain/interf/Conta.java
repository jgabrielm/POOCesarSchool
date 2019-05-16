package exercicios.aula11.domain.interf;

import exercicios.aula11.exception.SaldoInsuficienteException;

public interface Conta {
	
	String getNumero();
	double getSaldo();
	void creditar(double valor);
	void debitar (double valor) throws SaldoInsuficienteException;
}
