//move zeros to end of array
import java.util.*;
public class q10 {
    public static void MoveZeros(int[] arr){
        int slow = 0;
        for(int fast=0;fast<arr.length;fast++){
            if(arr[fast]!=0){
                int temp = arr[slow];
                arr[slow]=arr[fast];
                arr[fast]=temp;

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
        MoveZeros(arr);
        for(int num:arr){
            System.out.println(num+" ");
        }

    }
}
