import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		LinkedList l= new LinkedList();

		l.add("Prashant");
		l.add("ram");


		System.out.println(l);
		ListIterator li=l.listIterator();

		while(li.hasNext()) {

			String elments=(String) li.next();

			if(elments.equals("Prashant")) {

				li.add("Mahale");
			}

			if(elments.equals("ram")) {

				li.set("RamKrishna");
			}
		}

		System.out.println(l);
	}

}
