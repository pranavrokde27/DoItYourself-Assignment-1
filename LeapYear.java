//8.Write a Java Program to find whether given number is Leap year or NOT? 

import java.util.*;
class LeapYear
{
	public  static void main(String[] args)
	{
	  int year;
      System.out.println("Enter a Year :-");
      Scanner sc = new Scanner(System.in);
      year = sc.nextInt();

      if (year%4 == 0)
	  {
         System.out.println("Given Year is a Leap Year");
      } 
	  else
	  {
         System.out.println("Given Year is not a Leap Year");
      } 
	}
}