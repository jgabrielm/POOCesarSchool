package exercicios.aula09.q2;

import java.util.ArrayList;
import java.util.List;

public abstract class Judoca implements Lutador{
	
	protected List<String> golpes;
	
	public Judoca(List<String> golpes) {
		this.golpes = golpes;
	}
	
	public static void main(String[] args) {
		List<Lutador> lutadores = new ArrayList<Lutador>();
		
		Karateka k1 = new KaratekaFaixaBranca();
		lutadores.add(k1);
		
		Karateka k2 = new KaratekaFaixaPreta();
		lutadores.add(k2);
		
		List<String> golpes = new ArrayList<String>();
		golpes.add("Rasteira");
		golpes.add("Imobilização");
		
		Judoca judoca = new Judoca(golpes) {
			
			@Override
			public List<String> golpes() {
				return this.golpes;
			}
		};
		lutadores.add(judoca);
		
		for(Lutador l : lutadores) {
			System.out.println(l.golpes());
		}
	}
}
