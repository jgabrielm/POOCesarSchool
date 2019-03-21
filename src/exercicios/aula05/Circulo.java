package exercicios.aula05;

public class Circulo {
	private final double raio;
	
	private static final int GRAUS = 360;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.raio, 2);
	}
	
	public static int getGraus() {
		return GRAUS;
	}
	
	public static void main(String[] args) {
		Circulo circulo = new Circulo(2);
		System.out.println(circulo.getArea());
		
		System.out.println(Circulo.getGraus());
	}
}
