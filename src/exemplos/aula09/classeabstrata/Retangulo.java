package exemplos.aula09.classeabstrata;

public class Retangulo extends Quadrilatero{

	public Retangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double getDiagonal() {
		double soma = Math.pow(this.base, 2) + Math.pow(this.altura, 2);
		return Math.sqrt(soma);
	}

}
