package WrapperDemo;

public class WrapperDemo2 {
public static void main(String[] args) {

	Integer a = new Integer(128);
	Integer b = new Integer(128);
	
	System.out.println(a==b);//false
	System.out.println(a.equals(b));//true��дequals������ֻ�Ƚ�ֵ
	
	Integer x = 1;//jdk1.5�Ժ��Զ�װ�䣬���װ�����һ���ֽڣ���ô�����ݻᱻ���������¿��ٿռ䡣
	Integer y = 1;//127���ڣ�һ���ֽڳ������ڣ�����һ������(-128---127)
	System.out.println(x);System.out.println(y);
	System.out.println(x==y);//false
	System.out.println(x.equals(y));//true
}
}
