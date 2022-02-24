//3.Find the Factorial of a number using Recursion.


import java.util.*;
 class FactorialRecurrsion
 {
	 static int factorial(int num)
	{
		 if(num == 0)
			 return 1;
		 else
			 return(num*factorial(num-1));

	}
	public static void main(String[]  args)
	{
		int fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to find Factorial :- ");
		int num = sc.nextInt();
		fact = factorial(num);
		System.out.print("Factorial of " + num +"is :-"+ " " +fact);
		
	}
 } 