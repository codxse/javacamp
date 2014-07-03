package pertemuan_9;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContohException1 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int b1, b2, hasil;
		
		try {
			System.out.print("Bilangan 1: "); b1 = kb.nextInt();
			System.out.print("Bilangan 2: "); b2 = kb.nextInt();
			hasil = b1/b2;
			System.out.println("Hasil: " + hasil);
		} catch (InputMismatchException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			kb.close();
			System.out.println("Done!");
		}
		 
	}
}
