package ar.edu.unlp.info.oo2.ejercicio_4;

public class EmpleadoTemporario extends Empleado{
	private int cantHoras;
	
	public EmpleadoTemporario(String nombre, int cant, boolean estaCasado, int cantHoras) {
		super(nombre, cant, estaCasado);
		this.cantHoras = cantHoras;
	}
	
	protected double sueldoBasico() {
		return super.sueldoBasico() + this.cantHoras * 300;
	}
	
	protected double sueldoAdicional() {
		double sueldo = super.sueldoAdicional() * this.cantidadHijos;
		if(this.estaCasado) sueldo += 5000;
		return sueldo;
	}

}
