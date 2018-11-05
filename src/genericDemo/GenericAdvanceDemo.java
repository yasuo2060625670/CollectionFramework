package genericDemo;
//通配符-------------------------------
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import bean.Person;
import bean.Student;
import bean.Worker;

public class GenericAdvanceDemo {
	public static void main(String[] args) {
		
		
//	
//	ArrayList<? extends Person> aa  = new ArrayList< Person>();
//	
//			aa = new ArrayList<Worker>();
//			aa = new ArrayList<Student>();
//			aa = new ArrayList<Object>();
//			aa.add(new Worker("zz",33));
//			aa.add(new Student("zhuw",22));
//			aa.add(new Person("zhuw",22));
		/* 为什么编译不通过
		 * 因为当添加元素的时候，aa不知道是个什么东西，如果aa是Worker，添加的是student对象，则报错
		 * 为了类型安全，编译器只能阻止添加元素了*/
		
			ArrayList<? super Student> bb ;
			bb = new ArrayList<Person>();
			bb = new ArrayList<Object>();//Person或者Person父类
			bb = new ArrayList<Student>();
//			bb = new ArrayList<Worker>();//wrong果元素类型为Student的子类，则编译不同过
//			bb.add(new Worker("zz",33));//左边可能是Student
//			bb.add(new Person("zhuw",22));//左边可能是Student
			bb.add(new Student("zhuw",22));//右边是左边子类
		
		
			
			
//			ArrayList cc  = new ArrayList();
//			cc = new ArrayList<Object>();
//			cc = new ArrayList<Student>();
//			cc = new ArrayList<Worker>();
//			cc.add(new Worker("zz",33));
//			cc.add(new Person("zhuw",22));
//			cc.add(new Student("zhuw",22));
//			
			
			
			
			
			
		ArrayList<Worker> al1 = new ArrayList<Worker>();
		
		
		al1.add(new Worker("zz",33));
		al1.add(new Worker("aa",43));
		al1.add(new Worker("nn",73));
		al1.add(new Worker("ee",38));
		
		ArrayList<Student> al2 = new ArrayList<Student>();
		
		al2.add(new Student("zhuw",22));
		al2.add(new Student("zhuw",42));
		al2.add(new Student("zhuw",23));
		
		
		
		
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		
		al3.add(22);
		al3.add(42);
		al3.add(23);
		
		
		
		ArrayList<Object> al4 = new ArrayList<Object>();
		
		al4.add(22);
		al4.add(42);
		al4.add(23);
		
		
		printCollection(al1);
		printCollection(al2);
		//printCollection(al3);
		//printCollection(al4);
		
	}
	/**
	 * 迭代并打印集合中的元素
	 * @author 朱伟
	 * ? extends E 接受E类型或者E子类型对象。上限！
	 * ? super E 接受E类型或者E父类型对象。下限！
	 * */									    //泛型限定			
	public static void  printCollection(Collection<? extends Person> c)
	{
		Iterator<? extends Person> it = c.iterator();
		while(it.hasNext())
		{
			//? str = it.next();
			//System.out.println("next:"+it.next());
			Person p = it.next();
			System.out.println(p.getAge()+"-"+p.getName());
		}
		System.out.println("---------------------");
		
	}
}
