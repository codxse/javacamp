package prolan10111121;
/**
 * 
 * @author nadiar
 * MyQueueArray is class of Queue array int data type
 * this queue array not yet perfect still a lot of bugs
 */
public class MyQueueArray {
	
	private int[] queue;
	private int maks;
	private int j = 0, i = 0, iPrint;
	
	/**
	 * Default constructor which constuct new int arrayQueue whith int argument as parameter 
	 * the class is MyQueueArray
	 * Construct:
	 * we want create new object of this class called "antrian"
	 * MyQueueArray antrian = new MyQueueArray(argumen);
	 */
	public MyQueueArray(int maks) {
		/**
		 * maks is the maximum elemen of array
		 */
		queue = new int[maks];
		this.maks = maks;
	}
	/**
	 * To enqueue the queue just create antrian.enqueue(argument);
	 * Please nore "antrian" is just object that we created before.
	 */
	public void enqueue(int x) {

		if (i < maks) {
			queue[this.i] = x;
			System.out.println(queue[i] + " berhasil dimasukan ke antrian " + (i));
			i++;
		}
		
		iPrint = i;
		
		if (i == maks)
			i = 0;
		
	}
	/**
	 * To dequeue the queue just create antrian.dequeue();
	 * No argument here for dequeue, just lave it ().
	 * the number 999999999 is to indicate that the element is null
	 * As we can't sign null to array. We just create array of int (primitive data type) not array of Object.
	 * @return first element of array
	 */
	public int dequeue() {
		int temp = queue[j];
		//Integer intObj = new Integer(j);
		queue[j] = 999999999; j++; // 999999999 menandakan antrian kosong
		
		
		if (j == maks)
			j = 0;
		
		return temp;
	}
	/**
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * toString() to print all the element of array
	 * It will return String of element array.
	 * @return String of list of element of Array
	 */
	public String toString() {
		String temp = "";
		
		for (int j = this.j; j < iPrint; j++) {
			temp += Integer.toString(queue[j]) + ", ";
		}
		
		return "Antrian: " + temp;
	}
	/**
	 * kosong() to indicate does the queue null or doesn't;
	 * it will return true if null;
	 * it will return false if not null;
	 * @return true if the array is emphty and false if not.
	 */
	public boolean kosong() {
		/**
		 * if the first pointer (i) equals last pointer (j)
		 * it will return true and false if doesn't
		 */
		if (j == i)
			return true;
		else
			return false;
	}
	/**
	 * terdepat will return front/first queue;
	 * @return the first list.
	 */
	public int terdepan() {
		return queue[i];
	}
	
	/*
	public void balikurutan() {
		int[] temp;
		temp = new int[maks];
		int j = this.i;
		
		for (int i = 0; i <= j; i++, j--) {
			temp[i] = queue[j];
		}
		
		for (int i = 0; i <= this.i; i++) {
			queue[i] = temp[i];
		}
	}
	
	public int banyak() {
		return maks;
	}
	*/

}
