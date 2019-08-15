 import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);
        StringBuilder temp = new StringBuilder("");
        int sb1len = sb1.length();
        int sb2len = sb2.length();
        
        for(int i = 0; i <= (sb1len -1); i++){
            char ch = sb1.charAt(i);
            temp.append(ch);     
        }
        for(int i = 0; i <= (sb1len -1); i++){
            char ch = sb1.charAt(i);
            temp.append(ch);     
        }
        int templen = temp.length();
       
        int i = substringsearching(temp, templen, sb2, sb2len);
        if(i != -1){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
    public static int substringsearching(StringBuilder str1, int str1len, StringBuilder str2, int str2len)
    {
        int matchingi = -1;
        for (int i1 = 0; i1 < (str1len - str2len + 1); i1++)
        {
            boolean ismatch= true;
            for(int j = 0; j < str2len; j++)
            {
                if(str1.charAt(i1 + j) != str2.charAt(j))
                {
                    ismatch = false;
                }
            }
            if(ismatch == true)
            {
                matchingi = i1;
                break;
            }
        }
        return matchingi;
    }
}