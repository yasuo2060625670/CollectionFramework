package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteractorDemo {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("fabc4");
//		Iterator it = coll.iterator();//����������
		//����֪����ôȡԪ�أ�����ʹ�������߶��ԣ������ʵ�ֲ���Ҫ��ֻҪͨ��������ȡ����ʵ�ֵĵ������Ķ��󼴿ɣ�

//		while (it.hasNext())// �������Ԫ�ؿ��Ե������򷵻� true�����ǣ������������������������º�itû���ͷ�
//		{
//			System.out.println(it.next());// ���ص�������һ��Ԫ�ء�
//		}
		for (Iterator<String> it = coll.iterator(); it.hasNext();) {//it���ͷţ���Լ�ڴ�
			System.out.println(it.next());// ���ص�������һ��Ԫ�ء�
			
		}

		// System.out.println(it.next());
		// System.out.println(it.next());
		// System.out.println(it.next());
		// System.out.println(it.next());
		// System.out.println(it.next());//NoSuchElementExceptionûԪ���˵�����ë

	}
}
