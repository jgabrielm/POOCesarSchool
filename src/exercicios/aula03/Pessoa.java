package exercicios.aula03;

public class Pessoa {
	
	private String nome;
	private int pesoEmKg;
	private float alturaEmM;
	private String CPF;
	private float imc;
	
	public Pessoa() {
	}

	public Pessoa(String nome, int pesoEmKg, float alturaEmM, String CPF) {
		this.nome = nome;
		this.pesoEmKg = pesoEmKg;
		this.alturaEmM = alturaEmM;
		this.CPF = CPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPesoEmKg() {
		return pesoEmKg;
	}

	public void setPesoEmKg(int pesoEmKg) {
		this.pesoEmKg = pesoEmKg;
	}

	public float getAlturaEmM() {
		return alturaEmM;
	}

	public void setAlturaEmM(float alturaEmM) {
		this.alturaEmM = alturaEmM;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public float getImc() {
		return imc;
	}

	public void setImc(float imc) {
		this.imc = imc;
	}
	
}
