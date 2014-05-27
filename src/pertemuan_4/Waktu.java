package pertemuan_4;

public class Waktu {
	private int jam;
	private int menit;
	
	public Waktu() { jam = 0; menit = 0; }
	public Waktu(int j, int m) { jam = j; menit = m; }
	
	public final void setJam(int jam) { this.jam = jam; }
	public void setMenit(int menit) { this.menit = menit; }
	public String getWaktu() {
		return jam + ":" + menit;
	}
}
