package map;
//ȥ��
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

import bean.Student;

/*��ѧ����ѧ��������(���˾ͷ�װһ��)ͨ����ֵ���map*/
public class HashmapDemo {
public static void main(String[] args) {
	HashMap<Student,String> hm = new LinkedHashMap<Student,String>();
	hm.put(new Student("zz",12),"����");
	hm.put(new Student("aa",22),"����");
	hm.put(new Student("cc",32),"�Ϸ�");
	hm.put(new Student( ),"����");
	hm.put(new Student("dd",42),"�Ͼ�");//��дhasCode��equals����
	
//	Set<Student> keySet = hm.keySet();
//	Iterator<Student> it = keySet.iterator();
	//�����������
	Iterator<Student> it = hm.keySet().iterator();
	
	
	while(it.hasNext())
	{
		Student key = it.next();
		String value = hm.get(key);
		System.out.println(key.getName()+"--"+key.getAge()+"--"+value);
	}
//	cc--32--�Ϸ�
//	aa--22--����   ����
//	dd--42--����
//	zz--12--����

}

}
