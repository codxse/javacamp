package prolan10111121;
/**
 * Link is class of node
 * it will create pointer look like
 * @author nadiar
 *
 */
public class Link {
	public int info;
	public Link next;
	public Link prev;
	/**
	 * create new Link with Link.info = x
	 * @param x
	 */
	public Link(int x) {
		info = x;
	}
	
	public void printLink() {
		System.out.print(Integer.toString(info) + (", "));
	}

}
