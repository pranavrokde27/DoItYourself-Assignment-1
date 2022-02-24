//7.How to check the given number is Positive or Negative in Java? 


import java.util.Scanner;

public class PositiveOrNegative {
   public static void main(String args[])
   {
      int num;
      System.out.println("Enter a number :-");
      Scanner sc = new Scanner(System.in);
      num = sc.nextInt();

      if (num > 0)
	  {
         System.out.println("Given number is a positive integer");
      } 
	  else
	  {
         System.out.println("Given number is a negative integer");
      } 
	}	  
}