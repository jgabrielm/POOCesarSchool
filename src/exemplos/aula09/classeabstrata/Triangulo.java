package exemplos.aula09.classeabstrata;

public abstract class Triangulo extends Poligono{

	protected double base;
	protected double altura;
	
	public Triangulo(double base, double altura) {
		this.numeroLados = 3;
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double getDiagonal() {
		return 0;
	}

	@Override
	public double getArea() {
		return this.base * this.altura/2;
	}
}
