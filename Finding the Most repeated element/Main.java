import java.util.Scanner;
class Main
{
  static int mostfreq(int arr[],int n,int freq[])
  {
    int maxidx=0;
    int count=1;
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(arr[i]==arr[j])
          count++;
      }
      freq[i]=count;
      count=1;
    }
    for(int i=0;i<n;i++)
    {
      if(freq[i]>freq[maxidx])
        maxidx=i;
    }
    return arr[maxidx];
  }
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
      int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
    int freq[]=new int[n];
    System.out.println(mostfreq(arr,n,freq));
  }
}