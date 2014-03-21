package pertemuan_1;

public class TestInteger {
	public static void main(String[] args) {
		byte b;
		short s;
		int i;
		long l;
		b = 120;
		s = 32767;
		i = 1_000_000_000;
		l = 9000000000000L;
		System.out.println("byte    : "+b);
		System.out.println("short   : "+s);
		System.out.println("int     : "+i);
		System.out.println("long    : "+l);
		System.out.println("byte binary   : 0b"+Integer.toBinaryString(b));
		System.out.println("short octal  : 0"+Integer.toOctalString(s));
		System.out.println("int Hexa    : 0x"+Integer.toHexString(i));
	}
}
