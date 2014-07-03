package pertemuan_8;
import java.util.*;

public class ClassArray {
	public static void main(String[] args) {
		int[] data = {5, 9, 13, 23, 21, 4, 57, 2, 4, 3};
		System.out.println("Data sebelum diurutkan");
		
		for(int i=0; i < data.length; i++)
			System.out.print(data[i] + " ");
		
		System.out.println();
		Arrays.sort(data);
		System.out.println("Data setelah diurutkan");
	
		for(int i=0; i < data.length; i++)
			System.out.print(data[i] + " ");
		
		System.out.println();
		int posisi;
		posisi = Arrays.binarySearch(data, 13);
		
		if (posisi >= 0)
			System.out.println("Data ditemukan di posisi: " +posisi);
		else
			System.out.println("Data tidak ditemukan");
	}
}
