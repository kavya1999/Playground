 import java.util.Scanner;
class Main
{
    public static void main(String args[])    
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int freq[] = new int[n];
        int idx = repeatedelement(arr,n,freq);
        int max = maxindex(freq,n,idx);
        System.out.print(max);
    }
    public static int repeatedelement(int arr[], int n, int freq[])
    {
        int i;
        int count=0;
        int freqidx = 0;
        for(i = 0; i < n ; i++)
        {
            if(arr[i] == 1)
            {
                count++;
            }
            if((arr[i] == 0) || (i == n-1))
            {
                freq[freqidx] = count;
                count = 0;
                freqidx++;
            }
        }
        return freqidx-1;
    }
    public static int maxindex(int freq[], int n, int idx)
    {
        int maxno = 0;
        if((freq[0] > freq[1]) || (idx == 0))
        {
            maxno = freq[0];
        }
        else
        {
            maxno = freq[1];
        }
        for(int i = 2; i < idx ; i++)
        {
            if(maxno < freq[idx])
            { 
                maxno = freq[idx];
            }
        }
    return maxno;
    }
}