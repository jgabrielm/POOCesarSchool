package exercicios.aula09.q1;

public class FuncionarioHoraExtra extends Funcionario{
	
	private static final double BONUS_HORA_EXTRA = 1.5;
	
	private double salarioBase;
	private int horasExtras;
	
	public FuncionarioHoraExtra(String nome, String CPF, double salarioBase) {
		super(nome, CPF);
		this.salarioBase = salarioBase;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	@Override
	public double getRemuneracao() {
		double valorHoraExtra = salarioBase/CARGA_HORARIA * BONUS_HORA_EXTRA;
		return salarioBase + valorHoraExtra * horasExtras;
	}
	
}
