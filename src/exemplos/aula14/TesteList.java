package exemplos.aula14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TesteList {
	public static void main(String[] args) {
		String [] cores = {"Vermelho", "Preto", "Verde", "Azul", "Roxo", "Rosa", "Branco", "Cinza", "Laranja", "Amarelo"};
		List<String> listaCores = new ArrayList<String>();
		
		for(String cor : cores) {
			listaCores.add(cor);
		}
		
		for(int i = 0; i < listaCores.size(); i++) {
			System.out.println(listaCores.get(i));
		}
		System.out.println();
		
		String [] coresARemover = {"Verde", "Roxo", "Marrom"};
		List<String> listaRemover = new Vector<String>();
		for(String cor: coresARemover) {
			listaRemover.add(cor);
		}
		listaRemover.remove("Roxo");
		System.out.println(listaRemover);
		System.out.println();
		
		listaCores.removeAll(listaRemover);
		Iterator<String> iterator = listaCores.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();
		
		List<String> listaCores2 = new LinkedList<>();
		listaCores2.addAll(listaCores);
		System.out.println(listaCores2.subList(0, listaCores2.size()));
		
		LinkedList<String> listaCores3 = new LinkedList<>(Arrays.asList(coresARemover));
		listaCores3.add("Azul");
		listaCores3.addFirst("Verde");
		System.out.println(listaCores3);
		
		String [] coresArray = new String[5];
		listaCores3.toArray(coresArray);
	}
}
