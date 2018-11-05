package genericDemo;
//上限体现 ? extends E
import java.util.ArrayList;

import bean.Person;
import bean.Student;
import bean.Worker;

public class GenericAdvanceDemo2 {
public static void main(String[] args) {
	ArrayList<Worker> al3 = new ArrayList<Worker>();
	
	
	al3.add(new Worker("zz",33));
	al3.add(new Worker("aa",43));
	al3.add(new Worker("nn",73));
	al3.add(new Worker("ee",38));
	
	ArrayList<Student> al2 = new ArrayList<Student>();
	
	al2.add(new Student("zhuw",22));
	al2.add(new Student("zhuw",42));
	al2.add(new Student("zhuw",23));
	
	ArrayList<Person> al1 = new ArrayList<Person>();
	
	al1.add(new Person("liuww",22));
	al1.add(new Person("lhuww",42));
	al1.add(new Person("ghuww",23));
	
//	ArrayList al4 = new ArrayList();
//	al4.add("hass");
	//al3.addAll(al2);Worker接受不了Student
	System.out.println(al3.size());
	
}
}
class MyCollection<Collection>
{
	public void add(Collection c)
	{
		
	}						//Person .add(Person或者Person子类);
	public void addAll(MyCollection<? extends Collection> c)
	{						//存一般都是使用上限
		
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	

