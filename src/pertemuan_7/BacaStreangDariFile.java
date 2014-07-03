package pertemuan_7;
import java.io.*;

public class BacaStreangDariFile {
	public static void main(String[] args) {
		String temp;
		int baris;
		BufferedReader kb;
		
		try {
			kb = new BufferedReader(new FileReader("lagu.txt"));
			baris = 0;
			
			while ((temp = kb.readLine()) != null)
				System.out.printf("%3d >> %s\n", ++baris, temp);
		} catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}
}
