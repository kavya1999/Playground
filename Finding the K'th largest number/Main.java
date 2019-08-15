 import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i= 0; i <= n - 1; i++){
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        
        selectionsort(n, arr);
        System.out.println(arr[n-k]);
    }
    public static void selectionsort(int n, int arr[]){
        for(int startidx = 0; startidx <= n - 2; startidx++)
        {
            int minidx = findminimunidx(startidx, arr, n-1);
            swap(startidx, minidx, arr);
        }
    }
     public static void swap(int startidx, int minidx, int arr[]){
         int temp = arr[startidx];
         arr[startidx] = arr[minidx];
         arr[minidx] = temp;
     }
     public static int findminimunidx(int startidx, int arr[], int endidx){
         int minidx = 0;
         if(arr[startidx] < arr[startidx + 1])
         {
             minidx = startidx;
         }
         else{
             minidx = startidx + 1;
         }
         for(int i = startidx + 2; i <= endidx; i++){
             if(arr[minidx] > arr[i])
             {
                 minidx = i;
             }
         }
         return minidx;
     }
}