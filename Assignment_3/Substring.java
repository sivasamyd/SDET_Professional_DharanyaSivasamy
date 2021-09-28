package program3;

public class Substring {
	public static void main(String[] args) {
	   
	    String txt = "A brown fox ran away fast";
	    String str1 = "brown";

	    boolean result = txt.contains(str1);
	    if(result) {
	      System.out.println(str1 + " is present in the string.");
	    }
	    else {
	      System.out.println(str1 + " is not present in the string.");
	    }
	    }
	}
