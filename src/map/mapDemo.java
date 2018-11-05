package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map <Integer,String>map = new HashMap<Integer,String>();
		
		map.put(2, "zw");
		map.put(4, "haha");
		map.put(6, "zz");
		map.put(7, "tab!");
		System.out.println(map);
		map.remove(6);
		map.remove(8);//��ӡ�����NULL
		System.out.println(map);
		System.out.println(map.containsKey(7));
		int a = map.size();
		System.out.println(a);
		map.values();
		System.out.println(map.values());//[zw, haha, tab!]

		
//		ketSet(map);
//		entrySet(map);
		
		
	}

	public static void entrySet(Map<Integer, String> map) {

		//��2----entrySet()Set����֤���󡣽��֤����map���ڲ��ࡣ
		Set<Map.Entry<Integer,String>> es = map.entrySet();
		Iterator<Map.Entry<Integer, String>> it2 =  es.iterator();
		
		while(it2.hasNext())
		{
			Map.Entry<Integer, String> me = it2.next();
			//���֤������ɷ���������
			Integer key = me.getKey();
			String value = me.getValue();
			System.out.println(key+":entrySet:"+value);
		}
		System.out.println("------------------------------------------");
		
	}

	public static void ketSet(Map<Integer, String> map) {
		
		//��1---keySet(),set���key
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext())
		{
			Integer key = it.next();
			String value = map.get(key);
			System.out.println(key+"-keySet-"+value);
		}
		
		System.out.println("------------------------------------------");
	}

	

}
