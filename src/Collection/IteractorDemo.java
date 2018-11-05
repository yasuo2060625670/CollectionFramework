package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteractorDemo {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("fabc4");
//		Iterator it = coll.iterator();//迭代器對象
		//容器知道怎么取元素，对于使用容器者而言，具体的实现不重要，只要通过容器获取到该实现的迭代器的对象即可，

//		while (it.hasNext())// 如果仍有元素可以迭代，则返回 true。但是！！！！！！！这样迭代完事后it没被释放
//		{
//			System.out.println(it.next());// 返回迭代的下一个元素。
//		}
		for (Iterator<String> it = coll.iterator(); it.hasNext();) {//it會释放，节约内存
			System.out.println(it.next());// 返回迭代的下一个元素。
			
		}

		// System.out.println(it.next());
		// System.out.println(it.next());
		// System.out.println(it.next());
		// System.out.println(it.next());
		// System.out.println(it.next());//NoSuchElementException没元素了迭代个毛

	}
}
