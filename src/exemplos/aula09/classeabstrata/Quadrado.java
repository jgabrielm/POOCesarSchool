package exemplos.aula09.classeabstrata;

public class Quadrado extends Retangulo{

	public Quadrado(double lado) {
		super(lado, lado);
	}
	
	@Override
	public double getDiagonal() {
		return this.base * Math.sqrt(2);
	}
	
}
