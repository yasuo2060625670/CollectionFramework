package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class setDemo {
public static void main(String[] args) {
	HashSet<String> sh = new LinkedHashSet<String>();
	sh.add("a2");
	sh.add("a4");
	sh.add("a3");
	sh.add("a1");
	sh.add("a1");
	sh.add("a1");
	Iterator it = sh.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
}
