package ar.edu.unlp.info.oo2.ejercicio_7;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Archivo extends FileSystem{
	public int tamano;
	
	public Archivo(String nombre,LocalDate fecha, int tamano) {
		super(nombre,fecha);
		this.tamano = tamano;
	}
	
	public int tamanoTotalOcupado() {
		return this.tamano;
	}
	
	public Archivo archivoMasGrande() {
		return this;
	}
	
	public Archivo archivoMasNuevo() {
		return this;
	}
	
	public FileSystem buscar(String nombre) {
		if(this.soyEse(nombre)) return this;
		return null;
	}
	
	public List<FileSystem> buscarTodos(String nombre){
		if(this.soyEse(nombre)) {
			List lista = new ArrayList<>();
			lista.add(this);
			return lista;
		}
		return null;
	}
	
}
