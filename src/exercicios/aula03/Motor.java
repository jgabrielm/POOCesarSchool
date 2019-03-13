package exercicios.aula03;

public class Motor {
	
	private double quantidadeDeOleo = 15;
	private int pontencia;
	private String tipo;
	
	public void acelerar() {
		System.out.println("acelerando!");
	}
	
	private void consumirOleo(double quantidadeOleo) {
		double novaQuantidadeDeOleo  = this.getQuantidadeDeOleo() - quantidadeOleo;
		this.setQuantidadeDeOleo(novaQuantidadeDeOleo);
	}

	public double getQuantidadeDeOleo() {
		return quantidadeDeOleo;
	}

	public void setQuantidadeDeOleo(double quantidadeDeOleo) {
		this.quantidadeDeOleo = quantidadeDeOleo;
	}

	public int getPontencia() {
		return pontencia;
	}

	public void setPontencia(int pontencia) {
		this.pontencia = pontencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public static void main(String[] args) {
		Motor motor = new Motor();
		motor.acelerar();
		System.out.println(motor.getQuantidadeDeOleo());
	}
}
