package Comparator;

import java.util.Comparator;
//treeSet自定义比较器
public class ComparatorByLength implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		
		String p1 = (String)o1;
		String p2 = (String)o2;

		int temp = p1.length()-p2.length();
		return temp==0?p1.compareTo(p2):temp;

	}
}