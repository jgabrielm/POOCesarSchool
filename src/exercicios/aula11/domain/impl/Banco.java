package exercicios.aula11.domain.impl;

import java.util.ArrayList;
import java.util.List;

import exercicios.aula11.domain.interf.Conta;
import exercicios.aula11.domain.interf.RepositorioContas;
import exercicios.aula11.exception.ContaNaoEncontradaException;
import exercicios.aula11.exception.SaldoInsuficienteException;

public class Banco implements RepositorioContas{

	private List<Conta> contas = new ArrayList<Conta>();
	
	@Override
	public void inserirConta(Conta conta) {
		this.contas.add(conta);
	}

	@Override
	public void deletarConta(String numero) throws ContaNaoEncontradaException {
		boolean deletado = false;
		Conta conta;
		for(int i = 0; i < this.contas.size() && !deletado; i++) {
			conta = this.contas.get(i);
			if(conta.getNumero().equals(numero)) {
				this.contas.remove(i);
				deletado = true;
			}
		}
		
		if(!deletado) {
			throw new ContaNaoEncontradaException();
		}
	}

	@Override
	public Conta buscarConta(String numero) throws ContaNaoEncontradaException {
		Conta contaRetorno = null;
		for(Conta conta : this.contas) {
			if(conta.getNumero().equals(numero)) {
				contaRetorno = conta;
				break;
			}
		}
		
		if(contaRetorno == null) {
			throw new ContaNaoEncontradaException();
		}
		
		return contaRetorno;
	}

	public static void main(String[] args) {
		RepositorioContas banco = new Banco();
		
		Conta conta1 = new ContaCorrente("abc123");
		conta1.creditar(1000);
		banco.inserirConta(conta1);
		
		Conta conta2 = new ContaCorrente("abc456");
		conta2.creditar(500);
		banco.inserirConta(conta2);
		
		Conta conta3 = new ContaCorrente("abc789");
		conta2.creditar(2000);
		banco.inserirConta(conta3);
		
		try {
			Conta conta = banco.buscarConta("abc123");
			conta.debitar(2000);
		}catch(ContaNaoEncontradaException | SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		} 
		
		try {
			Conta conta = banco.buscarConta("890");
			conta.debitar(2000);
		}catch(ContaNaoEncontradaException | SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		} 
		
		try {
			banco.deletarConta("abc456");
			banco.deletarConta("abc456");
		}catch(ContaNaoEncontradaException e) {
			System.out.println(e.getMessage());
		} 
		
	}
}
