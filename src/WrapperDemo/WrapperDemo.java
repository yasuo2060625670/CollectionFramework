package WrapperDemo;

/*
 * �����������Ͷ����װ�ࡣ
 * Ϊ�˷������������������ֵ�������װ���˶����ڶ����ж��������Ժ���Ϊ�ḻ�˸����ݵĲ�����
 * ���������ö������ͳ�Ϊ�����������Ͷ����װ�ࡣ
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
 * �ð�װ������Ҫ�û������ͺ��ַ���֮���ת����
 * 
 * ��������--->�ַ���
 * 		1,����������ֵ+""
 * 		2,��String���еľ�̬����valueOf(����������ֵ);
 * 		3,��Integer�ľ�̬����valueOf(����������ֵ);
 * 
// * �ַ���--->��������
// * 		1,ʹ�ð�װ���еľ�̬����   xxx parseXxx("xxx���͵��ַ���");*****
// * 			int parseInt("intstring");"123"---123
// * 			long parseLong("longstring");
// * 			boolean parseBoolean("booleanstring");"true"--true
// * 			ֻ��Characterû��parse���� 
 * 		2,����ַ�����Integer���ж���ķ�װ��
 * 			��ʹ����һ���Ǿ�̬�ķ�����intValue();
 * 			��һ��Integer����ת�ɻ�����������ֵ��
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
	Integer s = new Integer("12");//����"12"�����12 
	Integer d = new Integer(12);
	System.out.println("s = "+(s+1));
	System.out.println("d = "+(d+1));
	System.out.println("------------- ");
	Integer.parseInt("123");
	Boolean.parseBoolean("true");
	System.out.println(Boolean.parseBoolean("true")&&true);
	System.out.println(Integer.parseInt("12345")+1);
	System.out.println("------------- ");
	
	//ʮ����-->�������ơ�
	System.out.println(Integer.toBinaryString(60));//2
	System.out.println(Integer.toOctalString(60));//8
	System.out.println(Integer.toHexString(60));//16
	System.out.println(Integer.toString(60,16));//�Զ���
	
	System.out.println("------------- ");
	
	Integer a1 = new Integer("30");
	Integer a2 = new Integer(4);
	System.out.println(a1.compareTo(a2));//�Ƚ���ֵ������1С��2
	
	
}
}
