package exemplos.aula09.classeabstrata;

import java.util.ArrayList;

public abstract class Poligono {
	
	protected int numeroLados;
	
	public abstract double getArea();
	
	public abstract double getDiagonal();

	public int getLados() {
		return numeroLados;
	}

	public void setLados(int lados) {
		this.numeroLados = lados;
	}


	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [numeroLados=" + numeroLados 
				+ ", area=" + getArea() + ", diagonal=" + getDiagonal() + "]";
	}
	
	public static void main(String[] args) {
		ArrayList<Poligono> poligonos = new ArrayList<Poligono>();
		
		Quadrilatero q1 = new Retangulo(10, 15);
		poligonos.add(q1);
		
		Quadrilatero q2 = new Quadrado(5);
		poligonos.add(q2);
		
		Triangulo t1 = new TrianguloRetangulo(3, 4);
		poligonos.add(t1);
		
		for(Poligono poligono : poligonos) {
			System.out.println(poligono);
		}
		
		
//		if(t1 instanceof TrianguloRetangulo) {
//			System.out.println(((TrianguloRetangulo)t1).getHipotenusa());
//		}
//		
//		System.out.println(q1 instanceof Quadrilatero);
//		System.out.println(q1 instanceof Retangulo);
		
	}

}
