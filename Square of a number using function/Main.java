import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.println(square(n));
    }
  public static int square(int a)
  {
    int res=a*a;
    return res;
  
	} 
}