package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import bean.Person;

public class ArrayLIst_2 {

	public static void main(String[] args) {
		sigleDemo();
		
		
	ArrayList <Person>al = new ArrayList<Person>();
	al.add(new Person("王伟",21));//Object obj = new Person();
	al.add(new Person("张伟",22));
	al.add(new Person("张伟",22));
	al.add(new Person("刘伟",23));
	al.add(new Person("刘伟",23));
	al.add(new Person("刘伟",23));
	al.add(new Person("刘伟",23));
	al.add(new Person("马伟",24));
	
	print(al);
	al = getSingleElement(al);
	print(al);
	System.out.println(al.remove(new Person("王伟",21)));
	print(al);
	
	
		
}

	public static void sigleDemo() {
		ArrayList al = new ArrayList();
		al.add("abc1");
		al.add("abc3");
		al.add("abc3");
		al.add("abc4");
		System.out.println(al);
		al = getSingleElement(al);
		System.out.println(al);
	}

	public static void print(ArrayList al) {
		Iterator it = al.iterator();
		while(it.hasNext()) 
		{								//迭代器对象是上帝类型
			//System.out.println(((Person) it.next()).getName()+" : "+((Person) it.next()).getAge());
										//第一个人的名字第二个人的年纪
			Person p = (Person)it.next();//向下强转。obj--person
			System.out.print(p.getAge()+"--"+p.getName()+"--");
		}	
		System.out.println();
		
		
		
	}

	public static ArrayList getSingleElement(ArrayList al) {
		ArrayList temp = new ArrayList();
		 Iterator it = al.iterator();
		 while(it.hasNext())
		 {
			 Object obj = it.next();
			 if(!temp.contains(obj))
			 {
				 temp.add(obj);
			 }
		 }
		
		
		return temp;
	}
}
