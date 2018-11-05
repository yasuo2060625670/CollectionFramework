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
	//��c1���Ԫ��
	c1.add("abc1");
	c1.add("abc2");
	c1.add("abc3");
	c1.add("abc4");
	
	//��c2���Ԫ��
	c2.add("abc1");
	c2.add("abc3");
	c2.add("abc2");
	c2.add("abc1");
	
	System.out.println("c1:"+c1);
	System.out.println("c2:"+c2);
	
	System.out.println("��ʾaddAll--------------------");
	c1.addAll(c2);//c2Ԫ��ȫ���Ž�ȥc1}
	System.out.println("c1:"+c1);
	
	
	System.out.println("��ʾremoveAll--------------------");
	c1.removeAll(c2);//��ͬԪ�ش�c1ɾ��
	System.out.println("c1:"+c1);
	
	System.out.println("��ʾcontainsAll--------------------");
	boolean a = c2.containsAll(c1);//�ж��Ƿ������һ����������Ԫ��
	System.out.println(a);
	
	System.out.println("��ʾretainsAll--------------------");
	boolean b = c1.retainAll(c2);//ȡ������������ͬ��ɾ����ͬ��remove�෴
	System.out.println(b);
	System.out.println("c1:"+c1);
	
}
public static void show(Collection <Object>coll)
{
	//1.���Ԫ�� add
	coll.add("abcd1");
	coll.add("abcd2");
	coll.add("abcd3");//�������������Ԫ��
	
	System.out.println(coll);//����ӡ��ϣֵ����ӡ����Ԫ��
	//2.ɾ��Ԫ�ء�remove
	coll.remove("abcd1");//��ı伯�ϳ���
//	coll.removeAll(coll);//��ı伯�ϳ���
//	coll.clear();//��ı伯�ϳ���
	System.out.println(coll.contains("abcd1"));
	System.out.println(coll);
}
}
