package exemplos.aula09.classeabstrata;

public abstract class Quadrilatero extends Poligono{
	
	protected double base;
	protected double altura;
	
	public Quadrilatero(double base, double altura) {
		this.numeroLados = 4;
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double getArea() {
		return base * altura;
	}
}
