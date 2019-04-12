package exemplos.aula07;

public class Pessoa {
	
	private String nome = "abc";
	private int idade = 100;

	/*public String toString() {
		return "ExemploToString [nome=" + nome + ", idade=" + idade + "]";
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}*/



	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Pessoa pessoa2 = pessoa;
		Pessoa pessoa3 = new Pessoa();
		
		System.out.println(pessoa);
		
		System.out.println(pessoa == pessoa2);
		System.out.println(pessoa == pessoa3);
		System.out.println(pessoa.equals(pessoa3));
		
		System.out.println(pessoa.hashCode());
		System.out.println(pessoa2.hashCode());
		System.out.println(pessoa3.hashCode());
		
		pessoa3.idade = 30;
		System.out.println(pessoa3.hashCode());
	}
}
