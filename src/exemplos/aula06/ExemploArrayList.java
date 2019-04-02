package exemplos.aula06;

import java.util.ArrayList;

public class ExemploArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("Aaa");
		strings.add(0,"Bbb");
		strings.add("ccC");
		
		System.out.println(strings.size());
		
		System.out.println(strings.get(0));
		System.out.println(strings.contains("ccc"));
		System.out.println(strings.contains("ccC"));
		
		strings.remove(1);
		
		for(String str : strings) {
			System.out.println(str);
		}
		
		ArrayList<Integer> inteiros = new ArrayList<Integer>();
		inteiros.add(1);
		inteiros.add(10);
	}
}
