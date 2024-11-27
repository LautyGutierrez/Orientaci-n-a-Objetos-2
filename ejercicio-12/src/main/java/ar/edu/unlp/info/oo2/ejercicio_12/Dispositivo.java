package ar.edu.unlp.info.oo2.ejercicio_12;

public class Dispositivo {
	private CRC_Calculator crcCalculator;
	private Ringer ringer;
	private Display display;
	private Connection connection;
	
	public Dispositivo(CRC_Calculator crc, Connection c) {
		this.crcCalculator = crc;
		this.ringer = new Ringer();
		this.display = new Display();
		this.connection = c;
		
	}
	
	public void configurarCRC(CRC_Calculator crc) {
		this.crcCalculator = crc;
	}
	
	public void conectarCon(Connection c) {
		this.connection = c;
		this.display.showBanner(this.connection.pict());
		this.ringer.ring();
	}
	
	public String send(String data) {
		long crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}
}
