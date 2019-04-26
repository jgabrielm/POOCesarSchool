package exercicios.aula09;

public class FuncionarioComissionado extends Funcionario{
	
	private double totalVendas;
	private double percentualDeComissao;
	
	public FuncionarioComissionado(String nome, String CPF, double percentualDeComissao) {
		super(nome, CPF);
		this.percentualDeComissao = percentualDeComissao;
	}
		
	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	public double getPercentualDeComissao() {
		return percentualDeComissao;
	}

	public void setPercentualDeComissao(double percentualDeComissao) {
		this.percentualDeComissao = percentualDeComissao;
	}

	@Override
	public double getRemuneracao() {
		return this.totalVendas * this.percentualDeComissao;
	}
	
	
}
