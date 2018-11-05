package genericDemo;
interface Inter<T>
{
	void show(T t);
}
/*
 * 接口不知道，类也不知道*/
class InterImpl2<Q> implements Inter<Q>
{

	@Override
	public void show(Q q) {
		// TODO Auto-generated method stub
		System.out.println("show "+q);
	}
	
}
/*
 * 接口知道，类知道*/
class InterImpl implements Inter<Integer>
{
	
	@Override 
	public void show(Integer i) {
		// TODO Auto-generated method stub
		System.out.println("show "+i);
	}
	
}
public class GenericDifineDemo2 {
public static void main(String[] args) {
	
	InterImpl2<Integer> i2 = new  InterImpl2<Integer>();
	i2.show(22);
	InterImpl i1 = new InterImpl();
	i1.show(128);
}
}
