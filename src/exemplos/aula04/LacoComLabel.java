package exemplos.aula04;

public class LacoComLabel {
	public static void main(String[] args) {
		primeiroFor : for(int i = 0; i > 10; i++) {
			for(int j = 0; j < 100; j++) {
				if(j > 10) {
					break primeiroFor;
				}
				System.out.println(j);
			}
		}
	}
}
