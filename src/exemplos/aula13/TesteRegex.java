package exemplos.aula13;

import java.util.regex.Pattern;

public class TesteRegex{
    
    public static void main(String[] args){
        String regexEmail = "[\\w]+@[\\w]+.com";
        String email = "aa@aaa.com";
        String email2 = "aa@aaa.com.br";
        
        System.out.println(email.matches(regexEmail));
        System.out.println(email2.matches(regexEmail));
        
        String regexCEP = "[\\d]{5}-[0-9]{3}";
        System.out.println(Pattern.matches(regexCEP, "50670-380"));
        System.out.println(Pattern.matches(regexCEP, "51030-38"));
    }

}
