package pertemuan_3;

public class NilaiDriver {
	public static void main(String[] args) {
		Nilai n =  new Nilai();
		n.setQuis(100);
		n.setUTS(100);
		n.setUAS(100);
		System.out.println("NA : " + n.getNA());
		System.out.println(n.getIndex());
		System.out.println(n.getKeterangan());
	}
}
