import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int arrsize=in.nextInt();
      int arr[]=new int[arrsize];
      for(int i=0;i<=arrsize-1;i++)
      {
        arr[i]=in.nextInt();
      }
      int max;
      if(arr[0]>arr[1])
      {
        max=arr[0];
      }
      else
      {
        max=arr[1];
      }
      for(int i=2;i<=arrsize-1;i++)
      {
        if(max<arr[i])
        {
          max=arr[i];
        }
      }
      System.out.println(max);
    }
}