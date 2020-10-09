import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<Object> l=new LinkedList<>();
		
		
		l.add("Prashant");
		System.out.println(l);
		
		l.addFirst("123");
		System.out.println(l);
		
		l.add(0, 'P');
		System.out.println(l);
		
		l.set(0, "Mahale");
		System.out.println(l);
		
		
		
	}

}
