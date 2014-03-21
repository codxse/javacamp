package pertemuan_1;

import java.util.Locale;

public class PerhitunganGaji {
	public static void main(String[] args) {
		int gajiPokok = 1_000_000;
		double tunjanganKeluarga = 0.2 * gajiPokok;
		int jumlahAnak = 3;
		double tunjanganAnak = 0.05 * gajiPokok * 3;
		double gajiKotor = gajiPokok + tunjanganKeluarga + tunjanganAnak;
		double pajak = 0.15 * gajiKotor;
		double gajiBersih = gajiKotor - pajak;
		
		System.out.printf(new Locale("in","id"),"Tunjangan Keluarga  : Rp. %,12.0f%n", tunjanganKeluarga);
		System.out.println("Bantyak Anak        : "+jumlahAnak);
		System.out.printf(new Locale("in","id"),"Tunjangan Anak      : Rp. %,12.0f%n", tunjanganAnak);
		System.out.printf(new Locale("in","id"),"Gaji Kotor          : Rp. %,12.0f%n", gajiKotor);
		System.out.printf(new Locale("in","id"),"Pajak (15%%)         : Rp. %,12.0f%n", pajak);
		System.out.printf(new Locale("in","id"),"Gaji Bersih         : Rp. %,12.0f%n", gajiBersih);
	}
}
