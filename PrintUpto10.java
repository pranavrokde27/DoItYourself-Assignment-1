//9.Write a Java Program to Print 1 To 10 Without Using Loop. 


public class PrintUpto10 
{
    //recursive function
    static void printNumbers (int num) 
	{
        if (num <= 10) 
		{ 
            System.out.println(num);
            num++;
            printNumbers(num); 
		}
	}
   public static void main (String [] args) 
   {
        printNumbers(1);
   }
}