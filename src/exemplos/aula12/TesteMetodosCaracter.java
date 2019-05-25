package exemplos.aula12;

import java.util.Scanner;

public class TesteMetodosCaracter{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // cria scanner
        System.out.println("Escreva um caractere");
        String input = scanner.next();
        char c = input.charAt(0); // obtém caractere de entrada
        
        // exibe informações de caractere
        System.out.printf("é definido: %b%n", Character.isDefined(c));
        System.out.printf("é um digito: %b%n", Character.isDigit(c));
        System.out.printf("é um caractere inicial permitido em um identificador java: %b%n",
        Character.isJavaIdentifierStart(c));
        System.out.printf("é um caractere permitido em um identificador java: %b%n",
        Character.isJavaIdentifierPart(c));
        System.out.printf("é uma letra: %b%n", Character.isLetter(c));
        System.out.printf(
        "é uma letra ou digito: %b%n", Character.isLetterOrDigit(c));
        System.out.printf(
        "está em minúsculo: %b%n", Character.isLowerCase(c));
        System.out.printf(
        "está em maiúsculo: %b%n", Character.isUpperCase(c));
        System.out.printf(
        "maiúsculo: %s%n", Character.toUpperCase(c));
        System.out.printf("minúsculo: %s%n", Character.toLowerCase(c));
        
        int radix = 16;
        System.out.println(Character.digit(c, radix));
        
        scanner.close();
        
        
    }

}
