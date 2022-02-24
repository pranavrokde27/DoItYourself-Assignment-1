//19.Check whether the Given Number is a Palindrome or NOT. 
import java.util.*;
class Palindrome
{  
	 public static void main(String args[])
	{  
	  int r,sum=0,temp;    
	  //int n=;
	  System.out.print("Enter the number to check:- ");
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  
	  temp=n;    
	  while(n>0)
	  {    
	   r=n%10;    
	   sum=(sum*10)+r;    
	   n=n/10;    
	  }    
	  if(temp==sum)    
	   System.out.println("palindrome number ");    
	  else    
	   System.out.println("not palindrome");    
	}  
}  

