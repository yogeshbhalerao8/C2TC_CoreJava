package PracticeExamples;
import java.util.HashSet;
import java.util.Iterator;
public class HashInterface {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
//		TreeSet is for sorting the 
		hs.add("Hash");
	    hs.add("Set");
		hs.add("Demo");
		hs.add("Demo");
		// It will put demo just one time because set cannot duplicate the value
		Iterator i=hs.iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			System.out.println(o);
		}
	}

}
