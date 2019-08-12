package exercicios.aula03;

public class Motor {
	public void acelerar() {
		System.out.println("acelerando!");
	}
	
	public static void main(String[] args) {
		Motor motor = new Motor();
		motor.acelerar();
	}
}
