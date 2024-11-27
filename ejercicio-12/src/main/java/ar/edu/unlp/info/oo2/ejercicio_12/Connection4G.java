package ar.edu.unlp.info.oo2.ejercicio_12;

public class Connection4G {
	private String symb;
	
	public Connection4G(String symb) {
		this.symb = symb;
	}
	
	public String transmit(String data, long crc) {
		return data + " " + crc;
	}
	
	public String getSymb() {
		return this.symb;
	}
	
	
}
