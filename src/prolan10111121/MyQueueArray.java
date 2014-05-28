package prolan10111121;

public class MyQueueArray {
	
	private int[] queue;
	private int maks;
	private int front = -1, rear = -1;
	
	public MyQueueArray(int maks) {

		queue = new int[maks];
		this.maks = maks;
	}

	public void enqueue(int x) {

		if ((front == 0) && (rear == maks-1))
			System.out.println("Queue penuh!");
		else {
			if ((front == -1) || (rear == -1))
				front = rear = 0;
			else if (rear == maks-1)
				System.out.println("Queue penuh!");
			else 
				rear += 1;
			
			queue[rear] = x;
		}
		
	}

	public int dequeue() {
		int temp = queue[0];
		
		if ((front == -1) && (rear == -1))
			return 999999999;
		else {
			if (front != rear) {
				for (int i = 0; i < rear; i++) {
					queue[i] = queue[i+1];
				}
				rear -= 1;
			} else {
				front = rear = -1;
			}
		}
		
		return temp;
	}

	public String toString() {
		String temp = "";
		
		if ((front != -1) && (rear != -1)) {
			for (int i = front; i <= rear; i++) {
				temp += Integer.toString(queue[i]) + ", ";
			}
		} else
			temp = "Kosong!";
		
		return "Antrian: " + temp;
	}

	public boolean kosong() {
		
		if ((front == -1) && (rear == -1))
			return true;
		else
			return false;
	}
	/**
	 * terdepat will return front/first queue;
	 * @return the first list.
	 */
	public int terdepan() {
		return queue[front];
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
