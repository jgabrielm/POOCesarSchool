package exemplos.aula09.interf;

import java.io.Serializable;

public abstract class ReportMatrizGenerica implements Serializable, Parseable, Writable{

	private static final long serialVersionUID = 1L;
	
	protected int numeroDimensoesLinha;
	protected int numeroDimensoesColuna;	
	
	public ReportMatrizGenerica(int numeroDimensoesLinha, int numeroDimensoesColuna) {
		super();
		this.numeroDimensoesLinha = numeroDimensoesLinha;
		this.numeroDimensoesColuna = numeroDimensoesColuna;
	}

	public abstract String getMetadadados();
	
	public abstract String getDados();

}
