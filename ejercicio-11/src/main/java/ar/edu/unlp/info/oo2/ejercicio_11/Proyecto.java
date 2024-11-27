package ar.edu.unlp.info.oo2.ejercicio_11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {
	private LocalDate inicio, fin;
	private String objetivo;
	private int integrantes;
	private double sueldo, margen;
	private Etapa etapa;
	
	public Proyecto(LocalDate inicio, LocalDate fin, String objetivo, int cantI, double sueldo, double margen) {
		this.inicio = inicio;
		this.fin = fin;
		this.objetivo = objetivo;
		this.integrantes = cantI;
		this.sueldo = sueldo;
		this.margen = 0.07;
		this.etapa = new EnConstruccion();
	}
	
	public void aprobarEtapa() {
		this.etapa.aprobarEtapa(this);
	}
	
	public void setEtapa(Etapa e) {
		this.etapa = e;
	}
	
	public boolean precioNoEsCero() {
		return this.precioDelProyecto() != 0;
	}
	public double costoDeProyecto() {
		return (double) (ChronoUnit.DAYS.between(inicio, fin) + 1) * this.sueldo;
	}
	
	public double precioDelProyecto() {
		return this.costoDeProyecto() * this.margen;
	}
	
	public void modificarMargenDeGanancia(double valor){
		this.etapa.modificarMargenDeGanancia(this, valor);
	}
	
	public void setMargen(double valor) {
		this.margen = valor;
	}
	
	public void cancelarProyecto() {
		this.objetivo = "Cancelado";
		this.etapa = new Cancelado();
	}
}
