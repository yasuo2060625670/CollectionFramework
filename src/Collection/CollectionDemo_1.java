package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo_1 {
	
public static void main(String[] args) {
	Collection<Object>coll = new ArrayList<Object>();
	Collection <Object>c2 = new ArrayList<Object>();
	Collection <Object>c1 = new ArrayList<Object>();
	show(coll);
	show(c1,c2);
}
public static void show(Collection <Object>c1,Collection<Object> c2)
{
	//给c1添加元素
	c1.add("abc1");
	c1.add("abc2");
	c1.add("abc3");
	c1.add("abc4");
	
	//给c2添加元素
	c2.add("abc1");
	c2.add("abc3");
	c2.add("abc2");
	c2.add("abc1");
	
	System.out.println("c1:"+c1);
	System.out.println("c2:"+c2);
	
	System.out.println("演示addAll--------------------");
	c1.addAll(c2);//c2元素全都放进去c1}
	System.out.println("c1:"+c1);
	
	
	System.out.println("演示removeAll--------------------");
	c1.removeAll(c2);//相同元素从c1删除
	System.out.println("c1:"+c1);
	
	System.out.println("演示containsAll--------------------");
	boolean a = c2.containsAll(c1);//判断是否包括另一个集合所有元素
	System.out.println(a);
	
	System.out.println("演示retainsAll--------------------");
	boolean b = c1.retainAll(c2);//取交集，保留相同，删除不同和remove相反
	System.out.println(b);
	System.out.println("c1:"+c1);
	
}
public static void show(Collection <Object>coll)
{
	//1.添加元素 add
	coll.add("abcd1");
	coll.add("abcd2");
	coll.add("abcd3");//集合中添加三个元素
	
	System.out.println(coll);//不打印哈希值，打印所有元素
	//2.删除元素。remove
	coll.remove("abcd1");//会改变集合长度
//	coll.removeAll(coll);//会改变集合长度
//	coll.clear();//会改变集合长度
	System.out.println(coll.contains("abcd1"));
	System.out.println(coll);
}
}
