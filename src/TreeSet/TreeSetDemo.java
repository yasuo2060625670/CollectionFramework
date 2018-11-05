package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

import Comparator.ComparatorByName;
import Comparator.ComparatorByLength;
import bean.Person;

public class TreeSetDemo {
public static void main(String[] args) {
	demo2();
	//demo2();
	
}
public static void demo2() {
	TreeSet<Person> ts = new TreeSet<Person>(new ComparatorByName());
  //TreeSet<Person> ts = new TreeSet<Person>(new ComparatorByName());
	ts.add(new Person("����",22));
	ts.add(new Person("����",22));
	ts.add(new Person("����",32));
	ts.add(new Person("��5",22));
	ts.add(new Person("��4",52));
	ts.add(new Person("��7",62));
System.out.println(ts);
	Iterator<Person> it = ts.iterator();
	while(it.hasNext())
	{
		Person p = it.next();
		System.out.println(p.getName()+":"+p.getAge());
	}
	
}

public static void demo1() {
	TreeSet <String>ts = new TreeSet <String>(new ComparatorByLength());
	
	
	ts.add("aaaaaaa");
	ts.add("aabaa");
	ts.add("aada");
	ts.add("aac");//��Ȼ���� abcd
	
	Iterator <String>it = ts.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
}
