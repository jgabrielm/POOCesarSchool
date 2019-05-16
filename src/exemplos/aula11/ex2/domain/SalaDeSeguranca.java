package exemplos.aula11.ex2.domain;

import exemplos.aula11.ex2.interf.LocalRestrito;

public class SalaDeSeguranca implements LocalRestrito{

	@Override
	public void verificarAcesso(TipoUsuario tipo) throws AcessoNegadoException {
		if(tipo == null) {
			throw new IllegalArgumentException("O tipo do usuario não pode ser null");
		}
		
		if(!tipo.equals(TipoUsuario.SEGURANCA)) {
			throw new AcessoNegadoException();
		}
	}
	
	public static void main(String[] args) {
		SalaDeSeguranca sala = new SalaDeSeguranca();
		
		try {
			sala.verificarAcesso(TipoUsuario.SEGURANCA);
		} catch (AcessoNegadoException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			sala.verificarAcesso(TipoUsuario.FUNCIONARIO);
		} catch (AcessoNegadoException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			sala.verificarAcesso(null);
		} catch (AcessoNegadoException e) {
			System.out.println(e.getMessage());
		}
	}
}
