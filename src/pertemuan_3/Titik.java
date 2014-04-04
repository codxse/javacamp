package pertemuan_3;

class Titik {
	// attribut
	double x, y;
	
	// konstruktor
	Titik() { x = 0; y = 0; }
	Titik (double x1, double y1) { x = x1; y = y1; }
	
	// method
	void tampil() { System.out.println("(" + x + ", " + y + ")"); }
	void pindah(double x1, double y1) { x = x1; y = y1; }
	void isiX(double x1) { x = x1; }
	void isiY(double y1) { y = y1; }
	
	double jarakKe (double x1, double y1) {
		// teorema pytagoras
		return Math.pow(Math.pow(x-x1, 2) + Math.pow(y-y1, 2), 0.5);
	}
	
	double jarakKe (Titik t2) {
		double jarak;
		jarak = Math.pow(Math.pow(x-t2.x, 2) + Math.pow(y-t2.y, 2), 0.5);
		return jarak;
	}
	
}
