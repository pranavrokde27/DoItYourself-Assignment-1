//1.Check the given number is EVEN or ODD

import java.util.*;
	class EVEN_ODD
		{
			public static void main(String[] args)
			{
				Scanner sc = new Scanner(System.in);
				System.out.print("enter the number :- ");
				int num = sc.nextInt();
				if(num%2==0)
				{	
					System.out.println("Entered num "+num+"is :- Even");
					
				}
				else
				{
					System.out.println("Entered num "+num+" "+"is :- Odd");
				}
			}
		}