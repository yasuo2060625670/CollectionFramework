package map;

import java.util.HashMap;
import java.util.Map;

//map查表
public class MapTest2 {
public static void main(String[] args) {
	
	getWeek("周一");
	System.out.println(getWeek("周一"));
	
}
public static String getWeek(String week)
{

	Map<String,String> map = new HashMap<String,String> ();
	map.put("周一", "mon");
	map.put("周2", "tus");
	return map.get(week);
	
	
	
}
}
