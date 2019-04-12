package exercicios.aula07;

public class Empresa {
	
	private String nome;
	private String CNPJ;
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CNPJ == null) ? 0 : CNPJ.hashCode());
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (CNPJ == null) {
			if (other.CNPJ != null)
				return false;
		} else if (!CNPJ.equals(other.CNPJ))
			return false;
		return true;
	}

	public String toString() {
		return "Empresa [nome=" + nome + ", CNPJ=" + CNPJ + "]";
	}
	

	
}
