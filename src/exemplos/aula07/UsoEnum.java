package exemplos.aula07;

import java.util.EnumSet;

public class UsoEnum {
	private LinguagemOO linguagem;
	
	public UsoEnum(LinguagemOO linguagem) {
		this.linguagem = linguagem;
	}

	public LinguagemOO getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(LinguagemOO linguagem) {
		this.linguagem = linguagem;
	}
	
	public static void main(String[] args) {
		
		UsoEnum usoEnum = new UsoEnum(LinguagemOO.JAVA);
		System.out.println(usoEnum.getLinguagem());
		
		usoEnum.setLinguagem(LinguagemOO.RUBY);
		System.out.println(usoEnum.getLinguagem());
		
		if(usoEnum.getLinguagem().equals(LinguagemOO.C_PLUS_PLUS)) {
			System.out.println("igual");
		}
		else if(usoEnum.getLinguagem() != LinguagemOO.C_PLUS_PLUS) {
			System.out.println("diferente");
		}
		
		for(LinguagemOO linguagem : LinguagemOO.values()) {
			System.out.println(linguagem + " - " + linguagem.getNome());
		}
		
		EnumSet<LinguagemOO> range = EnumSet.range(LinguagemOO.C_PLUS_PLUS, LinguagemOO.RUBY);
		System.out.println(range.toString());
	}
}
