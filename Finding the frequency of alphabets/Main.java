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
        for(int i = 0; i < strlen; i++)
        {
            if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z')
            {
                int offset = sb.charAt(i) - 'A';
                char ch = (char)('a' + offset);
                sb.setCharAt(i, ch);
            }
            if(sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z')
            {
                freq[sb.charAt(i) - 'a']++;
            }  
        }
        for(int i1 = 0; i1 < strlen; i1++)
        {
            if(freq[sb.charAt(i1) -'a'] != 0)
            {
                System.out.print(sb.charAt(i1) +"" +freq[sb.charAt(i1)-'a'] + " ");
                freq[sb.charAt(i1) -'a'] = 0;
            }
        }
    }
}