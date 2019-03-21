package exemplos.aula05;

public class ExemploInicializacao {

	static{
		CONSTANT = 100;
	}
	
	{
		x = 10;
	}
	
	
	public int x;
	
	public static final int CONSTANT;
	
	public ExemploInicializacao(){
		this.x += 1;
	}
	
	public static void main(String[] args) {
		System.out.println(ExemploInicializacao.CONSTANT);
		
		ExemploInicializacao inicializacao = new ExemploInicializacao();
		System.out.println(inicializacao.x);
	}
}
