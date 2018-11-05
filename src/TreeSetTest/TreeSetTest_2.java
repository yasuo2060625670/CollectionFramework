package TreeSetTest;

import java.util.Iterator;
import java.util.TreeSet;

import Comparator.ComparatorByName;

public class TreeSetTest_2 {
public static void main(String[] args) {
	TreeSet ts = new TreeSet(new ComparatorByName());
	ts.add(new Person1("aha",12));
	ts.add(new Person1("bha",22));
	ts.add(new Person1("afha",32));
	ts.add(new Person1("ahaa",42));
	
	Iterator<Person1> it = ts.iterator();
	
	while(it.hasNext())
	{
		Person1 p = it.next();
		System.out.println(p.getAge()+"---"+p.getName());
	}
	
}
}
