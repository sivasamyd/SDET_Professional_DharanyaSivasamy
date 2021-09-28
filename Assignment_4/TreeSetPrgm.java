package program4;

import java.util.TreeSet;

public class TreeSetPrgm {
	public static void main(String[] args) {
		 
	    //create TreeSet object
	    TreeSet tSet = new TreeSet();
	   
	    //add elements to TreeSet
	    tSet.add("1");
	    tSet.add("3");
	    tSet.add("2");
	    tSet.add("5");
	    tSet.add("4");
	    System.out.println("Lowest value Stored in Java TreeSet is : " + tSet.first());
  	    System.out.println("Highest value Stored in Java TreeSet is : " + tSet.last());
	 
	  }
}
