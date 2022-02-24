//11.Write a Java Program to print all the Factors of the Given number. public class Main {




import java.util.*;
class Factors
{
  public static void main(String[] args) {

	System.out.print("Enter the number :- ");
    Scanner sc = new Scanner(System.in);
    int number ;
	number = sc.nextInt();
	
    System.out.print("Factors of " + number + " are: ");

    
    for (int i = 1; i <= number; ++i) {

      // if number is divided by i
      // i is the factor
      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}