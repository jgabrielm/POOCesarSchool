package exercicios.aula13;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validador{
    
    public static boolean CPFValido(CharSequence cpf){
        String CPFRegex = "[\\d]{3}.[\\d]{3}.[\\d]{3}-[\\d]{2}";
        return Pattern.matches(CPFRegex, cpf);
    }
    
    public static boolean placaDoCarroValida(CharSequence placa){
        String regexPlaca = "[A-Z]{3}[0-9]{4}";
        return Pattern.matches(regexPlaca, placa);
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu CPF");
        CharSequence CPF = scanner.nextLine();
        
        StringBuilder builder = new StringBuilder("Seu CPF �: ");
        builder.append(Validador.CPFValido(CPF) ? "v�lido" : "inv�lido");
        System.out.println(builder);
        
        System.out.println("Digite a placa do seu Carro");
        CharSequence placa = scanner.nextLine();
        
        builder = new StringBuilder("Sua placa �: ");
        builder.append(Validador.placaDoCarroValida(placa) ? "v�lida" : "inv�lida");
        System.out.println(builder);
        scanner.close();
    }

}
