package prolan10111121;
/**
 * this class not yet finish
 * Still a lot of bugs.
 * @author nadiar
 *
 */
public class MyStackLinkedList {
	private Link last;
	private Link first;
	public Link node;
	/**
	 * Construct new MyStackList object
	 */
	public MyStackLinkedList() {
		last = null;
		first = last;
		first.prev = null;
	}
	/**
	 * it will pushing int x to the list.info
	 * @param x
	 */
	public void push(int x) {
		try {
			Link node = new Link(x);
			last.next = node;
			last = node.prev;
			last = node;
		} catch (NullPointerException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	/**
	 * will retrun last element of list
	 * @return int value of last element.info
	 */
	public int pop() {
		Link temp = last;
		last = last.prev;
		last.next = null;
		
		return temp.info;
	}
	/**
	 * it will return String of list element from start to the end.
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
	 * The list will always return true.
	 * @return true
	 */
	public boolean penuh() {
		if (first == null)
			return false;
		else
			return false;
	}
	/**
	 * if there is no list, it will return true 
	 * @return boolean true if no list, false if any list
	 */
	public boolean kosong() {
		if (first == null)
			return true;
		else
			return false;
	}
	/**
	 * it will return the top element.info
	 * @return the top element.info
	 */
	public int teratas() {
		return last.info;
	}
	/**
	 * it will reverse the list/
	 */
	public void balikurutan() {
		Link temp = last;
		
		while (temp != null) {
			temp.info = last.info;
			temp = temp.prev;
		}
	}
	/**
	 * it will count the list and return the top element.info
	 * @return the top element.info
	 */
	public int banyak() {
		Link temp = first;
		int i = 0;
		
		while (temp != null) {
			i++;
			temp = temp.next;
		}
		
		return i;
	}
	
}
