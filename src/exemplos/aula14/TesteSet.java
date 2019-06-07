package exemplos.aula14;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TesteSet {
	
	public static void main(String[] args) {
		Hora hora1 = new Hora(13,30);
		Hora hora2 = new Hora(12,30);
		Hora hora3 = new Hora(12,20);
		Hora hora4 = new Hora(9,00);
		Hora hora5 = new Hora(9,00);
		
		Set<Hora> conjunto1 = new HashSet<>();
		conjunto1.add(hora1);
		conjunto1.add(hora2);
		conjunto1.add(hora2);
		conjunto1.add(hora3);
		conjunto1.add(hora4);
		conjunto1.add(hora5);
		conjunto1.add(hora5);
		System.out.println(conjunto1);
		
		Set<Hora> conjunto2 = new LinkedHashSet<>();
		conjunto2.add(hora1);
		conjunto2.add(hora2);
		conjunto2.add(hora2);
		conjunto2.add(hora3);
		conjunto2.add(hora4);
		conjunto2.add(hora5);
		conjunto2.add(hora5);
		System.out.println(conjunto2);
		
		SortedSet<Hora> conjunto3 = new TreeSet<>();
		conjunto3.add(hora1);
		conjunto3.add(hora2);
		conjunto3.add(hora2);
		conjunto3.add(hora3);
		conjunto3.add(hora4);
		conjunto3.add(hora5);
		conjunto3.add(hora5);
		System.out.println(conjunto3);
		
	}
}
