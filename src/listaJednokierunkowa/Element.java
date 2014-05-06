package listaJednokierunkowa;

public class Element {
	public Element(int val){
		this.value = val;
		this.element = null;
	}
	
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Element getElement() {
		return element;
	}
	public void setElement(Element element) {
		this.element = element;
	}


	private int value;
	private Element element;
}
