package ar.edu.unlp.info.oo2.ejercicio_15;

public class ExtensionDecorator extends Decorator{
	public ExtensionDecorator(FileOO2 file) {
		super(file);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + " " + this.getExtension();
	}
}
