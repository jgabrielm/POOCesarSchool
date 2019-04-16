package exemplos.aula08;

import java.util.Date;

public class MembroComunidade {
	
	protected String nome;
	protected String CPF;
	protected Date dataNascimento;
	
	public MembroComunidade() {
	}
	
	public MembroComunidade(String nome, String CPF, Date dataNascimento) {
		this.nome = nome;
		this.CPF = CPF;
		this.dataNascimento = dataNascimento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCPF() {
		return CPF;
	}
	
	public void setCPF(String cPF) {
		CPF = cPF;
	}

	@Override
	public String toString() {
		return "nome=" + nome + ", CPF=" + CPF + ", dataNascimento=" + dataNascimento;
	}
	
}
