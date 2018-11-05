package LinkedList;

import java.util.LinkedList;

//�෴����(�Ƚ��ȳ�)����ͬ��ջ
/**
 * ˼·��1�����幹�캯��
 * 2�������Ԫ�ط���
 * 3������ȡԪ�ط���*/
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
