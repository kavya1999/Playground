import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
        arr[i]=in.nextInt();
      }
      int frequency[]=new int[k];
      for(int i1=0;i1<=k-1;i1++)
      {
        frequency[i1]=0;
      }
      for(int i=0;i<=n-1;i++)
      {
        frequency[arr[i]-1]++;
      }
      for(int i=0;i<=k-1;i++)
      {
        System.out.println((i+1)+" "+frequency[i]);
      }
    }
}