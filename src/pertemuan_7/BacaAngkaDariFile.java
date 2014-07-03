package pertemuan_7;
import java.io.*;

public class BacaAngkaDariFile {
	public static void main(String[] args) {
		String temp;
		int angka;
		int total;
		BufferedReader kb;
		
		try {
			kb = new BufferedReader(new FileReader("/home/nadiar/Apps/javacamp/src/pertemuan_7/data.txt"));
			total = 0;
			
			while ((temp = kb.readLine()) != null) {
				angka = Integer.parseInt(temp);
				total += angka;
				System.out.printf("Angka %3d Total => %4d\n", angka, total);
			}
		} catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}
}
