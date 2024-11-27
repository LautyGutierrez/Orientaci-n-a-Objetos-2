package ar.edu.unlp.info.oo2.ejercicio_15;

public class TamanioDecorator extends Decorator{
	public TamanioDecorator(FileOO2 file) {
		super(file);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + " " + this.getTamanio();
	}
}
