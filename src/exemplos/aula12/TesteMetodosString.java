package exemplos.aula12;

public class TesteMetodosString {

	public static void main(String[] args) {
		String s1 = "olá mundo!!!";
		char[] charArray = new char[5];

		// uso de length
		System.out.printf("s1: %s", s1); 
		System.out.printf("%nComprimento de s1: %d", s1.length());

		System.out.printf("%nA string reversa é: ");

		//uso do char at
		for (int count = s1.length() - 1; count >= 0; count--) {
			System.out.printf("%c ", s1.charAt(count));
		}

		//uso do get chars
		s1.getChars(0, 5, charArray, 0);
		System.out.printf("%nO array de chars é: ");

		for (char character : charArray) {
			System.out.print(character);
		}
		System.out.println();

		//equals e ==
		String s2 = "Teste";
		String s3 = "Teste", s4 = s3;
		String s5 = new String(s4);
		String s6 = new String("Teste");

		System.out.println(s2.equals("Teste"));
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s4));
		System.out.println(s2.equals(s5));
		System.out.println(s2.equals(s6));

		System.out.println(s2 == s3);
		System.out.println(s2 == s4);
		System.out.println(s2 == s5);
		System.out.println(s2 == s6);

		//equalsIgnoreCase
		String s7 = "testE";
		System.out.println(s7.equalsIgnoreCase(s5));

		//compareTo
		String s8 = "aaa";
		String s9 = "aab";
		String s10 = "aaa";

		System.out.println(s8.compareTo(s9));
		System.out.println(s9.compareTo(s10));
		System.out.println(s8.compareTo(s10));

		//regionMatches
		System.out.println(s8.regionMatches(0, s9, 0, 2));
		System.out.println(s8.regionMatches(0, s9, 0, 3));

		//Starts with
		String[] strings = {"started", "starting", "ended", "ending"};

		// testa o método startsWith
		for (String string : strings)
		{
			if (string.startsWith("st")) {
				System.out.printf("\"%s\" começa com \"st\"%n", string);
			}
		}

		System.out.println();

		// testa o método startsWith iniciando da posição 2 de string
		for (String string : strings)
		{
			if (string.startsWith("art", 2)) {
				System.out.printf("\"%s\" começa com \"art\" na posição 2%n", string); System.out.println();
			}
		}
		
		//endsWith
		for (String string : strings)
		{
			if (string.endsWith("ed"))
				System.out.printf("\"%s\" terminam com \"ed\"%n", string);
		}
		
		//teste indexOf e lastIndexof
		String letras = "abcdefghijklmonpqrstuvwxyzabc";
		
		System.out.println(letras.indexOf('a'));
		System.out.println(letras.indexOf('z'));
		System.out.println(letras.indexOf('5'));
		System.out.println(letras.indexOf('a', 10));
		
		System.out.println(letras.indexOf("abc"));
		System.out.println(letras.indexOf("abc", 5));
		
		System.out.println(letras.lastIndexOf("abc"));
		System.out.println(letras.lastIndexOf('c'));
		System.out.println(letras.lastIndexOf('c', 10));
		
		//substring
		System.out.println(letras.substring(1, 5));
		System.out.println(letras.substring(10));
		
		//concatenação
		String feliz = "Feliz ";
		String aniversario = "Aniversario!";
		System.out.println(feliz.concat(aniversario));
		System.out.println(feliz);
		
		//replace e replaceAll
		String hello = "hello";
		System.out.println(hello.replace('l', 'L'));
		System.out.println(hello.replaceAll("llo", "LLO"));
		System.out.println(hello);
		
		//toLowerCase, toUpperCase, trim e toCharArray
		String test = "  Teste de Letras  ";
		System.out.println(test.toLowerCase());
		System.out.println(test.toUpperCase());
		System.out.println(test.trim());
		char [] caracteres = test.toCharArray();
		
		for(char a : caracteres) {
			System.out.println(a);
		}
		
		//split
		String tk = "a;b;cd;ef";
		String [] tokens = tk.split(";");
		
		for(String t : tokens) {
			System.out.println(t);
		}

		//valueOf
		boolean f = false;
		float fl = 0.000f;
		long l = 100000l;
		Object o = "abc";
		
		System.out.println(String.valueOf(f));
		System.out.println(String.valueOf(fl));
		System.out.println(String.valueOf(l));
		System.out.println(String.valueOf(caracteres));
		System.out.println(String.valueOf(o));
	}
}