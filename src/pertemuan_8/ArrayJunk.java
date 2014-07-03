package pertemuan_8;

public class ArrayJunk {
	public static void main(String[] args) {
		int[] data;
		String[] nama;
		
		data = new int[10];
		nama = new String[3];
		
		data[0] = 1;
		data[1] = 3;
		for (int i = 2; i <= 9; i++)
			data[i-1] += i;
		
		for (int i = 0; i <= 9; i++)
			System.out.printf("data[%d] = %d\n", i+1, data[i]);
	}
}
