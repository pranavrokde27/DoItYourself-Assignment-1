//10.Write a Java Program to print the digits of a Given Number.

import java.util.*;
public class DigitPosition 
{
    public static void main(String args[])
    {
        int n, m, a, i = 1, position = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = sc.nextInt();
        m = n;
        while(n > 0)
        {
            n = n / 10;
            position++;
        }
        while(m > 0)
        {
            a = m % 10;
            System.out.println("Digits at position "+position+":"+a);
            m = m / 10;
            position--;
        }
    }
} 