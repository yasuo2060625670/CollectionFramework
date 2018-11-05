package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList<String> link = new LinkedList<String>();
		link.addFirst("abc1");
		link.add("abc1");
		link.addFirst("abc3");
		link.addFirst("abc2");
		link.addFirst("abc4");
		link.add(0, "jjjjj");
		System.out.println(link);
		Iterator <String>it = link.iterator();
		while(it.hasNext())
		{
			System.out.println("next:"+it.next());
		}
//		System.out.println(link.getFirst());//获取第一个但是不删除
//		System.out.println(link.getFirst());
		
		
//		System.out.println(link.removeFirst());//获取第一个并删除
//		System.out.println(link.removeFirst());
		while(!link.isEmpty())//可以取，但是取完没了
		{
		System.out.println("next:"+link.removeFirst());//获取第一个并删除
		System.out.println("next:"+link.removeLast());//获取最后一个并删除
//			
		}
	}
}	
