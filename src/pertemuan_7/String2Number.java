package pertemuan_7;

public class String2Number {
	public static void main(String[] args) {
		byte b;
		short s;
		int i;
		long l;
		double d;
		float f;
		
		String strnumb = "100";
		b = Byte.parseByte(strnumb);
		b++;
		s = Short.parseShort(strnumb);
		i = Integer.parseInt(strnumb + "33");
		l = Long.parseLong(strnumb + "121321314241");
		d = Double.parseDouble("48.2122222");
		f = Float.parseFloat("12.345");
		
		System.out.println("Byte: " + b);
		System.out.println("Short: " + s);
		System.out.println("Int: " + i);
		System.out.println("Long: " + l);
		System.out.println("Double: " + d);
		System.out.println("Float: " + f);
	}
}
