package map;
import java.util.Iterator;
//获取字符串字符出现个数,去除无关字符
import java.util.TreeMap;
/*
 * 1字符串变数组，2遍历数组，
 * 3,如果没有就加一个，arr[i],1
 * 4，有就加arr[i]，,tm.get(arr[i])+1*/
public class mapTest {
public static void main(String[] args) {
	TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
	
	String str = "aaaACBaaeaA3453+_)bccdefg";
	
	
	char [] arr = str.toCharArray();
	
	for (int i = 0; i < arr.length; i++) {
		if((arr[i]>='a'&&arr[i]<='z')||(arr[i]>='A'&&arr[i]<='Z')) {
		Integer value = tm.get(arr[i]);
		int count = 1;
	
		
		if(value!=null)
		{
		count = value +1;
		}
		//value++;
		tm.put(arr[i], count);
		}
	}
	System.out.println(tm);
	
	
	
	StringBuilder sb = new  StringBuilder();
	
	Iterator<Character> it = tm.keySet().iterator();
		while(it.hasNext())
		{
			Character key = it.next();
			Integer value = tm.get(key);
			
			sb.append(key+"("+value+")");
		}
	System.out.println(sb.toString());
//	for (int i = 0; i < arr.length; i++) {
//		//Integer value = tm.get(arr[i]);
//		if(tm.get(arr[i])==null)
//		{
//			tm.put(arr[i], 1);
//		}
//		else
//			tm.put(arr[i],tm.get(arr[i])+1);
//		
//	}
//	System.out.println(tm);
//	System.out.println(tm.toString());
}
}
