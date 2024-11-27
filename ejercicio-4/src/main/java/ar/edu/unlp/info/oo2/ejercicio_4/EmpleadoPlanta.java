package ar.edu.unlp.info.oo2.ejercicio_4;

public class EmpleadoPlanta extends Empleado{
	private int cantHijos;
	private int antiguedad;

	public EmpleadoPlanta(String nombre, int cant, boolean estaCasado, int cantHijos, int antiguedad) {
		super(nombre, cant, estaCasado);
		this.antiguedad = antiguedad;
		this.cantHijos = cantHijos;
	}
	
	private double sueldobasico() {
		return 50000;
	}
	
	protected double sueldoAdicional() {
		double sueldo = super.sueldoAdicional() * this.cantHijos + super.sueldoAdicional() * this.antiguedad;
		if(this.estaCasado) sueldo += 5000;
		return  sueldo;
	}
}
