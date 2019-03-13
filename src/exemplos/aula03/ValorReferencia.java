package exemplos.aula03;
public class ValorReferencia {
	
	public int increment(int x) {
		return x+1;
	}
	
	public void alterarDePassegeiros(Carro carro) {
		carro.setQuantidadePassageiros(10);
	}
	
	public static void main(String[] args) {
		ValorReferencia valorReferencia = new ValorReferencia();
		
//		int i = 10;
//		System.out.println(i);
//		System.out.println(valorReferencia.increment(i));
//		System.out.println(i);
//		
//		int j = i;
//		j = j - 1;
//		System.out.println(j);
//		System.out.println(i);
		
//		Carro carro = new Carro();
//		carro.setQuantidadePassageiros(5);
//		
//		System.out.println(carro.getQuantidadePassageiros());
//		valorReferencia.alterarDePassegeiros(carro);
//		System.out.println(carro.getQuantidadePassageiros());
//		
//		Carro carro2 = carro;
//		carro2.setQuantidadePassageiros(4);
//		System.out.println(carro.getQuantidadePassageiros());
//		carro.setQuantidadePassageiros(8);
//		System.out.println(carro.getQuantidadePassageiros());
//		
//		carro2 = new Carro();
//		carro2.setQuantidadePassageiros(12);
//		System.out.println(carro.getQuantidadePassageiros());
//		System.out.println(carro2.getQuantidadePassageiros());
		
	}
}
