package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import bean.Person;

public class ArrayListTest {
public static void main(String[] args) {
	ArrayList<Person> al = new ArrayList<Person>();
	al.add(new Person("��ΰ",21));//Object obj = new Person();
	al.add(new Person("��ΰ",22));
	al.add(new Person("��ΰ",22));
	al.add(new Person("��ΰ",23));
	al.add(new Person("��ΰ",24));
	
	Iterator it = al.iterator();
	while(it.hasNext()) 
	{								//�������������ϵ�����
		//System.out.println(((Person) it.next()).getName()+" : "+((Person) it.next()).getAge());
									//��һ���˵����ֵڶ����˵����
		Person p = (Person)it.next();//����ǿת��obj--person
		System.out.println(p.getAge()+"--"+p.getName());
	}	
	
}

}

