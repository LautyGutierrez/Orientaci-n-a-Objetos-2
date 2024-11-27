package ar.edu.unlp.info.oo2.ejercicio_15;

public class FechaCreacionDecorator extends Decorator{
	public FechaCreacionDecorator(FileOO2 file) {
		super(file);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + " " + this.getFechaCreacion();
	}
}
