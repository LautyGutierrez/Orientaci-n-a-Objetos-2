package Ejercicio21_GenealogiaSalvaje;

import java.time.LocalDate;

public class NullMamifero implements MamiferoInterface{
	public String getIdentificador() {
		return "";
	}

	public void setIdentificador(String id) {
		
	}

	public String getEspecie() {
		return "";
	}

	public void setEspecie(String especie) {
		
	}

	public LocalDate getFechaNacimiento() {
		return null;
	}

	public void setFechaNacimiento(LocalDate fecha) {
		
	}

	public MamiferoInterface getPadre() {
		return this;
	}

	public void setPadre(Mamifero padre) {
		
	}

	public MamiferoInterface getMadre() {
		return this;
	}

	public void setMadre(Mamifero madre) {
		
	}

	public MamiferoInterface getAbueloMaterno() {
		return this;
	}

	public MamiferoInterface getAbuelaMaterna() {
		return this;
	}

	public MamiferoInterface getAbueloPaterno() {
		return this;
	}

	public MamiferoInterface getAbuelaPaterna() {
		return this;
	}

	public Boolean tieneComoAncestroA(MamiferoInterface unMamifero) {
		return false;
	}
}
