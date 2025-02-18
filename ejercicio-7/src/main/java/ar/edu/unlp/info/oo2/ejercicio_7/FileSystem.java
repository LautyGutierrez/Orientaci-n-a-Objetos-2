package ar.edu.unlp.info.oo2.ejercicio_7;

import java.time.LocalDate;
import java.util.List;

public abstract class FileSystem {
	protected String nombre;
	protected LocalDate fecha;
	
	public FileSystem(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}
	
	public abstract int tamanoTotalOcupado();
	public abstract Archivo archivoMasGrande();
	public abstract Archivo archivoMasNuevo();
	public abstract FileSystem buscar(String nombre);
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public boolean igualNombre(String nombre) {
		return this.nombre.equals(nombre);
	}
	
	public abstract List<FileSystem> buscarTodos(String nombre);
	//public abstract String listadoDeContenido();
	
	protected boolean soyEse(String nombre) {
		return this.nombre.equals(nombre);
	}
	
}
