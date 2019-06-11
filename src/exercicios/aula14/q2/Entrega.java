package exercicios.aula14.q2;

import java.time.LocalDate;

public class Entrega implements Comparable<Entrega>{
	
	private long id;
	private LocalDate limiteEntrega;
	private String nome;

	public Entrega(long id, LocalDate entrega, String nome) {
		this.id = id;
		this.limiteEntrega = entrega;
		this.nome = nome;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public LocalDate getLimiteEntrega() {
		return limiteEntrega;
	}

	public void setLimiteEntrega(LocalDate limiteEntrega) {
		this.limiteEntrega = limiteEntrega;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int compareTo(Entrega outraEntrega) {
		return this.getLimiteEntrega().compareTo(outraEntrega.getLimiteEntrega());
	}

	@Override
	public String toString() {
		return "id=" + id + ", limiteEntrega=" + limiteEntrega + ", nome=" + nome;
	}
}
