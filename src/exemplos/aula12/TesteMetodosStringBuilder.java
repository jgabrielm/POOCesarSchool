package exemplos.aula12;

public class TesteMetodosStringBuilder{

    public static void main(String[] args){
        
        //capacaity, ensureCapacity e length
        StringBuilder builder = new StringBuilder("Test builder");
        System.out.println(builder.length());
        System.out.println(builder.capacity());
        
        builder.ensureCapacity(200);
        System.out.println(builder.capacity());
        
        //charAt, setCharAt, getChars, reverse
        System.out.println(builder.charAt(0));
        builder.setCharAt(2, 'z');
        System.out.println(builder);
        
        char [] caracteres = new char[5];
        builder.getChars(0, 5, caracteres, 0);
        
        for(char c : caracteres){
            System.out.print(c);
        }
        System.out.println();
        
        builder.reverse();
        System.out.println(builder);
        builder.reverse();
        
        //append, insert, delete, deleteCharAt
        Object o = " cde ";
        Integer x = 10;
        double z = 2.5;
        
        builder.append(" abc").append(o).append(x).append(" ").append(z);        
        System.out.println(builder);
        
        builder.insert(10, " efg ").insert(0,caracteres,0,5);
        System.out.println(builder);
        
        builder.delete(0, 10);
        System.out.println(builder);
        
        builder.deleteCharAt(0);
        System.out.println(builder);
    }
}
