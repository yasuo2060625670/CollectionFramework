package genericDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class GnericDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("haha1");
		al.add("haha2");
		ArrayList<Integer> al2 = new ArrayList<Integer>();
	
		//al.add(4);//ClassCastException:
		Iterator<String> it = al.iterator();
		while(it.hasNext())
		{
			String str = it.next();
			System.out.println(str);
		}
	}
	

}
