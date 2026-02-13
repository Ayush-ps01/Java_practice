//move negatives in front of array
import java.util.*;
public class Q11 {
    public static void Movenegative(int[] arr){
        int slow = 0;
        for(int fast=0;fast<arr.length;fast++){
            if(arr[fast]!=0){
                int temp = arr[fast];
                arr[fast]=arr[slow];
                arr[slow]=temp;

                slow++;
            }
        }
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Movenegative(arr);
        for(int num:arr){
            System.out.println(num+" ");
        }

    }
}
