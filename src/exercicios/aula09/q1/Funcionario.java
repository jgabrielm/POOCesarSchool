package exercicios.aula09.q1;

import java.util.ArrayList;

public abstract class Funcionario {
	
	protected static final double CARGA_HORARIA = 40;
	
	protected String nome;
	protected String CPF;
	
	public Funcionario(String nome, String CPF) {
		this.nome = nome;
		this.CPF = CPF;
	}
	
	public abstract double getRemuneracao();
	
	public String getNome() {
		return nome;
	}
	
	public String getCPF() {
		return CPF;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [nome=" + nome + ", CPF=" + CPF
				+ ", Remuneracao= " + this.getRemuneracao() + "]";
	}
	
	public static void main(String[] args) {
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		Funcionario f1 = new FuncionarioSalarioFixo("Func1", "473.517.620-90", 2000);
		funcionarios.add(f1);
		
		FuncionarioHoraExtra f2 = new FuncionarioHoraExtra("Func2", "379.828.610-83", 5000);
		f2.setHorasExtras(10);
		funcionarios.add(f2);
		
		FuncionarioComissionado f3 = new FuncionarioComissionado("Func3", "926.379.780-31", 0.10);
		f3.setTotalVendas(50000);
		funcionarios.add(f3);
		
		FuncionarioComissionadoComSalarioBase f4 = 
				new FuncionarioComissionadoComSalarioBase("Func4", "380.769.650-47", 0.15, 4000);
		f4.setTotalVendas(100000);
		funcionarios.add(f4);
		
		for(Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}
	}
}
