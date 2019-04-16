package exemplos.aula08;

import java.util.ArrayList;
import java.util.Date;

public class Aluno extends MembroComunidade{
	
	private ArrayList<Float> notas;
	private String semestreDeEntrada;
	
	public Aluno(String nome, String CPF, Date dataNascimento, String semestreDeEntrada) {
		super(nome, CPF, dataNascimento);
		this.semestreDeEntrada = semestreDeEntrada;
	}

	public ArrayList<Float> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Float> notas) {
		this.notas = notas;
	}

	public String getSemestreDeEntrada() {
		return semestreDeEntrada;
	}

	public void setSemestreDeEntrada(String semestreDeEntrada) {
		this.semestreDeEntrada = semestreDeEntrada;
	}
	
	@Override
	public String toString() {
		return "Aluno " + super.toString() + " semestre de entrada " + semestreDeEntrada;
	}
}
