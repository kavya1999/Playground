import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[20];
    int i,j;
    for(i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
    System.out.print(sumsubsequence(arr,n));
  }
  public static int sumsubsequence(int arr[],int n)
  {
    int runsum,maxsum,i;
    runsum=arr[0];
    maxsum=arr[0];
    for(i=1;i<n;i++)
    {
      if(arr[i]>arr[i-1])
      {runsum+=arr[i];
      }
      else
      {
        runsum=arr[i];
      }
      if(runsum>maxsum)
      {
        maxsum=runsum;
      }
    }
    return maxsum;
  }
}