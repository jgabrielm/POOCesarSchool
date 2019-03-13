package exercicios.aula03;

public class IMC {
	
	public void calcular(Pessoa pessoa) {
		float altura =  pessoa.getAlturaEmM();
		float imc = pessoa.getPesoEmKg()/(altura * altura);
		pessoa.setImc(imc);
	}
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Ze", 70, 1.85f, "123456789");
		IMC imc = new IMC();
		
		imc.calcular(pessoa);
		System.out.println(pessoa.getImc());
	}
}
