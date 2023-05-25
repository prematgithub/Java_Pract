package firstPacakage;
import java.util.*;
public class HashMap1 {
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm =new HashMap<Integer,String>();
		hm.put(1, "Mon");
		hm.put(2, "Tue");
		hm.put(3, "Wen");
		hm.put(4, null);
		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		System.out.println(hm.get(4));
		System.out.println(hm);
		
		
		
		
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "Jan");
		ht.put(2, "Feb");
		ht.put(3, "Mar");
		ht.put(4, "Apr");
		ht.put(5, "May");
		//ht.put(5, null);
		
		System.out.println(ht.get(1));
		System.out.println(ht.get(2));
		System.out.println(ht.get(3));
		System.out.println(ht);
	}

}
