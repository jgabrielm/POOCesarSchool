package exemplos.aula03;
import exercicios.aula03.Motor;

public class Carro {
	
	private int cor;
	private int numeroDePortas = 4;
	private int quantidadePassageiros = 5;
	private String marca;
	private String modelo;
	private double quantidadeDeCombustivel = 10.5;
	private boolean farolLigado;
	private Motor motor;
	
	public void ligar() {
		String ligado = "ligado!";
		System.out.println(ligado);
	}
	
	public void abastecer(double quantidadeDeLitros) {
		double novaQuantidadeDeCombustivel = this.getQuantidadeDeCombustivel() + quantidadeDeLitros;
		this.setQuantidadeDeCombustivel(novaQuantidadeDeCombustivel);
	}
	
	private void consumirCombustível(double quantidadeDeLitros) {
		double novaQuantidadeDeCombustivel = this.getQuantidadeDeCombustivel() - quantidadeDeLitros;
		this.setQuantidadeDeCombustivel(novaQuantidadeDeCombustivel);
	}
	
	public void acelarar() {
		this.motor.acelerar();
		this.consumirCombustível(0.2);
	}
	
	public int getCor() {
		return cor;
	}

	public void setCor(int cor) {
		this.cor = cor;
	}
	
	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}

	public int getQuantidadePassageiros() {
		return quantidadePassageiros;
	}

	public void setQuantidadePassageiros(int quantidadePassageiros) {
		this.quantidadePassageiros = quantidadePassageiros;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setQuantidadeDeCombustivel(double quantidadeDeCombustivel) {
		this.quantidadeDeCombustivel = quantidadeDeCombustivel;
	}

	public double getQuantidadeDeCombustivel() {
		return quantidadeDeCombustivel;
	}

	public void setQuantidadeDeCombustivel(float quantidadeDeCombustivel) {
		this.quantidadeDeCombustivel = quantidadeDeCombustivel;
	}

	public boolean isFarolLigado() {
		return farolLigado;
	}

	public void setFarolLigado(boolean farolLigado) {
		this.farolLigado = farolLigado;
	}
	
	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.ligar();
		//System.out.println(carro.getQuantidadeDeCombustivel());
		//carro.abastecer(10.5);
		//System.out.println(carro.getQuantidadeDeCombustivel());
		//carro.acelarar();
	}
}
