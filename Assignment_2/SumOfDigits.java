package program2;

public class SumOfDigits {
 
	static int findSum(int number)  
	{         
	int sum = 0;   
	while (number != 0)  
	{      
	sum = sum + number % 10;    
	number = number/10;  
	}  
	//returns the summm 
	return sum;  
	}  
	//driver code  
	public static void main(String args[])  
	{  
	int number = 1234;  
	//calling the user-defined method and prints the result   
	System.out.println("The sum of digits: "+findSum(number));  
	}  
	

}
