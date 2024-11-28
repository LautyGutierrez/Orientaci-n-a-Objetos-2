package Ejercicio15_FileManager;

public class FechaCreacionDecorator extends Decorator{
	public FechaCreacionDecorator(FileManager file) {
		super(file);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + "Fecha de creacion: " + this.getFechaCreacion() + "\n";
	}
}
