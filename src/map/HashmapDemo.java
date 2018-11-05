package map;
//去重
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

import bean.Student;

/*将学生和学生归属地(多了就封装一哈)通过键值存进map*/
public class HashmapDemo {
public static void main(String[] args) {
	HashMap<Student,String> hm = new LinkedHashMap<Student,String>();
	hm.put(new Student("zz",12),"巢湖");
	hm.put(new Student("aa",22),"苏州");
	hm.put(new Student("cc",32),"合肥");
	hm.put(new Student( ),"北京");
	hm.put(new Student("dd",42),"南京");//重写hasCode、equals方法
	
//	Set<Student> keySet = hm.keySet();
//	Iterator<Student> it = keySet.iterator();
	//等于下面这句
	Iterator<Student> it = hm.keySet().iterator();
	
	
	while(it.hasNext())
	{
		Student key = it.next();
		String value = hm.get(key);
		System.out.println(key.getName()+"--"+key.getAge()+"--"+value);
	}
//	cc--32--合肥
//	aa--22--苏州   无序
//	dd--42--北京
//	zz--12--巢湖

}

}
