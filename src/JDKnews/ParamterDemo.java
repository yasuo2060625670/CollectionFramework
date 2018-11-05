package JDKnews;

public class ParamterDemo {
	public static void main(String[] args) {
		
		int [] arr = {1,3,45,6,3};
		int sum1 = oldAdd(arr);
		System.out.println(sum1);
		
		int sum2 = newAdd(1,3,45,63);//自动将元素封装成数组
		System.out.println(sum2);
		
	}
	public static int oldAdd(int [] arr)
	{
		int sum = 0 ;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	public static int newAdd(int...arr)//简化版本数组可以直接输入
	{
		int sum = 0 ;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
}
