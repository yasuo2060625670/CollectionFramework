package Collection;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionToArray {
public static void main(String[] args) {
	Collection c = new  ArrayList();
	c.add("haha1");
	c.add("haha2");
	c.add("haha3");http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=3274405
	c.add("haha4");
	    Object[] obj =c.toArray();	
	    for (int i = 0; i < obj.length; i++) {
			String str = (String)obj[i];
			System.out.println(str);
		}
	
}
}
