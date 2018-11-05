package LinkedList;

import java.util.LinkedList;

//相反队列(先进先出)，相同堆栈
/**
 * 思路：1、定义构造函数
 * 2、定义存元素方法
 * 3、定义取元素方法*/
class Duizhan
{
	private LinkedList<Object> link ;
	Duizhan()
	{
		 link = new LinkedList<Object>();
	}
	public void myAdd(Object e)
	{
		link.addFirst(e);
		
	}
	public Object myRemove()
	{
		return link.removeFirst();
	}
	public boolean isNull()
	{
		return link.isEmpty();
	}
}
class DuiLie
{
	private LinkedList<Object> link;
	DuiLie()
	{
		 link = new LinkedList<Object>();
	}
	public void myAdd(Object e)
	{
		link.addFirst(e);//4,3,2,1
	//link.add(e);//1234
	}
	public Object myRemove()
	{
		return link.removeLast();
	}
	public boolean isNull()
	{
		return link.isEmpty();
	}
}
public class LinkedListTest {
public static void main(String[] args) {
	DuiLie dl = new DuiLie();
	dl.myAdd("abc1");
	dl.myAdd("abc2");
	dl.myAdd("abc3");
	dl.myAdd("abc4");
	while(!dl.isNull())
	{
		System.out.println(dl.myRemove());
	}
	Duizhan dz = new Duizhan();
	dz.myAdd("haha");
	dz.myAdd("zz");
	dz.myAdd("sddf");
	dz.myAdd("re");
	dz.myAdd("uy");
	
	while(!dz.isNull())
	{
		System.out.println(dz.myRemove());
	}
}
}
