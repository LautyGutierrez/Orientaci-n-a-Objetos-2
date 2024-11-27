package ar.edu.unlp.info.oo2.ejercicio_13;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Pelicula {
	private String nombre;
	private int estreno;
	private List<Pelicula> similares;
	private double puntaje;
	
	public Pelicula(String nombre, int fecha, double p) {
		this.nombre = nombre;
		this.estreno = fecha;
		this.puntaje = p;
		this.similares = new ArrayList<Pelicula>();
	}
	
	public void agregarPeliculaSimilar(Pelicula peli) {
		if(!this.similares.contains(peli)) {
			this.similares.add(peli);
			peli.agregarPeliculaSimilar(this);
		}
	}
	public boolean esSimilar(Pelicula peli) {
		return this.similares.contains(peli);
	}
	
	public int estreno() {
		return this.estreno;
	}
	
	public double rating() {
		return this.puntaje;
	}
	
	public List<Pelicula> getSimilares(){
		return this.similares;
	}
}
