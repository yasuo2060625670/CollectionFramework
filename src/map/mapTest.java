package map;
import java.util.Iterator;
//��ȡ�ַ����ַ����ָ���,ȥ���޹��ַ�
import java.util.TreeMap;
/*
 * 1�ַ��������飬2�������飬
 * 3,���û�оͼ�һ����arr[i],1
 * 4���оͼ�arr[i]��,tm.get(arr[i])+1*/
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
