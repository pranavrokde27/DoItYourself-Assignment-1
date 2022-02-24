//13.Write a Java Program to find the smallest of 3 numbers (a,b,c) without using < or > symbol? 
import java.util.*;
class SmallestAmong3 {
 
    static int smallest(int x, int y, int z)
    {
        int c = 0;
 
        while (x != 0 && y != 0 && z != 0) {
            x--;
            y--;
            z--;
            c++;
        }
 
        return c;
    }
 
    public static void main(String[] args)
    {
			int x,y,z;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a value of x :-"); 
		  x = sc.nextInt();
		 System.out.println("Enter a value of y :-");
		  y = sc.nextInt();
		  System.out.println("Enter a value of z :-");
		  z = sc.nextInt();
		  
 
        System.out.printf("Minimum of 3"+ " numbers is %d",smallest(x, y, z));
    }
}