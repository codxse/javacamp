package prolan10111121;
/**
 * 
 * @author nadiar
 * 
 */
public class MyStackArray {
	
	private int[] stack;
	private int maks, i = 0;
	/**
	 * maks is the maximum number of array of stack
	 * To create the array of Stack create new objek with element.
	 * Ex: MyStackArray node = new MyStackArray[100];
	 * @param maks
	 */
	public MyStackArray(int maks) {
		this.maks = maks; 
		stack = new int[maks];
	}
	/**
	 * it will pushing new int element to Stach
	 * @param x
	 */
	public void push(int x) {
		if (i < maks) {
			stack[i] = x; i++;
			System.out.println(x + " berhasil ditambahkan ke Stack");
		} else {
			System.out.println("Stack Penuh!");
		}
	}
	/**
	 * it will return last element of Stack
	 * @return last element of Stack
	 */
	public int pop() {
		if (i != 0) {
			int temp = stack[i-1];
			stack[i-1] = 0; i--;
			return temp;
		} else {
			return 0;
		}
	}
	/**
	 * It will retrun String of list of array.
	 */
	public String toString() {
		String temp = "";
		
		for (int i = 0; i < this.i; i++ ) {
			// temp = temp + Integer.toString(stack[i]) + ", ";
			temp += Integer.toString(stack[i]) + ", ";
		}
		return "Stack: " + temp;
	}
	/**
	 * it will retrun boolean value
	 * if stack is full, it will return true
	 * if not, will return false.
	 * @return true if the stack is full and false if not
	 */
	public boolean penuh() {
		if (this.i == maks)
			return true;
		else 
			return false;
	}
	/**
	 * it will return boolean value
	 * if the stack is emphty it will retrun true
	 * if not, it will retrun false. 
	 * @return true if the stack is emphty and false if not
	 */
	public boolean kosong() {
		if (this.i == 0)
			return true;
		else
			return false;
	}
	/**
	 * it will retrun top element of stack
	 * @return top element of stack
	 */
	public int teratas() {
		return stack[maks - 1];
	}
	/**
	 * it reverse the element of Array of Stack
	 */
	public void balikurutan() {
		int[] temp;
		temp = new int[maks];
		int i = 0, j;
		for (j = (this.i - 1); j >= 0; j--, i++) {
			temp[i] = stack[j];
		}
		
		for (j = (this.i - 1); j >= 0; j--) {
			stack[j] = temp[j];
		}
	}
	/**
	 * it will return the number of element in the stack.
	 * @return the number of element in the stack
	 */
	public int banyak() {
		return i;
	}
}
