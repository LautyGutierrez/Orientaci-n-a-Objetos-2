package Ejercicio4_CalculoDeSueldos;

public abstract class Empleado {
	private boolean estaCasado;
	private int cantHijos;
	
	public Empleado() {
		this.estaCasado = false;
		this.cantHijos = 0;
	}
	
	public double descuento() {
		return this.basico() * 0.13 + this.adicional() * 0.05;
	}
	
	public double basico() {
		return 20000;
	}
	
	public double adicional() {
		double sueldo = this.cantHijos * 2000;
		if(this.estaCasado) sueldo += 5000;
		return sueldo;
	}
	
	public void setEstaCasado() {
		this.estaCasado = !this.estaCasado;
	}
	
	public void setCantHjos(int cant) {
		this.cantHijos = cant;
	}
}
