package exemplos.aula10.lsp.incorreto;

public class ElectricCar implements Car {
	 
    public void turnOnEngine() {
        throw new AssertionError("I don't have an engine!");
    }
 
    public void accelerate() {
        //this acceleration is crazy!
    }
}
