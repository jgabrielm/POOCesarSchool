package exercicios.aula09.q1;

public class FuncionarioSalarioFixo extends Funcionario{
	
	private double salario;

	public FuncionarioSalarioFixo(String nome, String CPF, double salario) {
		super(nome, CPF);
		this.salario = salario;
	}

	@Override
	public double getRemuneracao() {
		return this.salario;
	}
	
	
}
