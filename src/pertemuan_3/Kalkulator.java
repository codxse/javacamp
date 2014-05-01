package pertemuan_3;

public class Kalkulator {
	private double op1;
	private double op2;
	
	Kalkulator() { op1 = 0; op2 = 0; }
	Kalkulator(double x1, double x2) { op1 = x1; op2 = x2; }
	
	public void isiOperan1(double x) { op1 = x; }
	public void isiOperan2(double x) { op2 = x; }
	
	double tambah() { return op1 + op2; }
	double kurang() { return op1 - op2; }
	double kali() { return op1 * op2; }
	double bagi() { return op1 / op2; }
	double pangkat() { return Math.pow(op1, op2); } 
	
}
