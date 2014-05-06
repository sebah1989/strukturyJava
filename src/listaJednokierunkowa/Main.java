package listaJednokierunkowa;
public class Main{
	
	public static void main(String[] args){
		Lista lista = new Lista();
		Element element = new Element(8);
		Element element2 = new Element(6);
		Element element3 = new Element(9);
		Element element4 = new Element(10);
		
		Element el = lista.szukaj(6);
		lista.wypisz();
		
	}
}