package ar.edu.unlp.info.oo2.ejercicio_9;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Excursion {
	private String nombre;
	private LocalDate fechaInicio, fechaFin;
	private String puntoDeEncuentro;
	private double costo;
	private int cupoMinimo, cupoMaximo;
	private List<Usuario> inscriptos, listaDeEspera;
	private Estado estado;
	
	public Excursion(String nombre, LocalDate inicio, LocalDate fin, String encuentro, double costo, int min, int max) {
		this.nombre = nombre;
		this.fechaInicio = inicio;
		this.fechaFin = fin;
		this.puntoDeEncuentro = encuentro;
		this.costo = costo;
		this.cupoMinimo = min;
		this.cupoMaximo = max;
		this.inscriptos = new ArrayList<Usuario>();
		this.listaDeEspera = new ArrayList<Usuario>();
		this.estado = new Provisoria();
	}
	
	public void setEstado(Estado state) {
		this.estado = state;
	}
	
	public String obtenerInformacion() {
		return this.estado.info(this);
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public String getPuntoDeEncuentro() {
		return puntoDeEncuentro;
	}

	public double getCosto() {
		return costo;
	}

	public int getCupoMinimo() {
		return cupoMinimo;
	}
	
	public int getCupoMaximo() {
		return cupoMaximo;
	}

	public List<Usuario> getInscriptos() {
		return inscriptos;
	}

	public void inscribir (Usuario unUsuario) {
		this.estado.inscribir(this, unUsuario);
	}
	
	public List<Usuario> getListaDeEspera(){
		return this.listaDeEspera;
	}
	
	public Estado getEstado() {
		return this.estado;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
