package prolan10111121;

public class MyQueueArrayDriver {

	public static void main(String[] args) {
		
		// buat objek array antrian
		// maksimal antrian 5
		MyQueueArray antrian = new MyQueueArray(5);
		
		// enqueue antrian
		System.out.print("Enqueue!"); antrian.enqueue(1);
		System.out.print("Enqueue!"); antrian.enqueue(4);
		System.out.print("Enqueue!"); antrian.enqueue(5);
		System.out.print("Enqueue!"); antrian.enqueue(11);
		System.out.print("Enqueue!"); antrian.enqueue(15);
		System.out.print("Enqueue!"); antrian.enqueue(15);
		
		// print antrian
		System.out.println(antrian.toString());
		
		// dequeue abtrian
		System.out.println("Dequeue!"); antrian.dequeue();
		System.out.println("Dequeue!"); antrian.dequeue();
		
		// print antrian
		System.out.println(antrian.toString());
		
		// enqueue antrian
		System.out.print("Enqueue!"); antrian.enqueue(1509);
		System.out.print("Enqueue!"); antrian.enqueue(175);
		
		// print antrian
		System.out.println(antrian.toString());
		
		// Kosong?
		System.out.println("Kosong? " + antrian.kosong());
		
		// dequeue abtrian
		System.out.println("Dequeue!"); antrian.dequeue();
		System.out.println("Dequeue!"); antrian.dequeue();
		System.out.println("Dequeue!"); antrian.dequeue();
		System.out.println("Dequeue!"); antrian.dequeue();
		System.out.println("Dequeue!"); antrian.dequeue();
		System.out.println("Dequeue!"); antrian.dequeue();
		
		// print antrian
		System.out.println(antrian.toString());
		
		// Kosong?
		System.out.println("Kosong? " + antrian.kosong());		
	}

}
