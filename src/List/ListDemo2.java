package List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		show(list);
		
		
		
	}

	public static void show(List<Object> list) {

		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");

		// collection取出元素方式(公共的)
		
		ListIterator <Object>it = list.listIterator();//迭代中可以对集合增删改查 
		//Iterator it = list.Iterator();//迭代器知道有四个元素
		
		
		while (it.hasNext()) {
			
			Object obj = it.next();//用object接受，因为输入的时候向上转型。
			if (obj.equals("abc1"))
				//迭代器不知道这里加了个元素。迭代器不知道自己该不该迭代这第五个元素。
				//it.set("abc5");
			
			
			it.add("abc5");
			//java.util.ConcurrentModificationException
			else
				System.out.println("next:"+obj);
			
		}
		System.out.println(list);
		while (it.hasPrevious()) {//判断前面有没有元素
			
			System.out.println("previous:"+it.previous());
			
		}
System.out.println(list);
//迭代不集合！集合不迭代！
		
		// list特有的
		// for (int i = 0; i < list.size(); i++) {
		// System.out.println("get:"+list.get(i));
		// }
		//
	}
}
