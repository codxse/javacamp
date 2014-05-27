package pertemuan_4;

public class BinatangDriver {
	public static void main(String[] args) {
		Binatang a = new Binatang();
		
		a.setNama("Kuda Lumping");
		a.bersuara();
		
		Burung b = new Burung();
		b.setNama("Garuda");
		b.bersuara();
		b.bertelur();
		b.terbang();
		
		Mamalia c = new Mamalia();
		c.setNama("Kuda Zebra");
		System.out.println(c.getNama());
		c.berjalan();
		c.melahirkan();
		
		Elang d = new Elang();
		d.setNama("Hawk");
		System.out.println(d.getNama());
		d.bersuara();
		d.bertelur();
		d.terbang();
	}
}
