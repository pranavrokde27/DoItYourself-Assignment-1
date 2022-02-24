//2.Write a Java Program to find the Factorial of given number.

import java.util.*;

class Factorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to find Factorial :- ");
		int num = sc.nextInt();
		int i,fact = 1;
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" " +"is :-"+"  "+fact);
	}
}