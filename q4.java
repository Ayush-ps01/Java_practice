//check smallest and largest from given array and return array storing smallest and largest

import java.util.Scanner;

public class q4 {
    static int[] smallestAndLargest(int[] arr){
        int smallest=arr[0];
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }else if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return new int[]{smallest,largest};
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of  array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int [] ans = smallestAndLargest(arr);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}
