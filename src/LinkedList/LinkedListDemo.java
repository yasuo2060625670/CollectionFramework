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
//		System.out.println(link.getFirst());//��ȡ��һ�����ǲ�ɾ��
//		System.out.println(link.getFirst());
		
		
//		System.out.println(link.removeFirst());//��ȡ��һ����ɾ��
//		System.out.println(link.removeFirst());
		while(!link.isEmpty())//����ȡ������ȡ��û��
		{
		System.out.println("next:"+link.removeFirst());//��ȡ��һ����ɾ��
		System.out.println("next:"+link.removeLast());//��ȡ���һ����ɾ��
//			
		}
	}
}	
