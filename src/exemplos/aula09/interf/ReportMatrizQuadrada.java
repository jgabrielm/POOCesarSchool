package exemplos.aula09.interf;

import java.util.ArrayList;
import java.util.List;

public class ReportMatrizQuadrada extends ReportMatrizGenerica{

	public ReportMatrizQuadrada(int dimensoes) {
		super(dimensoes, dimensoes);
	}

	private static final long serialVersionUID = 1L;

	@Override
	public String getMetadadados() {
		return this.getClass().getSimpleName() + " Dimensoes linhas " + this.numeroDimensoesLinha 
				+ " Dimensoes coluna " + this.numeroDimensoesColuna;
	}

	@Override
	public String getDados() {
		return "";
	}
	
	@Override
	public String escreverDados(String dados) {
		return "";
	}

	
	public static void main(String[] args) {
		List<Parseable> parseaveis = new ArrayList<Parseable>();
		
		ReportTabela reportTabela1 = new ReportTabela(10, 20);
		parseaveis.add(reportTabela1);
		
		Parseable reportTabela2 = new ReportTabela(5, 5);
		parseaveis.add(reportTabela2);
		
		Parseable parseable = new Parseable() {
			
			@Override
			public String getMetadadados() {
				return this.getClass().getSimpleName() + " classe anonima da interface";
			}
		};
		parseaveis.add(parseable);
		
		ReportMatrizGenerica matrizGenerica = new ReportMatrizGenerica(10, 2) {
			
			private static final long serialVersionUID = 1L;

			@Override
			public String getMetadadados() {
				return this.getClass().getSimpleName() + " classe anomima da classe abstrata";
			}
			
			@Override
			public String getDados() {
				return null;
			}

			@Override
			public String escreverDados(String dados) {
				return "";
			}
		};
		parseaveis.add(matrizGenerica);
		
		ReportMatrizGenerica matrizQuadrada1 = new ReportMatrizQuadrada(2);
		parseaveis.add(matrizQuadrada1);
		
		ReportMatrizQuadrada matrizQuadrada2 = new ReportMatrizQuadrada(4);
		parseaveis.add(matrizQuadrada2);
		
//		for(Parseable p : parseaveis) {
//			System.out.println(p.getMetadadados());
//		}
		
		System.out.println(matrizGenerica.escreverDados("abc"));
		System.out.println(matrizQuadrada1.escreverDados("quadrada1"));
		System.out.println(matrizQuadrada2.escreverDados("quadrada2"));
		System.out.println(reportTabela1.escreverDados("tabela1"));
	}
}
