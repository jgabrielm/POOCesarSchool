package exemplos.aula14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TesteMap {
	public static void main(String[] args) {
		
		String poo = "POO";
		String projeto = "Projeto";
		String requisitos = "Requisitos";
		String arquitetura = "Arquitetura do computadores";
		String so = "SO";
		
		Hora hora1 = new Hora(8,45);
		Hora hora2 = new Hora(10,30);
		Hora hora3 = new Hora(13,30);
		
		List<Hora> horasPOO = new ArrayList<Hora>();
		horasPOO.add(hora1);
		horasPOO.add(hora2);
		
		List<Hora> horasRequisitos = new ArrayList<Hora>();
		horasRequisitos.add(hora2);
		horasRequisitos.add(hora1);
		
		List<Hora> horasProjeto = new ArrayList<Hora>();
		horasProjeto.add(hora3);
		
		List<Hora> horasArquitetura = new ArrayList<Hora>();
		horasArquitetura.add(hora1);
		horasArquitetura.add(hora2);
			
		Map<String, List<Hora>> aulas = new HashMap<>(); 
		aulas.put(poo, horasProjeto);
		aulas.put(poo, horasPOO);
		aulas.put(projeto, horasRequisitos);
		aulas.put(projeto, horasProjeto);
		aulas.put(requisitos, horasRequisitos);
		aulas.put(arquitetura, horasArquitetura);
		aulas.put(so, horasArquitetura);
		
		for(String aula : aulas.keySet()) {
			System.out.println("aula: " + aula + ", horarios: " + aulas.get(aula));
		}
		System.out.println();
		
		Map<String, List<Hora>> aulas2 = new LinkedHashMap<>(); 
		aulas2.put(poo, horasProjeto);
		aulas2.put(poo, horasPOO);
		aulas2.put(projeto, horasRequisitos);
		aulas2.put(projeto, horasProjeto);
		aulas2.put(requisitos, horasRequisitos);
		aulas2.put(arquitetura, horasArquitetura);
		aulas2.put(so, horasArquitetura);
		
		for(String aula : aulas2.keySet()) {
			System.out.println("aula: " + aula + ", horarios: " + aulas.get(aula));
		}
		System.out.println();
		
		Map<String, List<Hora>> aulas3 = new TreeMap<>(); 
		aulas3.put(poo, horasProjeto);
		aulas3.put(poo, horasPOO);
		aulas3.put(projeto, horasRequisitos);
		aulas3.put(projeto, horasProjeto);
		aulas3.put(requisitos, horasRequisitos);
		aulas3.put(arquitetura, horasArquitetura);
		aulas3.put(so, horasArquitetura);
		
		for(String aula : aulas3.keySet()) {
			System.out.println("aula: " + aula + ", horarios: " + aulas.get(aula));
		}
		System.out.println();
		 
	}
}
