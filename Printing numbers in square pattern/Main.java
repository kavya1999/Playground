import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int row=1;row<=n;row++)
      {
        for(int col=1;col<=n;col++)
        {
          System.out.print(row);
        }
        System.out.println();
      }
	}
}