package prolan10111121;

public class MyStackArrayDriver {

	public static void main(String[] args) {
		// buat objek array tumpukan
		// maksimal tumpukan 5
		MyStackArray tumpukan = new MyStackArray(5);

		// push 4 stack
		System.out.print("Push! "); tumpukan.push(2);
		System.out.print("Push! "); tumpukan.push(3);
		System.out.print("Push! "); tumpukan.push(5);
		System.out.print("Push! "); tumpukan.push(9);
		System.out.print("Push! "); tumpukan.push(9);
		System.out.print("Push! "); tumpukan.push(9);
		
		// print stack
		System.out.println(tumpukan.toString());
		
		// balik urutan stack;
		System.out.print("Balikurutan: "); tumpukan.balikurutan();
		
		// print stack
		System.out.println(tumpukan.toString());
		
		// pop stack
		System.out.println("Pop! "); tumpukan.pop();
		System.out.println("Pop! "); tumpukan.pop();
		System.out.println("Pop! "); tumpukan.pop();
		System.out.println("Pop! "); tumpukan.pop();
		
		// print stack
		System.out.println(tumpukan.toString());
		
		// total antrian
		System.out.println("Antrian: " + tumpukan.banyak());
		
		// push 3 stack
		System.out.print("Push! "); tumpukan.push(5);
		System.out.print("Push! "); tumpukan.push(9);
		System.out.print("Push! "); tumpukan.push(9);	
		
		// print stack
		System.out.println(tumpukan.toString());
		
		// data teratas
		System.out.println("Teratas: " + tumpukan.teratas());	
		
		// pop stack sampai kosong
		System.out.println("Pop! "); tumpukan.pop();
		System.out.println("Pop! "); tumpukan.pop();
		System.out.println("Pop! "); tumpukan.pop();
		System.out.println("Pop! "); tumpukan.pop();
		
		// print stack
		System.out.println(tumpukan.toString());
		
		// kosong?
		System.out.println("Kosong? " + tumpukan.kosong());
		
		// total antrian
		System.out.println("Antrian: " + tumpukan.banyak());
	}

}
