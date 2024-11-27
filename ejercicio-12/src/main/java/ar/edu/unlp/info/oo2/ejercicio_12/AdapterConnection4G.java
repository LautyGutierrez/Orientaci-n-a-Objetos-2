package ar.edu.unlp.info.oo2.ejercicio_12;

public class AdapterConnection4G implements Connection{
	private Connection4G connection4G;
	
	public AdapterConnection4G(String symb) {
		this.connection4G = new Connection4G(symb);
	}
	
	public String sendData(String data, long crc) {
		return this.connection4G.transmit(data, crc);
	}
	
	public String pict() {
		return this.connection4G.getSymb();
	}
}
