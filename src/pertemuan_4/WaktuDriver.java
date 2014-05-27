package pertemuan_4;

public class WaktuDriver {
	public static void main(String[] args) {
		Waktu w1 = new Waktu();
		System.out.println("W1: " + w1.getWaktu());
		
		Waktu w2 = new Waktu(5, 30);
		System.out.println("W2: " + w2.getWaktu());
		
		WaktuDetik w3 = new WaktuDetik();
		System.out.println("W3: " + w3.getWaktu());
		
		WaktuDetik w4 = new WaktuDetik(3,3,22);
		System.out.println("W4: " + w4.getWaktu());
	}
}
