package List;
//�����Ǳ���List�����з���
//��ɾ�Ĳ� 
import java.util.ArrayList;
import java.util.List;


public class ListDemo {
public static void main(String[] args) {
	List<Object> list = new ArrayList<Object>();
	show(list);
	
}

public static void show(List <Object>list) {
	//���
	list.add("abc1");
	list.add("abc2");
	list.add("abc3");
	list.add("abc4");
	//����
	list.add(2,"abc0");//����
	
	System.out.println(list);// 12034
	
	//ɾ��
	
	System.out.println("remove:"+list.remove(1));//1034
	
	//�޸�
	System.out.println("set:"+list.set(3, "abc0"));//1030
	
	//��ȡ
	System.out.println("get:"+list.get(0));//1
	System.out.println("sublist:"+list.subList(0, 2));//10
	System.out.println(list);
	
}
}
