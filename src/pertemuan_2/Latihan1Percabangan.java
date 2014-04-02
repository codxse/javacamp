package pertemuan_2;

public class Latihan1Percabangan {
	public static void main(String[] args) {
		byte tujuan = 2;
		byte kelas = 1;
		int harga;
		int tiket;
		byte i = 15;
		String kota;
		String kelasName;
		
		switch(tujuan){
			case 1:
				kota = "Jakarta";
				if (kelas == 1) {
					harga = 70_000;
					kelasName = "Eksekutif";
				} else if (kelas == 2) {
					harga = 40_000;
					kelasName = "Bisnis";
				} else { 
					harga = 10_000;
					kelasName = "Ekonomi";
				}
				break;
			case 2:
				kota = "Yogyakarta";
				if (kelas == 1) {
					harga = 80_000;
					kelasName = "Eksekutif";
				} else if (kelas == 2) {
					harga = 50_000;
					kelasName = "Bisnis";
				} else { 
					harga = 20_000;
					kelasName = "Ekonomi";
				}
				break;
			case 3:
				kota = "Surabaya";
				if (kelas == 1) {
					harga = 90_000;
					kelasName = "Eksekutif";
				} else if (kelas == 2) {
					harga = 60_000;
					kelasName = "Bisnis";
				} else { 
					harga = 30_000;
					kelasName = "Ekonomi";
				}
				break;	
			default:
				kota = "Tidak Ada";
				harga = 0;
				kelasName = "Tida Ada";
		}
		
		tiket = harga * (i - (i / 10));
		System.out.println("Tujuan \t\t\t: " + kota);
		System.out.println("Kelas \t\t\t: " + kelasName);
		System.out.println("Harga Tiket \t\t: Rp. " + harga);
		System.out.println("Banyak Tiket Kena Biaya : " + (i - (i / 10)) +
			" (" + (i / 10) + " tiket tidak dihitung)");
		System.out.println("Total Bayar \t\t: Rp. " + tiket);
			
	}
}
