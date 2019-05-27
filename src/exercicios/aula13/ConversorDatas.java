package exercicios.aula13;

import java.util.Scanner;

public class ConversorDatas {
	
	private String getMes(String mesNumerico) {
		switch(mesNumerico){
			case "01": case "1":
				return "Janeiro";
			case "02": case "2":
				return "Fevereiro";
			case "03": case "3":
				return "Março";
			case "04": case "4":
				return "Abril";
			case "05": case "5":
				return "Maio";
			case "06": case "6":
				return "Junho";
			case "07": case "7":
				return "Julho";
			case "08": case "8":
				return "Agosto";
			case "09": case "9":
				return "Setembro";
			case "10": 
				return "Outubro";
			case "11": 
				return "Novembro";
			case "12": 
				return "Dezembro";
		}
		
		return "";
	}
	
	public String converter(String data) {
		String [] tokens = data.split("/");
		String mes = getMes(tokens[1]);
		return tokens[0].concat(" de ").concat(mes).concat( " de ").concat(tokens[2]);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite sua data no formato dia/mes/ano");
		String input = scanner.nextLine();
		
		ConversorDatas conversorDatas = new ConversorDatas();
		System.out.println(conversorDatas.converter(input));
		scanner.close();
	}
}
