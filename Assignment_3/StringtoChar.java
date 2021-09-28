package program3;

public class StringtoChar {
	public static void main(String args[])  
	{  
	//Char to string 
	char[] ch = {'D', 'E', 'V', 'L', 'A', 'B', 'S', ' ' , 'T', 'R', 'A', 'I', 'N', 'I', 'N', 'G'};  
	String string = new String(ch);  
	System.out.println(string);  
	
	//String to Char
	 String str = "DEVLABS TRAINING";
	 char[] cha = new char[str.length()];
     for (int i = 0; i < str.length(); i++) {
         cha[i] = str.charAt(i);
     }
     for (char c : cha) {
         System.out.println(c);
     }
	
	}  
}
