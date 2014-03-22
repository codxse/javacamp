package pertemuan_1;

import java.util.Locale;

public class PerhitunganRental {
	public static void main(String[] args) {
		int hargaPerJam = 1000;
		int jamMasuk = 9;
		int menitMasuk = 50;
		int jamKeluar = 12;
		int menitKeluar = 30;
		
		int konvrMenitMasuk = jamMasuk * 60 + menitMasuk;
		int konvrMenitKeluar = jamKeluar * 60 + menitKeluar;
		
		int lamaJamRental = (konvrMenitKeluar - konvrMenitMasuk) / 60;
		int sisaMenitRental = (konvrMenitKeluar - konvrMenitMasuk) % 60;
		
		float menitMasukFloat = konvrMenitMasuk;
		float menitKeluarFloat = konvrMenitKeluar;
		float lamaRental = (menitKeluarFloat - menitMasukFloat) / 60;
		float biaya = hargaPerJam * lamaRental;
		
		System.out.printf(new Locale("in","id"),"Lama rental adalah %d" 
				+" jam %d menit (%2.2f jam) dengan biaya Rp. %,3.2f,-.",
				lamaJamRental, sisaMenitRental, lamaRental, biaya); 
	}
}
