package pertemuan_1;

import java.util.Locale;

public class TestFormating {
	public static void main(String[] args) {
		int i=3546264;
		int iMinus=-i;
		System.out.println("i       : "+i);
		System.out.printf("%%d      : %d%n", i);
		System.out.printf("%%10d    : %10d%n", i);
		System.out.printf("%%+10d   : %+10d%n", i);
		System.out.printf("%%+10d   : %+10d%n", iMinus);
		System.out.printf("%%,10d   : %,10d%n", i);
		System.out.printf("%%-10d   : %-10d%n", i);
		double f=5675482.982;
		System.out.println("f       : "+f);
		System.out.printf("%%f      : %f%n", f);
		System.out.printf("%%.2f    : %.2f%n", f);
		System.out.printf("%%12.2f  : %12.2f%n", f);
		System.out.printf("%%,12.2f : %,12.2f%n", f);
		System.out.printf(new Locale("in","id"), "%%,12.2f   : %,12.2f%n", f);
	}
}
