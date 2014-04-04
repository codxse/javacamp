package pertemuan_3;

public class TestString {
	public static void main(String[] args) {
		String nama = "Universitas Komputer Indonesia";
		
		System.out.println("Isi String \t: " + nama);
		System.out.println("Panjang \t: " + nama.length());
		System.out.println("Upper Case \t: " + nama.toUpperCase());
		System.out.println("Lower Case \t: " + nama.toLowerCase());
		System.out.println("? = UNIKOM \t: " + nama.equals("UNIKOM"));
	}
}
