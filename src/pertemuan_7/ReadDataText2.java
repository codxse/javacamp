package pertemuan_7;
import java.io.*;

public class ReadDataText2 {
	public static void main(String[] args) {
		String temp;
		double radius, luas;
		BufferedReader kb;
		kb = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("Radius: ");
			temp = kb.readLine();
			radius = Double.parseDouble(temp);
			luas = Math.PI * radius * radius;
			System.out.println("Luas: " + luas);
		} catch (IOException e) {
			System.out.println("Ada error pembacaan data" + e);
		}
	}
}
