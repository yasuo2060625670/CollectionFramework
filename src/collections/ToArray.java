package collections;
//�޶�����
import java.util.ArrayList;
import java.util.Collection;

public class ToArray {
public static void main(String[] args) {
	Collection<Integer> coll = new ArrayList<Integer> ();
	coll.add(2);
	coll.add(22);
	coll.add(23);
	coll.add(25);
	coll.add(26);
	Collection<String> ct = new ArrayList<String> ();
	ct.add("sss");
	ct.add("haha");
	ct.add("2333");
	demo1(coll);//obj����
	demo2(ct);//string����
	
	
}
public static Object demo1(Collection<Integer>  coll)
{
	//1��collection to Object Array
	return coll.toArray();
	
	
}
public static String[] demo2(Collection<String>  coll)
{
	//2��<T>collection to <T>Array
	return coll.toArray(new String[coll.size()]);
						//���鳤����ø����ϱ���һ��
}
}
