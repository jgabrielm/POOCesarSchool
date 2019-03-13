package exercicios.aula04;

public class StringReversa {
	
	public void reverter(String entrada) {
		String saida = "";
		for(int i = entrada.length()-1; i >= 0; i--) {
			saida += entrada.charAt(i);
		}
		
		System.out.println(saida);
	}
	
	public static void main(String[] args) {
		StringReversa reversa = new StringReversa();
		reversa.reverter("Java");
		reversa.reverter("Paralelepipedo");
	}
}
