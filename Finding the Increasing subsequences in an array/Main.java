import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in=new Scanner(System.in);
    int arrsize=in.nextInt();
    int arr[]=new int[arrsize];
    for(int i=0;i<arrsize;i++)
    {
      arr[i]=in.nextInt();
    }
    int sum[]=new int[3*arrsize];
    increasingarray(arrsize,arr,sum);
  }
  public static void increasingarray(int arrsize,int arr[],int sum[])
  {
    for(int i1=0;i1<=arrsize-1;i1++)
    {
      int key=arr[i1];
      for(int i2=i1+1;i2<=arrsize-1;i2++)
      {
        if(arr[i2]>key)
          System.out.println(key+","+arr[i2]+" ");
      }
    }
  }
}