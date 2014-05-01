package pertemuan_3;

public class Nilai {
	// member/atribut
	private double Quis;
	private double UTS;
	private double UAS;
	
	// method/property
	public double getNA() {
		return 0.2 * Quis + 0.3 * UTS + 0.5 * UAS;
	}
	
	public void setQuis(double nilai) {
		if (nilai >= 0 && nilai <= 100) 
			Quis = nilai;
	}
	
	public void setUTS(double nilai) {
		if (nilai >= 0 && nilai <= 100) 
			UTS = nilai;
	}
	
	public void setUAS(double nilai) {
		if (nilai >= 0 && nilai <= 100) 
			UAS = nilai;
	}
	
	public char getIndex() {
		double NA = getNA();
		if (NA >= 0 && NA <= 45)
			return 'E';
		else if (NA <= 56)
			return 'B';
		else if (NA <= 68)
			return 'C';
		else if (NA <= 80)
			return 'B';
		else
			return 'A';
	}
	
	public String getKeterangan() {
		char idx = getIndex();
		
		switch(idx) {
			case 'A':
				return "Sangat Baik";
			case 'B':
				return "Baik";
			case 'C':
				return "Cukup";
			case 'D':
				return "Kurang";
			default:
				return "Sangat Kurang";
		}
	}
}
