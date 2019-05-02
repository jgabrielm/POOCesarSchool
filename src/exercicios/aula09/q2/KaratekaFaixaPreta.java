package exercicios.aula09.q2;

import java.util.List;

public class KaratekaFaixaPreta implements Karateka{

	@Override
	public List<String> golpes() {
		List<String> golpes = Karateka.super.golpes();
		golpes.add("Cotovelada");
		golpes.add("Joelhada");
		golpes.add("Rasteira");
		
		return golpes;
	}
}
