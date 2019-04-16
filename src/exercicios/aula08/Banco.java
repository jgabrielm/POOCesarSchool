package exercicios.aula08;

import java.util.ArrayList;
import java.util.Random;

public class Banco {
	
	private ArrayList<Conta> contas = new ArrayList<Conta>();
	
	public void cadastrar(Conta conta) {
		this.contas.add(conta);
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}

	public static void main(String[] args) {
		Banco banco = new Banco();
		
		Conta conta1 = new Conta("12345");
		banco.cadastrar(conta1);
		
		Conta conta2 = new Conta("34567");
		banco.cadastrar(conta2);
		
		Conta conta3 = new Poupanca("789010");
		banco.cadastrar(conta3);
		
		Poupanca poupanca = new Poupanca("891919");
		banco.cadastrar(poupanca);
		
		Random random = new Random();
		for(Conta conta : banco.getContas()) {
			conta.creditar(random.nextDouble());
			conta.debitar(random.nextDouble());
			System.out.println(conta);
		}
		
	}
}
