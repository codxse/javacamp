package pertemuan_8;

public class ForeachArray {
	public static void main(String[] args) {
		int[] dataInt = {4, 5, 1, 8, 12};
		double[] dataDouble = {1.1, 2.3, 4.1, 3.8, 9.4};
		double total = 0;
		
		for (int i : dataInt)
			System.out.println(i);

		for (double pecahan:dataDouble)
			total += pecahan;
		
		System.out.println("Total: " +total);
	}
}
