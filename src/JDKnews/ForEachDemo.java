package JDKnews;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Iterator;
import java.util.List;
import java.util.Map;

//增强for
public class ForEachDemo {
  public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("hah");
	list.add("ss");
	//list.add(22);
	list.add("dd");
	list.add("v");
	list.add("havvh");
	System.out.println(list);
	
	//增强for简化书写
	for (String s : list) {
		System.out.println(s);
	}
	System.out.println("trySet----------------------");
	//Iterator麻烦
	
//	int[] arr = {1,2,4,5,7,8,85,5};
//	for (int i : arr) {
//		System.out.println(i);
//	}
	//将map转成单列的set就完事了
	 Map<Integer,String> map = new HashMap<Integer,String>();
	 map.put(1, "jj");
	 map.put(2, "4sd");
	 map.put(3, "j55j");
	 map.put(4, "j6sdj");
	 map.put(5, "jjsdfs2");
	 
	/* Iterator<Integer> it =  map.keySet().iterator();
	while(it.hasNext())
	{
		Integer key = it.next();
		String value = map.get(key);
		System.out.println(key+":"+value);
	}*/
	 for ( Integer key : map.keySet()) {
		System.out.println(key+":"+map.get(key));
	}
	
	 System.out.println("entrySet-----------");
	/* 
	 Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
	 while(it.hasNext())
	 {
		 Map.Entry<Integer, String> me = it.next();
		Integer key =  me.getKey();
		String value = me.getValue();
		System.out.println(key+":"+value);
	 }*/
	 for (Map.Entry<Integer, String>  me : map.entrySet()) {
		Integer key = me.getKey();
		String value = me.getValue();
		System.out.println(key+":"+value);
	}
	
	
	
	
	
	
	
	
}
}
