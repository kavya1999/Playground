import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int arrsize=in.nextInt();
      int arr[]=new int[arrsize];
      for(int i=0;i<=arrsize-1;i++)
      {
        arr[i]=in.nextInt();
      }
      subset(arrsize,arr);
    }
  public static void subset(int arrsize,int arr[])
  {
    for(int i1=0;i1<=arrsize-2;i1++)
    {
      for(int i2=i1+1;i2<=arrsize-1;i2++)
      {
        for(int i3=i2+1;i3<=arrsize-1;i3++)
        {
          System.out.print("(" + arr[i1] + "," + " " + arr[i2] + "," + " " + arr[i3] + ")"+ " ");
        }
      }
        System.out.println();
      }
    }
  }
    