package ar.edu.unlp.info.oo2.ejercicio_15;

import java.time.LocalDate;

public class File implements FileOO2{
	private String nombre, extension, permisos;
	private double tamanio;
	private LocalDate fechaCreacion, fechaModificacion;
	
	public File(String name, String extension, String permisos, double size, LocalDate fc, LocalDate fm) {
		this.nombre = name;
		this.extension = extension;
		this.permisos = permisos;
		this.tamanio = size;
		this.fechaCreacion = fc;
		this.fechaModificacion = fm;
	}
	
	public String prettyPrint() {
		return "Aspectos del archivo: \n";
	}

	public String getNombre() {
		return nombre;
	}

	public String getExtension() {
		return extension;
	}

	public String getPermisos() {
		return permisos;
	}

	public String getTamanio() {
		return Double.toString(tamanio);
	}

	public String getFechaCreacion() {
		return fechaCreacion.toString();
	}

	public String getFechaModificación() {
		return fechaModificacion.toString();
	}
}
