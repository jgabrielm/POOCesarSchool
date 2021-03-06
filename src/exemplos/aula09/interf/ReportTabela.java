package exemplos.aula09.interf;

import java.io.Serializable;

public class ReportTabela implements Parseable, Serializable, Escrevivel{
	
	private static final long serialVersionUID = 1L;
	private int numeroLinhas;
	private int numeroColunas;
	
	public ReportTabela(int numeroLinhas, int numeroColunas) {
		super();
		this.numeroLinhas = numeroLinhas;
		this.numeroColunas = numeroColunas;
	}

	@Override
	public String getMetadadados() {
		return this.getClass().getSimpleName() + " numeroLinhas: " + this.numeroLinhas 
				+ " numeroColunas " + this.numeroColunas;
	}



}
