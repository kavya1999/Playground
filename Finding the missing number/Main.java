import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
        arr[i]=in.nextInt();
      }
      int missingvalue=0;
      for(int value=1;value<=n;value++)
      {
        boolean isfound=false;
        for(int i=0;i<=n-1;i++)
        {
          if(arr[i]==value)
          {
            isfound=true;
            break;
          }
        }
        if(isfound==false)
        {
          missingvalue=value;
          break;
        }
      }
    
  System.out.println(missingvalue);
}
  
    }
