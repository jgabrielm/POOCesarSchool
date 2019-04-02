package exemplos.aula05;

public class ExemploInicializacao {

	static{
		System.out.println("Inicializador static");
		CONSTANT = 100;
	}
	
	{
		System.out.println("Inicializador nao static");
		x = 10;
	}
	
	{
		System.out.println("Inicializador nao static 2");
	}
	
	
	public int x;
	
	public static final int CONSTANT;
	
	public ExemploInicializacao(){
		System.out.println("Construtor");
		this.x += 1;
	}
	
	public static void main(String[] args) {
		System.out.println(ExemploInicializacao.CONSTANT);
		
		ExemploInicializacao inicializacao = new ExemploInicializacao();
		System.out.println(inicializacao.x);
	}
}
