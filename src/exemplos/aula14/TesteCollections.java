package exemplos.aula14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteCollections implements Comparator<Hora>{
	
	@Override
	public int compare(Hora hora1, Hora hora2) {
		int diferencaHoras = hora1.getHora() - hora2.getHora();
		if(diferencaHoras != 0) {
			return diferencaHoras;
		}
		
		int diferencaMinutos = hora1.getMinutos() - hora2.getMinutos();
		if(diferencaMinutos != 0) {
			return diferencaMinutos;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		Hora hora1 = new Hora(13,30);
		Hora hora2 = new Hora(12,30);
		Hora hora3 = new Hora(12,20);
		Hora hora4 = new Hora(9,00);
		Hora hora5 = new Hora(9,00);
		
		List<Hora> horas = new ArrayList<>();
		horas.add(hora1);
		horas.add(hora2);
		horas.add(hora3);
		horas.add(hora4);
		horas.add(hora5);
		
		List<String> naipes = Arrays.asList("Paus", "Ouros", "Copas", "Espadas");
		
		//sort
		System.out.println(naipes);
		Collections.sort(naipes);
		System.out.println(naipes);
		Collections.sort(naipes, Collections.reverseOrder());
		System.out.println(naipes);

		Collections.sort(horas, new TesteCollections());
		System.out.println(horas);
		
		//shuffle
		Collections.shuffle(naipes);
		System.out.println(naipes);
		
		//reverse
		Collections.reverse(horas);
		System.out.println(horas);
		
		//copy
		String [] naipes2Array = new String[naipes.size()];
		List<String> naipes2 = Arrays.asList(naipes2Array);
		
		Collections.copy(naipes2, naipes);
		System.out.println(naipes2);
		
		//fill
		Collections.fill(naipes2, "");
		System.out.println(naipes2);
		
		//max e min
		System.out.println(Collections.max(horas));
		System.out.println(Collections.min(horas));
		
		//binarySearch
		Collections.sort(naipes);
		System.out.println(naipes);
		System.out.println(Collections.binarySearch(naipes, "Ouros"));
		System.out.println(Collections.binarySearch(naipes, "Teste"));
		
		//frequency
		int frequencia = Collections.frequency(naipes, "Ouros");
		System.out.println(frequencia);
		frequencia = Collections.frequency(naipes2, "");
		System.out.println(frequencia);
		
		//disjoint e addAll
		System.out.println(Collections.disjoint(naipes, naipes2));
		naipes2 = new ArrayList<>();
		Collections.addAll(naipes2, "Ouros", "Paus");
		System.out.println(Collections.disjoint(naipes, naipes2));
	}

}
