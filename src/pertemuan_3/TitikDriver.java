package pertemuan_3;

public class TitikDriver {
	public static void main(String[] args) {
		Titik t1, t2;
		
		t1 = new Titik();
		t2 = new Titik(9, 4);
		System.out.print("t1 \t: "); t1.tampil();
		System.out.print("t2 \t: "); t2.tampil();
		
		t1.pindah(5, 1);
		System.out.print("t1 \t: "); t1.tampil();
		
		t1.isiX(8); t1.isiY(6);
		System.out.print("t1 \t: "); t1.tampil();
		
		System.out.print("t2 - t1 : " + t1.jarakKe(t2));
	}
}
