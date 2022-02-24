//14.How to add two numbers without using the arithmetic operators in Java? 


import java.util.*;
 
class ADD {
 
  static int add(int a, int b) 
  {
    for (int i = 1; i <= b; i++) 
    {
      a++;
    }
    return a;
  }
 
 
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number a: ");
		int a= sc.nextInt();
		
		System.out.print("Enter the number b: ");
		int b= sc.nextInt();
		
		int c =add(a, b); 
		System.out.print("sum is: "+c);
  }
 
}