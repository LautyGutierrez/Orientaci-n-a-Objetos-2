package Ejercicio11_AdministradorDeProyectos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {
	private LocalDate inicio, fin;
	private String objetivo;
	private int integrantes;
	private double margen;
	private double monto;
	private Etapa etapa;
	
	public Proyecto(LocalDate inicio, LocalDate fin, String objetivo, int cant, double monto) {
		this.inicio = inicio;
		this.fin = fin;
		this.objetivo = objetivo;
		this.integrantes = cant;
		this.monto = monto;
		this.etapa = new EnConstruccion();
		this.margen = 0.07;
	}
	
	public void aprobarEtapa() {
		this.etapa.aprobarEtapa(this);
	}
	
	public double costoDelProyecto() {
		long cantDias = ChronoUnit.DAYS.between(this.inicio, this.fin);
		return this.integrantes * (this.monto * cantDias);
	}
	
	public void setEtapa(Etapa e) {
		this.etapa = e;
	}
	
	public double precioDelProyecto() {
		double costo = this.costoDelProyecto();
		return costo + costo * this.margen;
	}
	
	public void modificarMargen(double margen) {
		this.etapa.modificarMargen(this, margen);
	}
	
	public void setMargen(double margen) {
		this.margen = margen;
	}
	
	public void cancelarProyecto() {
		this.objetivo = "Cancelado";
	}
}
