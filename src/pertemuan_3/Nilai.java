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
		Quis = nilai;
	}
	
	public void setUTS(double nilai) {
		UTS = nilai;
	}
	
	public void setUAS(double nilai) {
		UAS = nilai;
	}
}
