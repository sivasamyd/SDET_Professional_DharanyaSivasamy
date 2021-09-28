package program4;

import java.util.ArrayList;
import java.util.Collections;

public class SortArraylist {
	public static void main(String args[]){
		   ArrayList<String> listofcountries = new ArrayList<String>();
		   listofcountries.add("One");
		   listofcountries.add("Six");
		   listofcountries.add("Three");
		   listofcountries.add("Four");

		   /*Unsorted List*/
		   System.out.println("Before Sorting:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}

		   /* Sort statement*/
		   Collections.sort(listofcountries);

		   /* Sorted List*/
		   System.out.println("After Sorting:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}
		}
}
