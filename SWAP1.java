//4.Swap two numbers without using third variable approach 1. 

import java.util.*;  
class SWAP1  
{  
    public static void main(String args[])   
    {   
        System.out.print("Enter the value of a and b");  
        Scanner sc = new Scanner(System.in);   
        int a = sc.nextInt();  
        int b = sc.nextInt();  
        System.out.println("before swapping numbers: "+a +" "+ b);    
        a = a + b;   
        b =  a - b;   
        a = a - b;   
        System.out.println("After swapping: "+a +"  " + b);   
    }   
}  