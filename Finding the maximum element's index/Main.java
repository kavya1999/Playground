import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int list[]=new int[n];
    int maxi;
    for(int i=0;i<n;i++)
    {
      list[i]=in.nextInt();
    }
    if(list[0]>list[1])
    {
      maxi=0;
    }
    else
    {
      maxi=1;
    }
    for(int i=2;i<=n-1;i++)
    {
      if(list[maxi]<list[i])
      {
        maxi=i;
      }}
    System.out.println(maxi);
  }
}