package exercicios.aula11.domain.impl;

import exercicios.aula11.domain.interf.Conta;
import exercicios.aula11.exception.SaldoInsuficienteException;

public class ContaCorrente implements Conta{
	
	private double saldo;
	private String numero;
	
	public ContaCorrente(String numero) {
		this.numero = numero;
		this.saldo = 0;
	}
	
	@Override
	public double getSaldo() {
		return saldo;
	}

	@Override
	public String getNumero() {
		return numero;
	}

	@Override
	public void creditar(double valor) {
		this.saldo += valor;
	}
	
	@Override
	public void debitar(double valor) throws SaldoInsuficienteException {
		if(this.saldo -  valor >= 0) {
			this.saldo -= valor;
		}else {
			throw new SaldoInsuficienteException();
		}
	}
	
}
