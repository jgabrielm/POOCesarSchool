package exercicios.aula09;

public class FuncionarioComissionadoComSalarioBase extends FuncionarioComissionado{

	private double salarioBase;
	
	public FuncionarioComissionadoComSalarioBase(String nome, String CPF, double percentualDeComissao, 
			double salarioBase) {
		super(nome, CPF, percentualDeComissao);
		this.salarioBase = salarioBase;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	@Override
	public double getRemuneracao() {
		return super.getRemuneracao() + this.salarioBase;
	}
}
