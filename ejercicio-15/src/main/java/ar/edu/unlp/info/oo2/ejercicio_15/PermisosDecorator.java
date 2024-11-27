package ar.edu.unlp.info.oo2.ejercicio_15;

public class PermisosDecorator extends Decorator{
	public PermisosDecorator(FileOO2 file) {
		super(file);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + " " + this.getPermisos();
	}
}
