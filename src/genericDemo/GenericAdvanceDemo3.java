package genericDemo;
/*下限体现 ? super E
取出时候用一个 该对象或者改对象的父类接收。
什么时候用下限呢？通常对集合中的元素进行取出操作时，可以是用下限。
*/
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import bean.Person;
import bean.Student;
import bean.Worker;

public class GenericAdvanceDemo3 {
public static void main(String[] args) {
	TreeSet<Worker> al3 = new TreeSet<Worker>(new  CompByName());
							//用Person接收
	
	al3.add(new Worker("zz",33));
	al3.add(new Worker("aa",43));
	al3.add(new Worker("nn",73));
	al3.add(new Worker("ee",38));
	
	TreeSet<Student> al2 = new TreeSet<Student>(new  CompByName());
							//用Person接收
	al2.add(new Student("zhuw",22));
	al2.add(new Student("zhuw",42));
	al2.add(new Student("zhuw",23));
	
	TreeSet<Person> al1 = new TreeSet<Person>(new  CompByName());
	
	al1.add(new Person("liuww",22));
	al1.add(new Person("lhuww",42));
	al1.add(new Person("ghuww",23));
	
	TreeSet<String> al4 = new TreeSet<String>();
	al4.add("hass");
	//al3.addAll(al2);Worker接受不了Student
	//System.out.println(al3.size());
	
	
	
	Iterator<Person> it  = al1.iterator();
	while(it.hasNext())
	{
		Person p = it.next();
		System.out.println(p);
	}
	
}
}

class CompByName implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		int temp = o1.getName().compareTo(o2.getName());
		
		return temp==0? o1.getAge()-o2.getAge():temp;
	}
	
}

class CompByStuName  implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		int temp = o1.getName().compareTo(o2.getName());
		
		return temp==0? o1.getAge()-o2.getAge():temp;
	}
	
}

class CompByWorkerName implements Comparator<Worker>{

	@Override
	public int compare(Worker o1, Worker o2) {
		
		int temp = o1.getName().compareTo(o2.getName());
		
		return temp==0? o1.getAge()-o2.getAge():temp;
	}
	
}




