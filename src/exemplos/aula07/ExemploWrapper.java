package exemplos.aula07;

import java.util.ArrayList;

public class ExemploWrapper {
	private Double valor1 = 2.5;
	private int valor2 = 1;
	
	
	public Integer somar(int valor) {
		return this.valor2 + valor;
	}
	
	public double somar (Double valor) {
		return this.valor1 + valor;
	}
	
	public static void main(String[] args) {
		
		
		double d = Double.parseDouble("9.5");
		Integer x = Integer.parseInt("11");
		
		ExemploWrapper exemploWrapper = new ExemploWrapper();
		System.out.println(exemploWrapper.somar(d));
		System.out.println(exemploWrapper.somar(x));
		
		Integer int1 = new Integer(10);
		Integer int2 = int1;
		Integer int3 =  10;
		Integer int4 =  new Integer(10);
		Integer int5 = 10;
		
		System.out.println(int1 == int2);
		System.out.println(int1.equals(int2));
		
		System.out.println(int1 == int3);
		System.out.println(int1.equals(int3));
		
		System.out.println(int1 == int4);
		System.out.println(int1.equals(int4));
		
		System.out.println(int1 == int5);
		System.out.println(int1.equals(int5));
		
		boolean b = new Boolean(false);
		System.out.println(b);
		
		ArrayList<Long> list = new ArrayList<Long>();
		list.add(10l);
		long valor = new Long(15);
		list.add(valor);
		int valor2 = 7;
		long abc = valor2;
		list.add(abc);
	}
}
