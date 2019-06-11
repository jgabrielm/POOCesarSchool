package exercicios.aula14.q3;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

public class SomaDupla {
	
	public static int[] getIndices(int[] valores, int alvo) {
	    Map<Integer, Integer> mapa = new HashMap<>();
	    
	    for (int i = 0; i < valores.length; i++) {
	        int complemento = alvo - valores[i];
	        if (mapa.containsKey(complemento)) {
	            return new int[] { mapa.get(complemento), i };
	        }
	        mapa.put(valores[i], i);
	    }
	    
	    throw new InvalidParameterException("Não há solução");
	}
	
	public static void main(String[] args) {
		int [] valores = {2, 7, 11, 15};
		int alvo = 9;
		
		int[] indices = SomaDupla.getIndices(valores, alvo);
		System.out.println(indices[0] + ", " + indices[1]);
		
	}
}
