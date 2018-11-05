package map;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import bean.Student;

public class TreeMapDemo {
public static void main(String[] args) {
	TreeMap<Student,String> tm = new TreeMap<Student,String>();
	tm.put(new Student("zz",12),"巢湖");
	tm.put(new Student("aa",22),"苏州");
	tm.put(new Student("dd",42),"北京");
	tm.put(new Student("cc",32),"合肥");
	tm.put(new Student("dd",42),"南京");
	tm.put(new Student("dd",42),"南京");
	
	Set<Student> set = tm.keySet();
	for (Student stu : set) {
		String str = tm.get(stu);
		System.out.println(str);
		
	}
	System.out.println(tm);
	Iterator<Map.Entry<Student,String>> it = tm.entrySet().iterator();
	while(it.hasNext())
	{
		Map.Entry<Student, String> me = it.next();
		Student key = me.getKey();
		String value = me.getValue();
		System.out.println(key.getName()+"--"+key.getAge()+"--"+value);
	}
	
}
}
