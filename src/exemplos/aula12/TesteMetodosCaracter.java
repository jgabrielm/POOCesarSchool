package exemplos.aula12;

import java.util.Scanner;

public class TesteMetodosCaracter{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // cria scanner
        System.out.println("Escreva um caractere");
        String input = scanner.next();
        char c = input.charAt(0); // obt�m caractere de entrada
        
        // exibe informa��es de caractere
        System.out.printf("� definido: %b%n", Character.isDefined(c));
        System.out.printf("� um digito: %b%n", Character.isDigit(c));
        System.out.printf("� um caractere inicial permitido em um identificador java: %b%n",
        Character.isJavaIdentifierStart(c));
        System.out.printf("� um caractere permitido em um identificador java: %b%n",
        Character.isJavaIdentifierPart(c));
        System.out.printf("� uma letra: %b%n", Character.isLetter(c));
        System.out.printf(
        "� uma letra ou digito: %b%n", Character.isLetterOrDigit(c));
        System.out.printf(
        "est� em min�sculo: %b%n", Character.isLowerCase(c));
        System.out.printf(
        "est� em mai�sculo: %b%n", Character.isUpperCase(c));
        System.out.printf(
        "mai�sculo: %s%n", Character.toUpperCase(c));
        System.out.printf("min�sculo: %s%n", Character.toLowerCase(c));
        
        int radix = 16;
        System.out.println(Character.digit(c, radix));
        
        scanner.close();
        
        
    }

}
