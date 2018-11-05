package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import bean.Person;

public class HashSetTest {
public static void main(String[] args) {
	HashSet hs = new HashSet();
	hs.add(new Person("lisi4",24));
	hs.add(new Person("lisi4",24));
	hs.add(new Person("lisi4",24));
	hs.add(new Person("lisi3",23));
	hs.add(new Person("lisi2",22));
	hs.add(new Person("lisi2",22));
	hs.add(new Person("lisi1",21));
	
	Iterator it = hs.iterator();
	while(it.hasNext())
	{
		Person p = (Person)it.next();
		System.out.println(p.getAge()+"---"+p.getName());
	}
	
}

}