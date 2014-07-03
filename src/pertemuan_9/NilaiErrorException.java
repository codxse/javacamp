package pertemuan_9;

public class NilaiErrorException extends Exception {
	public String getMessage() {
		return "Nilai hanya boleh 0 sampai 100";
	}
}
