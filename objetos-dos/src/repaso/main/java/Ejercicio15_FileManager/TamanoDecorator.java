package Ejercicio15_FileManager;

public class TamanoDecorator extends Decorator{
	public TamanoDecorator(FileManager file) {
		super(file);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + "Tamano: " + this.getTamano() + "\n";
	}
}
