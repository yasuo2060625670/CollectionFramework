package WrapperDemo;

/*
 * 基本数据类型对象包装类。
 * 为了方便操作基本数据类型值，将其封装成了对象，在对象中定义了属性和行为丰富了该数据的操作。
 * 用于描述该对象的类就称为基本数据类型对象包装类。
 * 
 * byte		Byte
 * short	Short
 * int		Integer
 * long		Long
 * float	Float
 * double	Double
 * char		Character
 * boolean	Boolean
 * 
 * 该包装对象主要用基本类型和字符串之间的转换。
 * 
 * 基本类型--->字符串
 * 		1,基本类型数值+""
 * 		2,用String类中的静态方法valueOf(基本类型数值);
 * 		3,用Integer的静态方法valueOf(基本类型数值);
 * 
// * 字符串--->基本类型
// * 		1,使用包装类中的静态方法   xxx parseXxx("xxx类型的字符串");*****
// * 			int parseInt("intstring");"123"---123
// * 			long parseLong("longstring");
// * 			boolean parseBoolean("booleanstring");"true"--true
// * 			只有Character没有parse方法 
 * 		2,如果字符串被Integer进行对象的封装。
 * 			可使用另一个非静态的方法，intValue();
 * 			将一个Integer对象转成基本数据类型值。
 * 
 * 
 */

public class WrapperDemo {
public static void main(String[] args) {
	
	
	int a = 2;
	Integer v = new Integer(a);
	String b = String.valueOf(a);
	int c = Integer.valueOf("123");
	System.out.println(c+2);
	System.out.println(b+111);
	
	
	//Integer s1 = new Integer("12a");// NumberFormatException
	
	
	System.out.println("------------- ");
	Integer s = new Integer("12");//代表"12"里面的12 
	Integer d = new Integer(12);
	System.out.println("s = "+(s+1));
	System.out.println("d = "+(d+1));
	System.out.println("------------- ");
	Integer.parseInt("123");
	Boolean.parseBoolean("true");
	System.out.println(Boolean.parseBoolean("true")&&true);
	System.out.println(Integer.parseInt("12345")+1);
	System.out.println("------------- ");
	
	//十进制-->其他进制。
	System.out.println(Integer.toBinaryString(60));//2
	System.out.println(Integer.toOctalString(60));//8
	System.out.println(Integer.toHexString(60));//16
	System.out.println(Integer.toString(60,16));//自定义
	
	System.out.println("------------- ");
	
	Integer a1 = new Integer("30");
	Integer a2 = new Integer(4);
	System.out.println(a1.compareTo(a2));//比较数值，大是1小是2
	
	
}
}
