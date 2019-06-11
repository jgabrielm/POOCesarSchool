package exercicios.aula14.q2;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class Transportadora {
	
	private Set<Entrega> entregas = new TreeSet<>();
	
	public void adcionarEntrega(Entrega entrega) {
		this.entregas.add(entrega);
	}
	
	public Set<Entrega> geEntregas(){
		return this.entregas;
	}
	
	public static void main(String[] args) {
		Transportadora transportadora = new Transportadora();
		
		Entrega entrega1 = new Entrega(1, LocalDate.now(), "Entrega1");
		transportadora.adcionarEntrega(entrega1);
		Entrega entrega2 = new Entrega(2, LocalDate.now().minusWeeks(2), "Entrega2");
		transportadora.adcionarEntrega(entrega2);
		Entrega entrega3 = new Entrega(3, LocalDate.now().plusDays(16), "Entrega3");
		transportadora.adcionarEntrega(entrega3);
		
		System.out.println(transportadora.geEntregas());
	}
	
}
