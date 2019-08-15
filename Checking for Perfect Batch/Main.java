 import java.util.Scanner;
class Main{
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int list[] = new int[n];
for(int i = 0; i < n; i++)
{
list[i] = in.nextInt();
}
perfectbatch(list, n);
}

public static void perfectbatch(int list[], int n)
{
boolean isperfectbatch = true;
int batchsum = list[0] + list[1] + list[2];
for(int i = 3; i <= n-1 ; i = i + 3) {
int currbatchsum = list[i] + list[i + 1] + list[i + 2];
if(currbatchsum != batchsum)
{
isperfectbatch = false;
}
}
if(isperfectbatch == true)
{
System.out.println("Perfect Batch");
}
else
{
System.out.println("Not a Perfect Batch");
}
}
}