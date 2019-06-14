package exercicios.aula15;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Turma {
	
	private Set<Aluno> alunos = new HashSet<>();
	
	public void addAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public void imprimirAlunosPorNota() {
		this.alunos.stream()
		.sorted((a1,a2) -> a1.getNota().compareTo(a2.getNota()))
		.forEach(System.out::println);
		System.out.println();
	}
	
	public void imprimirAlunosPorNome() {
		this.alunos.stream()
		.sorted((a1,a2) -> a1.getNome().compareTo(a2.getNome()))
		.forEach(System.out::println);
		System.out.println();
	}
	
	public void imprimirAlunoMaiorNota() {
		System.out.println(this.alunos.stream().max((a1,a2) -> a1.getNota().compareTo(a2.getNota())).get());
		System.out.println();
	}
	
	public void imprimirAlunoMenorNota() {
		System.out.println(this.alunos.stream().min((a1,a2) -> a1.getNota().compareTo(a2.getNota())).get());
		System.out.println();
	}
	
	public void imprimirMediaNotas() {
		System.out.println("média " + this.alunos.stream().mapToDouble(a -> a.getNota()).average().getAsDouble());
		System.out.println();
	}
	
	public void imprimirSomaNotas() {
		System.out.println("soma " + this.alunos.stream().mapToDouble(a -> a.getNota()).sum());
		System.out.println();
	}
	
	public void imprimirProdutoNotas() {
		System.out.println("produto " + this.alunos.stream().mapToDouble(a -> a.getNota()).reduce((a1,a2) -> a1*a2).getAsDouble());
		System.out.println();
	}
	
	public void imprimirAlunosMediaMaior(int valor) {
		this.alunos.stream().filter(a -> {
			return a.getNota() > valor;
		}).forEach(System.out::println);
		System.out.println();
	}
	
	public Map<String, String> getMapaAlunos() {
		return this.alunos.stream().collect(Collectors.toMap(Aluno::getCPF, Aluno::getNome));
	}
	
	public static void main(String[] args) {
		Turma turma = new Turma();
		
		Aluno aluno1 = new Aluno ("ddd", "12345", 10.0f);
		Aluno aluno2 = new Aluno ("ccc", "45678", 5.0f);
		Aluno aluno3 = new Aluno ("bbb", "891011", 6.0f);
		Aluno aluno4 = new Aluno ("aaa", "121314", 8.0f);
		
		turma.addAluno(aluno1);
		turma.addAluno(aluno2);
		turma.addAluno(aluno3);
		turma.addAluno(aluno4);
		
		turma.imprimirAlunosPorNota();
		turma.imprimirAlunosPorNome();
		turma.imprimirAlunoMaiorNota();
		turma.imprimirAlunoMenorNota();
		turma.imprimirMediaNotas();
		turma.imprimirSomaNotas();
		turma.imprimirProdutoNotas();
		turma.imprimirAlunosMediaMaior(7);
		
		Map<String, String> alunos = turma.getMapaAlunos();
		System.out.println(alunos);
	}
	
}
