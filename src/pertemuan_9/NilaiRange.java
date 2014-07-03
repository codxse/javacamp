package pertemuan_9;
import java.io.*;

public class NilaiRange {
	private double nilai;
	
	public void setNilai(double n) throws NilaiErrorException {
		if ((n < 0) || (n > 100))
			throw new NilaiErrorException();
		else
			nilai = n;
	}
	
	public double getNilai() {
		return nilai;
	}
	
	public static void main(String[] args) {
		String temp;
		int nilai;
		NilaiRange n1 = new NilaiRange();
		BufferedReader kb;
		kb = new BufferedReader(new InputStreamReader(System.in));
				
		try {
			System.out.print("Nilai: "); 
			temp = kb.readLine();
			nilai = Integer.parseInt(temp);
			n1.setNilai(nilai);
			System.out.println("Get Nilai: " + n1.getNilai());
		} catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		} catch (NilaiErrorException e) {
			System.out.println("Error " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Error " + e.getMessage());
		} finally {
			System.out.println("Done!");
		}
	}
}
