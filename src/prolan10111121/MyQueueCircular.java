package prolan10111121;
/**
 * 
 * @author nadiar
 * MyQueueCircular is array circular of int
 * this circular array not yet perfect still a lot of bugs
 */
public class MyQueueCircular {

	private int[] queueBulet;
	private int maks;
	private int gue = -1, keren = -1; // gue = front; keren = rear
	// private boolean kosong = true;
	/**
	 * The constructor is MyQueueCircular with maximum array as argumen
	 * Ex: MeQueueCircular node = new MyQueueCircular(maximum) 
	 */
	public MyQueueCircular(int maks) {
		queueBulet = new int[maks];
		this.maks = maks;
	}
	/**
	 * penuh() to indicate if tha array is full.
	 * The pointer of gue (front) and keren (rear) doesnt point to any index.
	 * It will return boolean data type.
	 * @return true if the array is full and false if not
	 */
	public boolean penuh() {
		if ((gue==0 && (keren == maks-1)) || keren == gue-1)
			return true;
		else 
			return false;
	}
	/**
	 * 
	 * @return true if the array is emphty and false if not
	 * if list is Emphty it will return true 
	 * If the list has any element it will return false
	 */
	public boolean kosong() {
		if ((gue == -1 && keren == -1) || (keren < gue))
			return true;
		else
			return false;
	}
	/**
	 * 
	 * @param x
	 * enqueue(the element)
	 * x is parameter to enqueue.
	 */
	public void enqueue(int x) {
		if (penuh()) {
			System.out.println("Queue penuh!.. ");
		} else {
			
			if (keren == -1 && gue == -1)
				gue = keren = 0;
			else
				keren++;
		
			if (keren == maks)
				keren = 0;
			
			queueBulet[keren] = x;
		}
		
	}
	/**
	 * dequeue is function that will return first queue.
	 * @return int value of first queue.
	 */
	public int dequeue() {
		if (kosong()) {
			System.out.print("Queue kosong!.. ");
			return (-1);
		} else {
			int x = queueBulet[gue];
			gue++;
			
			if (gue == keren+1)
				gue = keren = -1;
			
			if (gue == maks)
				gue = 0;
			
			return x;
		}
	}
	
	/*public void enqueue(int x) {
		if ((gue == 0) && (keren == maks-1) || (gue == keren+1)) {
			System.out.print("Penuh!");
		} else {
			if (keren == -1) {
				keren = 0;
				gue = 0;
			} else if (keren == maks-1)
				keren = 0;
			else
				keren++;
		}
		
		queueBulet[keren] = x;
		System.out.println("Enqueue!" + x);
	}
	
	public void enqueue(int x) {
		
		if (kosong == true) {
			queueBulet[gue] = x;
			System.out.println(x + " ditambahkan! index: " + gue);
			
			if (gue == (maks-1))
				gue = 0;
			else
				gue++;
			
			if (gue == keren)
				kosong = false;			
			
		} else {
			System.out.println("Penuh!" + gue);
		}
	}
	
	public int dequeue() {
		int temp = 0;
		
		if ((kosong == false) && (queueBulet[keren] != 999999999)) {
			temp = queueBulet[keren];
			System.out.print(queueBulet[keren] + " dikeluarkan!");
			queueBulet[keren] = 999999999;
			
			if (keren == (maks-1))
				keren = 0;
			else
				keren++;
				
			if (gue - keren >= 0)
				kosong = true;
		} else {
			System.out.print("Kosong!");
		}
		System.out.print("--" + kosong + "--");
		System.out.println(" Posisi:" + keren);
		return temp;
	}
	
	public int dequeue() {
		
		int temp = 999999999;
		
		if (gue == -1) {
			return 999999999;
		} else {
			temp = queueBulet[gue];
			
			if (gue == keren) {
				gue = -1;
				keren = -1;
			} else if (gue == maks-1)
				gue = 0;
			else
				gue++;
		}
		
		return temp;
	}*/
	
	/*public String toString() {
		String temp = "";
		int keren = this.keren;
		
		for (int j = 0; j <= queueBulet.length-1 ; j++) {
			temp += Integer.toString(queueBulet[(j + keren) % queueBulet.length]) + ", ";
		}
		
		return "Antrian: " + temp;
	}
	
	public String toString() {
		int i;
		String temp = "";
		
		if ((gue == -1) || (gue == keren+1))
			temp = "Kosong! ";
		else {
			for (i = gue; i <= keren; i++)
				temp += Integer.toString(queueBulet[i]) + ", ";
		}
		
		return "Antrian: " + temp;
	}*/
	
	/*public boolean kosong() {
		if (gue == -1)
			return true;
		else
			return false;
	}*/
	/**
	 * @return toString method will return String object of list of circular list.
	 */
	public String toString() {
		String temp = "";
		if (kosong())
			return "Queue: ";
		else {
			int i = gue, j = keren;
			
			while (i != j) {
				temp += Integer.toString(queueBulet[i]) + ", ";
				i++;
				
				if (i==j) {
					temp += Integer.toString(queueBulet[i]) + ", ";
				}
				
				if (i == maks)
					i = 0;
			}
			
		}
		
		return temp;
		
	}
	/**
	 * terdepan() is method to get first queue.
	 * @return fitst queue
	 */
	public int terdepan() {
		return queueBulet[gue];
	}
	
}
