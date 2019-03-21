package exemplos.aula04;

public class OperadoresLogicos {
	
	private boolean a = false, b = true;
	private int counter = 0;
	
	public void avaliar() {
		if(a && ++counter > 0) {
		}
		System.out.println(counter);
		
		if(a & ++counter == 0) {
		}
		System.out.println(counter);
		
		if(b || ++counter == 0) {
		}
		System.out.println(counter);
		
		if(b | ++counter == 0) {
		}
		System.out.println(counter);
		
		if(a ^ b) {
			counter--;
		}
		System.out.println(counter);
		
		if(!b) {
			counter++;
		}
		System.out.println(counter);
		
		System.out.println(counter > 1 ? "a" : "b");

	}
	
	public void operadores() {
		int x = 10;
		System.out.println(x++);
		System.out.println(x);
		System.out.println(++x);
		System.out.println(x--);
		System.out.println(x);
		System.out.println(--x);
	}
	
	public static void main(String[] args) {
		OperadoresLogicos ol = new OperadoresLogicos();
		//ol.avaliar();
		ol.operadores();
	}
}
