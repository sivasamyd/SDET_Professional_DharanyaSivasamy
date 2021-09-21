package program1;

public class Triangle {
	public static void main(String args[])   
	{    
	int i, j, row = 10;       
	//Outer loop  
	for (i=0; i<row; i++)   
	{  
	//inner loop       
	for (j=row-i; j>1; j--)   
	{  
	//prints space between two zeros  
	System.out.print(" ");   
	}   
	//inner loop for columns  
	for (j=0; j<=i; j++ )   
	{   
	//prints star      
	System.out.print("0 ");   
	}   
	//throws the cursor in a new line after printing each line  
	System.out.println();   
	}   
	}   
	

}
