package exercicios.aula14;

public class Funcionario {
	private Double salario;
	private String nome;

	public Funcionario(Double salario, String nome) {
		this.salario = salario;
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "salario=" + salario + " nome=" + nome;
	}
}
