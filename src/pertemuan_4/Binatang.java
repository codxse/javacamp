package pertemuan_4;

public class Binatang {
	//member/atribut
	private String name;
	
	//method/property
	public void setNama(String n) { name = n; }
	public String getNama() { return name; }
	public void bersuara() {
		System.out.println(getNama() + " sedang bersuara.");
	}
}
