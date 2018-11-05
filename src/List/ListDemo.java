package List;
//操作角标是List的特有方法
//增删改查 
import java.util.ArrayList;
import java.util.List;


public class ListDemo {
public static void main(String[] args) {
	List<Object> list = new ArrayList<Object>();
	show(list);
	
}

public static void show(List <Object>list) {
	//添加
	list.add("abc1");
	list.add("abc2");
	list.add("abc3");
	list.add("abc4");
	//插入
	list.add(2,"abc0");//特有
	
	System.out.println(list);// 12034
	
	//删除
	
	System.out.println("remove:"+list.remove(1));//1034
	
	//修改
	System.out.println("set:"+list.set(3, "abc0"));//1030
	
	//获取
	System.out.println("get:"+list.get(0));//1
	System.out.println("sublist:"+list.subList(0, 2));//10
	System.out.println(list);
	
}
}
