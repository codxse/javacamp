package pertemuan_2;

public class OperatorTanyaIf {
	public static void main(String[] args) {
		char menikah = 'Y';
		double gajiPokok = 1_000_000, tunjangan;
		tunjangan = (menikah == 'Y')? 0.2 * gajiPokok: 0;
		/*
		 * Jika sudah menikah, tunjangan 20% gajiPokok
		 * Jike belum, tunjangan 0
		 */
		System.out.println("Gaji Pokok: " + gajiPokok);
		System.out.println("Tunjangan: " + tunjangan);
	}
}
