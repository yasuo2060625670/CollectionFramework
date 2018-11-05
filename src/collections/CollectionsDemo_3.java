package collections;

import java.util.ArrayList;
import java.util.List;

class MyList 
{
	private List<Object> list;
	private final static Object lock = new Object();
	MyList(List list)
	{
		this.list = list;
	}
	public boolean myAdd(Object e)
	{
		synchronized (lock) {
			
			return list.add(e);
		}
	}
	public boolean myRemove(Object e)
	{
		synchronized (lock) {
		return list.remove(e);
		}
	}
}
class MyCollections
{
	 private MyList list;
	public static List synList(List list) {
		
		
		
		return (List) new MyList(list);
		
	}
}
public class CollectionsDemo_3 {
public static void main(String[] args) {
	List list = new ArrayList();
	list= MyCollections.synList(list);
}
}
