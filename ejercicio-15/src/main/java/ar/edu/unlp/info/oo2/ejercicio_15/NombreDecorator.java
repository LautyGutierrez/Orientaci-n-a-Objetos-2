package ar.edu.unlp.info.oo2.ejercicio_15;

public class NombreDecorator extends Decorator{
	public NombreDecorator(FileOO2 file) {
		super(file);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + " " + this.getNombre();
	}
}
