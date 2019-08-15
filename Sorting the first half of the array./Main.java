import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int list[]=new int[n];
    for(int i=0;i<n;i++)
      
    {
      list[i]=in.nextInt();
    }
    insertion(n,list);
  }
  public static void insertion(int n,int list[])
  {
    for(int i1=0;i1<n/2;i1++)
    {
      int key=list[i1];
      int i2=i1-1;
      while((i2>=0)&&(list[i2]>key))
      {
        list[i2+1]=list[i2];
        i2--;
      }
      list[i2+1]=key;
    }
    for(int i3=0;i3<n;i3++)
    {
      System.out.print(list[i3]+" ");
    }
  }
}