//12.Write a Java Program to find sum of the digits of a given number.

import java.util.Scanner;  
/*public class SumOfDigits   
{  
	public static void main(String args[])  
	{  
			int number, digit, sum = 0;  
			Scanner sc = new Scanner(System.in);  
			System.out.print("Enter the number: ");  
			number = sc.nextInt();  
		while(number > 0)  
		{  
			   
			digit = number % 10;  
		 
			sum = sum + digit;  
			
			number = number / 10;  
		}  
		 
		System.out.println("Sum of Digits: "+sum);  
	}  
}  */


public class SumOfDigits 
{  
 
static int findSum(int number)  
{     
    
int sum = 0;  

while (number != 0)  
{  
    
sum = sum + number % 10;  

number = number/10;  
}  

return sum;  
}  
 
public static void main(String args[])  
{  
			int number ; 
			Scanner sc = new Scanner(System.in);  
			System.out.print("Enter the number: ");  
			number = sc.nextInt();   
			System.out.println("The sum of digits: "+findSum(number));  
}  
}  