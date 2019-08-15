import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner in=new Scanner(System.in);
      String str1=in.nextLine();
      String str2=in.nextLine();
      String str3=in.nextLine();
      StringBuilder sb1=new StringBuilder(str1);
       StringBuilder sb2=new StringBuilder(str2);
       StringBuilder sb3=new StringBuilder(str3);
      StringBuilder temp=new StringBuilder("");
      int sb1len=sb1.length();
      int sb2len=sb2.length();
      int sb3len=sb3.length();
      int i,j;
      for(i=0;i<=(sb1len-1)-(sb2len-1);i++)
      {
        boolean ismatch=true;
        for(j=0;j<sb2len;j++)
        {
          if(sb1.charAt(i+j)!=sb2.charAt(j))
          {
            ismatch=false;
          }
        }
        if(ismatch==true)
        {
          String strng=sb3.substring(0,sb3len);
            temp.append(strng);
          i=i+(sb2len-1);
        }
        else
        {
          char ch=sb1.charAt(i);
          temp.append(ch);
        }
      }
      for(j=i;j<=(sb1len-1);j++)
      {
        char ch=sb1.charAt(j);
        temp.append(ch);
      }
      System.out.println(temp);
    }
}