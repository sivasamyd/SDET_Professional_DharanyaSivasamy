package program4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
	public static void main(String[] args) {  
        List<String> l = new ArrayList<String>();  
        l.add("Red");  
        l.add("Blue");  
        l.add("Green");  
        System.out.println("Before Reversing");  
        System.out.println(l.toString());  
          
        Collections.reverse(l);  
        System.out.println("After Reversing");  
        System.out.println(l);  
    }  
}
