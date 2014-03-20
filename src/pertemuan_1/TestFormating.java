package pertemuan_1;

public class TestFormating {
	public static void main(String[] args) {
		int i=354674;
		int iminus=-i;
		System.out.println("i       : "+i);
		System.out.printf("%%d      : %d%n", i);
		System.out.printf("%%10d    : %10d%n", i);
		System.out.printf("%%+10d   : %+10d%n", i);
		System.out.printf("%%+10d   : %+10d%n", iminus);
		System.out.printf("%%,10d   : %,10d%n", i);
		System.out.printf("%%-10d   : %-10d%n", i);
		double f=5675482.982;
		System.out.println("f       : "+f);
		System.out.printf("%%f      : %f%n", f);
		System.out.printf("%%.2f    : %.2f%n", f);
		System.out.printf("%%12.2f  : %12.2f%n", f);
		System.out.printf("%%,12.2f : %,12.2f%n", f);
	}
}
