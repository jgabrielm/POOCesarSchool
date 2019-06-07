package exercicios.aula14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Empresa implements Comparator<Funcionario>{

	private List<Funcionario> funcionarios =  new ArrayList<>();
	
	public void adcionar(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	
	@Override
	public int compare(Funcionario funcionario1, Funcionario funcionario2) {
		return funcionario1.getSalario().compareTo(funcionario2.getSalario());
	}
	
	public List<Funcionario> ordernarPorSalarioCrescente(){
		Collections.sort(this.funcionarios, this);
		return this.funcionarios;
	}
	
	public List<Funcionario> ordernarPorSalarioDecrescente(){
		this.ordernarPorSalarioCrescente();
		Collections.reverse(this.funcionarios);
		return this.funcionarios;
	}
	
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		Funcionario funcionario;
		
		for(int i = 0; i < 10; i++) {
			funcionario = new Funcionario(Math.random()*10000, "nome" + i);
			empresa.adcionar(funcionario);
		}
		
		System.out.println(empresa.ordernarPorSalarioCrescente());
		System.out.println(empresa.ordernarPorSalarioDecrescente());
	}

	
}
