package ar.edu.unlp.info.oo2.ejercicio_4;

public class EmpleadoPasante extends Empleado{
	private int cantExamenes;
	
	public EmpleadoPasante(String nombre, int cant, boolean estaCasado, int examenes) {
		super(nombre, cant, estaCasado);
		this.cantExamenes = examenes;
	}
	
	protected double sueldoAdicional() {
		return super.sueldoAdicional() * this.cantExamenes;
	}
}
