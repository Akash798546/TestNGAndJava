package CollectionFramework;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	
	
	public static void main(String[] args)
	{
		Set<String> st=new TreeSet(new MyCompare());
		st.add("Mechanical");
		st.add("Civil");
		st.add("Computer Science");
		st.add("Electrical");
		
		/** Note: IF in MyComapre Class s1.comapare(s2)---then it will be ascending order
		and if it is like s1.comapare(s2) then it is desecnding order **/
		
		System.out.println(st);
		Iterator it=st.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
