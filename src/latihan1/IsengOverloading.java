package latihan1;

public class IsengOverloading {
	public static void main(String[] Args) {
		System.out.println(max(2, 4));
		System.out.println(max(2.2, 2.22));
		System.out.println(max(5, 3.4));
	}
	
	public static int max(int a, int b) {
		if (a > b)
			return a;
		else if (b > a)
			return b;
		else
			return 0;
	}
	
	public static double max(double a, double b) {
		if (a > b)
			return a;
		else if (b > a)
			return b;
		else
			return 0;
	}
}


