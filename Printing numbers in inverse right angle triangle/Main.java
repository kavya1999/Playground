import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int val=n;
      for(int row=1;row<=n;row++)
      {
        for(int col=val;col>=1;col--)
        {
          System.out.print(col);
        }
        val--;
        System.out.println();
      }
        
	}
}