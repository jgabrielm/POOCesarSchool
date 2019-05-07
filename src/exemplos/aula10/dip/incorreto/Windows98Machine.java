package exemplos.aula10.dip.incorreto;

/**
 * Exemplo retirado do artigo do Baeldung.
 * https://www.baeldung.com/solid-principles
 */
public class Windows98Machine {
	 
    private final StandardKeyboard keyboard;
    private final Monitor monitor;
 
    public Windows98Machine() {
        monitor = new Monitor();
        keyboard = new StandardKeyboard();
    }
 
}
