package pertemuan_3;

public class KalkulatorDriver {
	public static void main(String[] args) {
		Kalkulator c = new Kalkulator();
		
		c.isiOperan1(5);
		c.isiOperan2(2);
		
		System.out.println(c.bagi());
		System.out.println(c.kali());
		System.out.println(c.kurang());
		System.out.println(c.pangkat());
		System.out.println(c.tambah());
	}
}
