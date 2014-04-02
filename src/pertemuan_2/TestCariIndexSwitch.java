package pertemuan_2;

public class TestCariIndexSwitch {
	public static void main(String[] args) {
		char index;
		index = 'A';
		switch(index) {
			case 'A':
				System.out.println("Sangat Baik");
				break;
			case 'B':
				System.out.println("Baik");
				break;
			case 'C':
				System.out.println("Cukup");
				break;
			case 'D':
				System.out.println("Kurang");
				break;
			case 'E':
				System.out.println("Sangat Kurang");
				break;
			default:
				System.out.println("Tidak Terdefinisi");
		}
	}
}
