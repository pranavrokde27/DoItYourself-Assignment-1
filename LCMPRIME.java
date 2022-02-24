//18.Write a java program to LCM of TWO given number using Prime Factors method. 


//This is sample program to calculate the GCD and LCM of two given numbers
import java.util.Scanner;
 
public class LCM 
{
    static int lcm(int x, int y)
    {
        int a;
        a = (x > y) ? x : y; // a is greater number
        while(true)
        {
            if(a % x == 0 && a % y == 0)
                return a;
            ++a;
        }	
    }
 
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int x = input.nextInt();
        int y = input.nextInt();
 
        
        System.out.println("The LCM of two numbers is: " + lcm(x, y));
        input.close();		
    }
}