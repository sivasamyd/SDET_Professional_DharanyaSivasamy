package program4;

import java.util.HashMap;

public class Hashmap2 {
	public static void main(String[] args) {
		 
	    // Creating a HashMap of int keys and String values
	    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	 
	    // Adding Key and Value pairs to HashMap
	    hashmap.put(1,"One");
	    hashmap.put(2,"Two");
	    hashmap.put(3,"Three");
	    hashmap.put(4,"Four");
	    hashmap.put(5,"Five");
	 
	    // Checking Key Existence
	    boolean flag = hashmap.containsKey(2);
	    System.out.println("Key 2 exists in HashMap? : " + flag);
	 
	    boolean flag2 = hashmap.containsKey(5);
	    System.out.println("Key 5 exists in HashMap? : " + flag2);
	 
	    boolean flag3 = hashmap.containsKey(6);
	    System.out.println("Key 6 exists in HashMap? : " + flag3);
	 }
}
