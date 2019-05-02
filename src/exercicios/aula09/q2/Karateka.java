package exercicios.aula09.q2;

import java.util.ArrayList;
import java.util.List;

public interface Karateka extends Lutador{
	
	default List<String> golpes(){
		List<String> golpes = new ArrayList<String>();
		golpes.add("Chute");
		golpes.add("Soco");
		
		return golpes;
	}
}
