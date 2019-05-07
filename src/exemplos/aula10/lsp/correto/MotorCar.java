package exemplos.aula10.lsp.correto;

/**
 * Exemplo retirado do artigo do Baeldung.
 * https://www.baeldung.com/solid-principles
 */
public class MotorCar implements Car {
	 
    private Engine engine;
 
    //Constructors, getters + setters
 
    public void turnOnEngine() {
        //turn on the engine!
        engine.on();
    }
 
    public void accelerate() {
        //move forward!
        engine.powerOn(1000);
    }
}
