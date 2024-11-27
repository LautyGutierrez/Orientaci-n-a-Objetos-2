package ar.edu.unlp.info.oo2.ejercicio_12;

public class CRC16_Calculator extends CRC_Calculator{
	public CRC16_Calculator() {
		
	}
	
	public long crcFor(String data) {
		int crc = 0xFFFF;
		for (int j = 0; j < data.getBytes().length; j++) {
			crc = ((crc >>> 8) | (crc << 8)) & 0xffff;
			crc ^= (data.getBytes()[j] & 0xff);
			crc ^= ((crc & 0xff) >> 4);
			crc ^= (crc << 12) & 0xffff;
			crc ^= ((crc & 0xFF) << 5) & 0xffff;
		}
		crc &= 0xffff;
		return crc;
	}
}
