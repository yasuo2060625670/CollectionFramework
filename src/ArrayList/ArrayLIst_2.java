package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import bean.Person;

public class ArrayLIst_2 {

	public static void main(String[] args) {
		sigleDemo();
		
		
	ArrayList <Person>al = new ArrayList<Person>();
	al.add(new Person("��ΰ",21));//Object obj = new Person();
	al.add(new Person("��ΰ",22));
	al.add(new Person("��ΰ",22));
	al.add(new Person("��ΰ",23));
	al.add(new Person("��ΰ",23));
	al.add(new Person("��ΰ",23));
	al.add(new Person("��ΰ",23));
	al.add(new Person("��ΰ",24));
	
	print(al);
	al = getSingleElement(al);
	print(al);
	System.out.println(al.remove(new Person("��ΰ",21)));
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
		{								//�������������ϵ�����
			//System.out.println(((Person) it.next()).getName()+" : "+((Person) it.next()).getAge());
										//��һ���˵����ֵڶ����˵����
			Person p = (Person)it.next();//����ǿת��obj--person
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
