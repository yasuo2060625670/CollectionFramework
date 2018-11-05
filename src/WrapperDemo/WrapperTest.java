package WrapperDemo;

import java.lang.reflect.Array;

/*
 * ��һ���ַ����е���ֵ�Ӵ�С����
 * 1����ȡ�ַ����е���ֵ*/
public class WrapperTest {
	public static void main(String[] args) {
	String str = "12 23 67 89 56 24";
	String[] arr = getArray(str);
	   printArray(arr);
	   strSort(arr);
System.out.println(getString(arr));
	   
	
}
	public static String getString(String [] arr)//���ַ�������ϲ���һ��
{
	StringBuilder str = new StringBuilder();
	for (int i = 0; i < arr.length; i++) {
		if(i!=arr.length-1)
			str = str.append(arr[i]+" ");
		else
			str = str.append(arr[i]);
	}
	return str.toString();
	
}
	
public static String[] getArray(String str)//�ַ���-�ַ�������
{
	String[] arr = str.split(" ");
	return arr;
}
	public static void strSort(String[] arr) {//ֱ�Ӷ��ַ���������бȽ�
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(Integer.parseInt(arr[i])>Integer.parseInt(arr[j]))
					swap(arr,i,j);
			}
		}
		
		
	}
	public static void printArray(String[] arr) {//����
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			if(i!=arr.length-1){
				System.out.print(arr[i]+",");
			}
			else	
			System.out.println(arr[i]+"}");
			}
	}

	private static void swap(String[] arr, int i, int j) {
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
