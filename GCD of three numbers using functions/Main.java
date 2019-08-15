 import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    Scanner in = new Scanner(System.in);
	    int n1 = in.nextInt();
	    int n2 = in.nextInt();
	    int n3 = in.nextInt();
	    int result = gcd(n1, n2);// Function call
	    System.out.print(gcd(n1, n2));// Function call
	}
	// Function to find the gcd of 2 numbers
	public static int gcd(int num1, int num2)
	{
	    int min;
	    if(num1 < num2)
	    {
	        min = num1;
	    }
	    else{
	        min = num2;
	    }
	    while(min >= 1)
	    {
	        if((num1 % min == 0) &&(num2 % min == 0))
	        {
	            return min;
	        }
	        --min;
	    }
	    return 0;
	}
}