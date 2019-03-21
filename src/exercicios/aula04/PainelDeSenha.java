package exercicios.aula04;

public class PainelDeSenha {
	
	private int senhaAtual;
	
	public PainelDeSenha() {
		
	}
	
	public PainelDeSenha (int senhaAtual) {
		this.senhaAtual = senhaAtual;
	}
	
	public void chamarProximo() {
		this.senhaAtual++;
		
		if(this.senhaAtual > 99) {
			senhaAtual = 0;
		}
		
		System.out.println(this.senhaAtual > 9? this.senhaAtual : "0" + this.senhaAtual);
	}
	
	public static void main(String[] args) {
		PainelDeSenha painel = new PainelDeSenha(99);
		painel.chamarProximo();
	}
}
