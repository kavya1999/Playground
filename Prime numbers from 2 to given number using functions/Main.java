import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in= new Scanner(System.in);
      int n=in.nextInt();
      for(int i=2;i<=n;i++)
      {
        if(prime(i))
        {
          System.out.println(i);
        }
	}
}
  public static boolean prime(int m)
  {
    boolean prime = true;
    for (int no=2;no<=m/2;no++)
    {
      if(m%no==0)
      {
        prime=false;
        break;
      }
    }
    return prime;
  }
}