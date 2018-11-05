package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import bean.Person;

public class ArrayListTest {
public static void main(String[] args) {
	ArrayList<Person> al = new ArrayList<Person>();
	al.add(new Person("王伟",21));//Object obj = new Person();
	al.add(new Person("张伟",22));
	al.add(new Person("张伟",22));
	al.add(new Person("刘伟",23));
	al.add(new Person("马伟",24));
	
	Iterator it = al.iterator();
	while(it.hasNext()) 
	{								//迭代器对象是上帝类型
		//System.out.println(((Person) it.next()).getName()+" : "+((Person) it.next()).getAge());
									//第一个人的名字第二个人的年纪
		Person p = (Person)it.next();//向下强转。obj--person
		System.out.println(p.getAge()+"--"+p.getName());
	}	
	
}

}

