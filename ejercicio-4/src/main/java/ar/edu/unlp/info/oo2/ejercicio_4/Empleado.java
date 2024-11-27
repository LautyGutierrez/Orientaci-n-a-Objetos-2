package ar.edu.unlp.info.oo2.ejercicio_4;

public abstract class Empleado {
	private String nombre;
	protected int cantidadHijos;
	protected boolean estaCasado;
	
	public Empleado(String nombre, int cant, boolean estaCasado) {
		this.nombre = nombre;
		this.cantidadHijos = cant;
		this.estaCasado = estaCasado;
	}
	
	public double sueldo() {
		return this.sueldoBasico() + this.sueldoAdicional() - this.descuento();
	}
	
	protected double sueldoBasico() {
		return 20000;
	}
	
	protected double sueldoAdicional() {
		return 2000;
	}
	
	protected double descuento() {
		return this.sueldoBasico() * 0.13 + this.sueldoAdicional() *0.05;
	}
}
