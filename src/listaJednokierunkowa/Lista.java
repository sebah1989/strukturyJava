package listaJednokierunkowa;
import java.util.ArrayList;


public class Lista {
	public Lista(){
		info = new Info();
	}
	
	public void addElement(Element element){
		if(info.getHead() == null){
			info.setHead(element);
		}
		else{
			Element el = info.getHead();
			while(el.getElement() != null){
				el = el.getElement();
			}
			el.setElement(element);
		}
			
		info.setTail(element);
	}
	
	boolean pusta(){
		if(info.getHead() == null){
			return true;
		}
		return false;
	}
	public void wypisz(){
		if(info.getHead() == null){
			System.out.println("Lista pusta");
		}
		else{
			Element el = info.getHead();
			while(el != null){
				System.out.println(el.getValue());
				el = el.getElement();
			}
		}
	}
	Element szukaj(int value){
		Element el = info.getHead();
		if(el == null){
			return el;
		}
		else{
			while(value != el.getValue()){
				el = el.getElement();
			}
			return el;
		}
	}
	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	private Info info;

}
