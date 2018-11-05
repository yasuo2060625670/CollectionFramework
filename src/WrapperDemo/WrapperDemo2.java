package WrapperDemo;

public class WrapperDemo2 {
public static void main(String[] args) {

	Integer a = new Integer(128);
	Integer b = new Integer(128);
	
	System.out.println(a==b);//false
	System.out.println(a.equals(b));//true复写equals方法，只比较值
	
	Integer x = 1;//jdk1.5以后，自动装箱，如果装箱的是一个字节，那么该数据会被共享不会重新开辟空间。
	Integer y = 1;//127以内，一个字节长度以内，就是一个对象。(-128---127)
	System.out.println(x);System.out.println(y);
	System.out.println(x==y);//false
	System.out.println(x.equals(y));//true
}
}
