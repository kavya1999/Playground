import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.println(sum(n));
    }
  public static int sum(int a)
  {
   int sum = 0;
    for(int i=0;i <= a;i++)
    {
      sum=sum+i;
      
    }
    return sum;
    }
	}
