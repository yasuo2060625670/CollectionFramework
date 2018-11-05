package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import Comparator.ComparatorByLength;

public class CollectionsDemo_2 {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("asdf");
		ts.add("ssd");
		ts.add("xx");
		ts.add("ascccdf");
		ts.add("ghghr");
		
//		System.out.println(ts);
//		demo1();
//		demo2();
		demo3();
		
		
	}
	public static void demo1()
	{
		//TreeSet<String> ts = new TreeSet<String>(new Comparator<String>() {
/*�ڲ��࣬o1��o2��λ�þͿ�����
			@Override
			public int compare(String o1, String o2) {
				int temp = o1.compareTo(o2);
				return temp;
		
		});*/
		TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder());
		ts.add("asdf");								//���Դ��Ƚ���������
		ts.add("ssd");
		ts.add("xx");
		ts.add("ascccdf");
		ts.add("ghghr");
		System.out.println(ts);
	}
	public static void demo2()
	{											//���Զ���Ƚ���������
		TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder(new ComparatorByLength()));
		//TreeSet<String> ts = new TreeSet<String>(new ComparatorByLength());
		
		ts.add("asdf");								
		ts.add("ssd");
		ts.add("xx");
		ts.add("ascccdf");
		ts.add("ghghr");
		System.out.println(ts);
		
		
	}
	public static void demo3()
	{
		List<String> list = new ArrayList<String>();
		list.add("asdf");
		list.add("ssd");
		list.add("xx");
		list.add("xx");
		list.add("xx");
		list.add("ascccdf");
		list.add("ghghr");
		Collections.fill(list, "zz");//zz������
		System.out.println(list);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
