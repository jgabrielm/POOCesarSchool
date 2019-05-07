package exemplos.aula10.dip.correto;

/**
 * Exemplo retirado do artigo do Baeldung.
 * https://www.baeldung.com/solid-principles
 */
public class Windows98Machine{
	 
    private final Keyboard keyboard;
    private final Monitor monitor;
 
    public Windows98Machine(Monitor monitor) {
        this.keyboard = new StandardKeyboard();
        this.monitor = monitor;
    }
}
