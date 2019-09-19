package exemplos.aula05;

public class ExemploStatic {
	
	private static int value = 10;
	public static final double PI = 3.141592;
	private final int z = 50;
	
	public static void metodoStatic(String valor) {
		System.out.println(valor);
	}
	
	public static void incrementarValue(int incremento) {
		value += incremento;
	}
	
	public static void declararVariavelFinal() {
		final int x = 1;
		//x = 0;
		//z++;
		//PI += 10;
	}
	
	public int getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		ExemploStatic.metodoStatic("Chamando metodo static");
		
		System.out.println(ExemploStatic.value);
		
		ExemploStatic ex1 = new ExemploStatic();
		ExemploStatic ex2 = new ExemploStatic();
		
		ExemploStatic.incrementarValue(10);
		System.out.println(ex1.getValue());
		System.out.println(ex2.getValue());
		
		System.out.println(ExemploStatic.PI);
	}
}
