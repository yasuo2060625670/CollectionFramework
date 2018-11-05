package genericDemo;

import java.util.ArrayList;

import bean.Person;


public class GenericAdvanceDemo4 {
public static void main(String[] args) {
	
	
ArrayList<Person> al1 = new ArrayList<Person>();
	
	al1.add(new Person("liuww",22));
	al1.add(new Person("lhuww",42));
	al1.add(new Person("ghuww",23)); 
	
	
	
	
	
ArrayList<Person> al2 = new ArrayList<Person>();
	
	al2.add(new Person("zhuw",22));   
	al2.add(new Person("zhuw",42));
	al2.add(new Person("zhuw",23));
	
	

	
	
	ArrayList<String> al4 = new ArrayList<String>();
	al4.add("abc");
	al4.add("sss");
	
	boolean a = al1.containsAll(al2);
	boolean b = al1.containsAll(al4);
	System.out.println(a);
	System.out.println(b);
	
}
}
