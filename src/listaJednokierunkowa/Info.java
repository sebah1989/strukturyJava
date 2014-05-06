package listaJednokierunkowa;

public class Info {
	public Info(){
		this.head = null;
		this.tail = null;
	}
	
	
	public Element getHead() {
		return head;
	}
	public void setHead(Element head) {
		this.head = head;
	}
	public Element getTail() {
		return tail;
	}
	public void setTail(Element tail) {
		this.tail = tail;
	}
	private Element head;
	private Element tail;

}
