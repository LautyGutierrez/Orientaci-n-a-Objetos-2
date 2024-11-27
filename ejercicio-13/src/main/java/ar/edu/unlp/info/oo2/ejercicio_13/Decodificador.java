package ar.edu.unlp.info.oo2.ejercicio_13;

import java.util.List;
import java.util.ArrayList;

public class Decodificador {
	private List<Pelicula> grillaDePeliculas;
	private List<Pelicula> reproducidas;
	private TipoSugerencia sugerencia;
	
	public Decodificador(TipoSugerencia sugerencia) {
		this.grillaDePeliculas = new ArrayList<Pelicula>();
		this.reproducidas = new ArrayList<Pelicula>();
		this.sugerencia = sugerencia;
	}
	
	public void agregarPelicula(Pelicula peli) {
		this.grillaDePeliculas.add(peli);
	}
	
	public void reproducirPelicula(Pelicula peli) {
		if(this.grillaDePeliculas.contains(peli)) {
			this.grillaDePeliculas.remove(peli);
			this.reproducidas.add(peli);
		}
	}
	
	public void configurarSugerencia(TipoSugerencia sugerencia) {
		this.sugerencia = sugerencia;
	}
	
	public List<Pelicula> sugerirPeliculas(){
		return this.sugerencia.sugerir(this.reproducidas, this.grillaDePeliculas);
	}
}
