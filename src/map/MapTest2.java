package map;

import java.util.HashMap;
import java.util.Map;

//map���
public class MapTest2 {
public static void main(String[] args) {
	
	getWeek("��һ");
	System.out.println(getWeek("��һ"));
	
}
public static String getWeek(String week)
{

	Map<String,String> map = new HashMap<String,String> ();
	map.put("��һ", "mon");
	map.put("��2", "tus");
	return map.get(week);
	
	
	
}
}
