import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int arrsize=in.nextInt();
      int arr[]=new int[arrsize];
      for(int i=0;i<=arrsize-1;i++)
      {
        arr[i]=in.nextInt();
      }
      int left=0;
      int right=arrsize-1;
      boolean ispalindrome=true;
      while(left<right)
      {
        if(arr[left]!=arr[right])
        {
          ispalindrome=false;
          break;
        }
        left++;
        right--;
      }
      if(ispalindrome==true)
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
    }
}
}