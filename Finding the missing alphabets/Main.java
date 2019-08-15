 import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int strlen = sb.length();
        int freq[] = new int[70]; 
        for(int i = 0; i < 70; i++){
            freq[i] = 0;
        }
       
      for(int i=0;i<strlen;i++)
      {
        if(sb.charAt(i)>='A'&&sb.charAt(i)<='Z')
        {
          freq[sb.charAt(i)-'A']++;
        }
        if(sb.charAt(i)>='a'&&sb.charAt(i)<='z')
        {
          freq[sb.charAt(i)-'a']++;
        }
      }
          for(int i=0;i<=25;i++)
          {
            if(freq[i]==0)
            {
              char missing=(char)(i+'a');
              System.out.print(missing + " ");
            }
          }
        }
    }