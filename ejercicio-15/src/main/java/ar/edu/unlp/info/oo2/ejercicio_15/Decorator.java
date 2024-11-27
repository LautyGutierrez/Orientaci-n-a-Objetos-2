package ar.edu.unlp.info.oo2.ejercicio_15;

public abstract class Decorator implements FileOO2{
	private FileOO2 file;
	
	public Decorator(FileOO2 file) {
		this.file = file;
	}
	
	public String prettyPrint() {
		return this.file.prettyPrint();
	}
	
	public String getNombre() {
		return this.file.getNombre();
	}
	
	public String getExtension() {
		return this.file.getExtension();
	}
	
	public String getPermisos() {
		return this.file.getPermisos();
	}
	
	public String getTamanio() {
		return this.file.getTamanio();
	}
	
	public String getFechaCreacion() {
		return this.file.getFechaCreacion();
	}
	
	public String getFechaModificación() {
		return this.file.getFechaModificación();
	}
}
