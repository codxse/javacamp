package prolan10111121;
/**
 * MyQueueLinkedLis is class of double linked list object
 * It absolutely not yet finish, still a lot of bugs
 * The expectations is to create double linked list
 * @author nadiar
 *
 */
public class MyQueueLinkedList {
	private Link last;
	private Link first;
	/**
	 * The expectations is to construct fresh new node
	 * Last pointer null
	 * First pointer null
	 */
	public MyQueueLinkedList() {
		last = null;
		first = last;
		first.prev = null;
	}	
	/**
	 * to enqueue int x to element.info just using Object.enqueue(int value).
	 * @param x
	 */
	void enqueue(int x) {
		Link node = new Link(x);
		
		node = last.next;
		last = node.prev;
		last = node;
	}
	/**
	 * 
	 * @return last elemen info of List
	 */
	int dequeue() {
		Link temp = first;
		first = first.next;
		last.next = null;
		
		return temp.info;
	}
	/**
	 * it will return String of list of Linked list.
	 */
	public String toString() {
		Link temp = first;
		String cantik = "";
		
		System.out.print("List: ");
		
		while (temp != null) {
			cantik += Integer.toString(temp.info);
			temp = temp.next;
		}
		
		return cantik;
	}
	/**
	 * if the List is null it will return true
	 * @return true if the List is null
	 */
	public boolean kosong() {
		if (last == null)
			return true;
		else
			return false;
	}
	/**
	 * it will returun first node info.
	 * @return first node info.
	 */
	public int terdepan() {
		return first.info;
	}

}
