package pertemuan_7;
import java.io.*;

public class ReadDataText1 {
	public static void main(String[] args) {
		String nama;
		BufferedReader kb;
		kb = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Nama : ");
			nama = kb.readLine();
			System.out.println("Selamat datang " + nama);
		} catch (IOException e) {
			System.out.println("Ada error pembacaan data");
		}
	}
}
