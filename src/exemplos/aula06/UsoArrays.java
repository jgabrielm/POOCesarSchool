package exemplos.aula06;

import java.util.Arrays;

public class UsoArrays {
	public static void main(String[] args) {
		int [] valores = {1,10,3,4,5,1,0,-100,-200};
		
		int indice = Arrays.binarySearch(valores, 4);
		System.out.println(indice);
		indice = Arrays.binarySearch(valores, 4000);
		System.out.println(indice);
		
		Arrays.sort(valores);
		indice = Arrays.binarySearch(valores, -100);
		System.out.println(indice);
		
		indice = Arrays.binarySearch(valores, -4000);
		System.out.println(indice);
		
		int [] valores2 = new int[10];
		Arrays.fill(valores2, 100);
		
		String [] strings = {"zz","aaa", "bbb"};
		Arrays.sort(strings);
		
	}
}
