package Ejercicio21_GenealogiaSalvaje;

import java.time.LocalDate;

public class Mamifero implements MamiferoInterface{
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private MamiferoInterface padre;
	private MamiferoInterface madre;
	
	public Mamifero(String id, String especie, LocalDate fecha, Mamifero padre, Mamifero madre) {
		this.identificador = id;
		this.especie = especie;
		this.fechaNacimiento = fecha;
		this.padre = padre;
		this.madre = madre;
	}
	
	public Mamifero() {
		this.padre = new NullMamifero();
		this.madre = new NullMamifero();
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public MamiferoInterface getPadre() {
		return padre;
	}

	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	public MamiferoInterface getMadre() {
		return madre;
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public MamiferoInterface getAbueloMaterno() {
		return this.madre.getPadre();
	}
	
	public MamiferoInterface getAbuelaMaterna() {
		return this.madre.getMadre();
	}
	
	public MamiferoInterface getAbueloPaterno() {
		return this.padre.getPadre();
	}
	
	public MamiferoInterface getAbuelaPaterna() {
		return this.padre.getMadre();
	}
	
	public Boolean tieneComoAncestroA(MamiferoInterface unMamifero) {
		return this.padre == unMamifero || this.madre == unMamifero || this.getAbuelaMaterna() == unMamifero
				|| this.getAbueloMaterno() == unMamifero || this.getAbuelaPaterna() == unMamifero
				|| this.getAbueloPaterno() == unMamifero;
	}
}
