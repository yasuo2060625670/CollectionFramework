package List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		show(list);
		
		
		
	}

	public static void show(List<Object> list) {

		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");

		// collectionȡ��Ԫ�ط�ʽ(������)
		
		ListIterator <Object>it = list.listIterator();//�����п��ԶԼ�����ɾ�Ĳ� 
		//Iterator it = list.Iterator();//������֪�����ĸ�Ԫ��
		
		
		while (it.hasNext()) {
			
			Object obj = it.next();//��object���ܣ���Ϊ�����ʱ������ת�͡�
			if (obj.equals("abc1"))
				//��������֪��������˸�Ԫ�ء���������֪���Լ��ò��õ���������Ԫ�ء�
				//it.set("abc5");
			
			
			it.add("abc5");
			//java.util.ConcurrentModificationException
			else
				System.out.println("next:"+obj);
			
		}
		System.out.println(list);
		while (it.hasPrevious()) {//�ж�ǰ����û��Ԫ��
			
			System.out.println("previous:"+it.previous());
			
		}
System.out.println(list);
//���������ϣ����ϲ�������
		
		// list���е�
		// for (int i = 0; i < list.size(); i++) {
		// System.out.println("get:"+list.get(i));
		// }
		//
	}
}
