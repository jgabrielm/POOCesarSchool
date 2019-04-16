package exemplos.aula08;

import java.util.ArrayList;
import java.util.Date;

public class Professor extends Funcionario{
	
	private ArrayList<String> disciplinas = new ArrayList<String>();

	public Professor(String nome, String CPF, Date dataNascimento, String matricula, 
			short salario, ArrayList<String> disciplinas) {
		super(nome, CPF, dataNascimento, matricula, salario);
		this.disciplinas = disciplinas;
	}
	
	public Professor() {
		
	}

	public ArrayList<String> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<String> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		return "Professor [disciplinas=" + disciplinas + ", nome=" + nome + ", CPF=" + CPF + ", dataNascimento="
				+ dataNascimento + "]";
	}
	
	@Override
	public void metodoFinal() {
		super.metodoFinal();
	}
	
	public static void main(String[] args) {
		ArrayList<MembroComunidade> membros = new ArrayList<>();
		
		MembroComunidade membro1 = new MembroComunidade("Nome1", "284.804.170-64", new Date());
		membros.add(membro1);
		
		MembroComunidade aluno1 = new Aluno("Nome2", "219.837.610-52", new Date(), "2018.1");
		membros.add(aluno1);
		
		Aluno aluno2 = new Aluno("Nome3", "330.536.090-96", new Date(), "2018.1");
		membros.add(aluno2);
		
		Funcionario funcionario1 = new Funcionario("Nome4", "396.946.070-00", new Date(),"abc123", (short)3000);
		membros.add(funcionario1);
		
		ArrayList<String> disciplinas = new ArrayList<>();
		disciplinas.add("OO");
		disciplinas.add("IA");
		
		Funcionario professor1 = new Professor("Nome5", "452.799.230-95", new Date(),"abc456", (short)1000, disciplinas);
		membros.add(professor1);
		
		Professor professor2 = new Professor("Nome6", "002.083.040-88", new Date(),"abc789", (short)2000, disciplinas);
		membros.add(professor2);
		
		Professor professor3 = new Professor();
		membros.add(professor3);
		
		for(MembroComunidade membro : membros) {
			System.out.println(membro);
		}
	}

}
