package exemplos.aula08;

import java.util.Date;

public class Funcionario extends MembroComunidade{

	private String matricula;
	private Short salario;
	
	public Funcionario(String nome, String CPF, Date dataNascimento, String matricula, short salario) {
		super(nome, CPF, dataNascimento);
		this.matricula = matricula;
		this.salario = salario;
	}
	
	public Funcionario() {
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Short getSalario() {
		return salario;
	}

	public void setSalario(Short salario) {
		this.salario = salario;
	}
	
	public void metodoFinal() {
		
	}
}
