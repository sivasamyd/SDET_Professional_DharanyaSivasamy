package program1;

import java.util.Scanner;  

public class FactorialUsingWhileLoop {  
    public static void main(String[] args) {  
          
        //declaring and intializing variables   
        int fact = 1;  
        int i = 1;  
  
        //creating object of Scanner classs  
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);  
  
        //accepting a number from the user  
        System.out.println("Enter a number: ");  
        int num = sc.nextInt();  
          
        //counting the factorial using while loop  
        while( i <= num ){  
            fact = fact * i;   
            i++;   
        }     
  
        //printing the result  
        System.out.println("\nFactorial of " + num + " is: " + fact);  
    }  
}  
