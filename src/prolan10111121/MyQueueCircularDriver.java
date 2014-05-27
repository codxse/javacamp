package prolan10111121;

public class MyQueueCircularDriver {

	public static void main(String[] args) {
		// buat objek array bulet
		// maksimal bulet 5
		MyQueueCircular bulet = new MyQueueCircular(5);
		
		// enqueue bulet
		System.out.println("Enqueue!"); bulet.enqueue(1);
		System.out.println("Enqueue!"); bulet.enqueue(4);
		System.out.println("Enqueue!"); bulet.enqueue(5);
		System.out.println("Enqueue!"); bulet.enqueue(11);
		System.out.println("Enqueue!"); bulet.enqueue(15);
		System.out.println("Enqueue!"); bulet.enqueue(125);
		// print;
		System.out.println(bulet.toString());
		
		// dequeue bulet
		System.out.println("Dequeue!"); bulet.dequeue();
		System.out.println("Dequeue!"); bulet.dequeue();
		System.out.println("Dequeue!"); bulet.dequeue();
		
		// print;
		System.out.println(bulet.toString());
		
		System.out.println("Enqueue!"); bulet.enqueue(125);
		// print;
		System.out.println(bulet.toString());
		
	}

}
