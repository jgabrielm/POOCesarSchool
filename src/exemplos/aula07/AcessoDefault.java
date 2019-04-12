package exemplos.aula07;

import java.util.ArrayList;
import java.util.Collections;

class AcessoDefault {
	
	private ArrayList<Integer> numeros = new ArrayList<Integer>(Collections.nCopies(30, 0));

	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}
}
