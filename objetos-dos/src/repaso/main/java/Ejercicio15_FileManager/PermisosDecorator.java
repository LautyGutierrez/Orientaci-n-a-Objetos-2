package Ejercicio15_FileManager;

public class PermisosDecorator extends Decorator{
	public PermisosDecorator(FileManager file) {
		super(file);
	}
	
	public String prettyPrint() {
		return super.prettyPrint() + "Permisos: " + this.getPermisos() + "\n";
	}
}
