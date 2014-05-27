package pertemuan_4;

public class WaktuDetik extends Waktu {
	private int detik;
	
	public WaktuDetik() { super(); detik = 0; }
	public WaktuDetik(int j, int m, int d) {
		super(j, m);
		detik = 0;
	}
	public String getWaktu() {
		return super.getWaktu() + ":" + detik;
	}
}
