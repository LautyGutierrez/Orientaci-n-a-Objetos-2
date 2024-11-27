package ar.edu.unlp.info.oo2.ejercicio_15;

public class FechaModificacionDecorator extends Decorator{
	public FechaModificacionDecorator(FileOO2 file) {
		super(file);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + " " + this.getFechaModificación();
	}
}
