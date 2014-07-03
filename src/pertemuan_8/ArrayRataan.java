package pertemuan_8;

public class ArrayRataan {
	public static void main(String[] args) {
		int[] data = {5,9,13,21,4};
		double total = 0;
		
		for (int i = 0; i < data.length; i++) {
			total += data[i];
			System.out.println(data[i]);
		}
		
		System.out.println("Total: " + total);
		System.out.println("Banyak Data: " + data.length);
		System.out.println("Rataan: " + total/data.length);
	}
}
