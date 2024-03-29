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
	public void addElementSorted(Element element){
	  if(pusta()){
	    info.setHead(element);
	    info.setTail(element);
	  }
	  else if(info.getHead().getValue() > element.getValue()){
	    Element temp = info.getHead();
	    info.setHead(element);
	    info.getHead().setElement(temp);
	    info.setTail(temp);
	  }
	  else if(info.getTail().getValue() < element.getValue()){
	    info.getTail().setElement(element);
	    info.setTail(element);
	  }
	  else{
	    Element temp = info.getHead();
	    while(temp.getElement() != null && temp.getElement().getValue() < element.getValue()){
	      temp = temp.getElement();
	    }
	    Element nextTemp = temp.getElement();
	    temp.setElement(element);
	    element.setElement(nextTemp);
	  }
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
