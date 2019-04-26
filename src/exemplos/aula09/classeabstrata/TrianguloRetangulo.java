package exemplos.aula09.classeabstrata;

public class TrianguloRetangulo extends Triangulo{

	private double hipotenusa;
	
	public TrianguloRetangulo(double cateto1, double cateto2) {
		super(cateto1, cateto2);
		this.hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
	}

	public double getHipotenusa() {
		return this.hipotenusa;
	}

}
