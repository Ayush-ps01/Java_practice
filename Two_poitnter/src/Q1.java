//moving negative in front of array using two pointer
import java.util.*;
public class Q1 {
     static void MoveNegative(int[] arr){
        int slow =0;
        for(int fast=0;fast<arr.length;fast++){
            if(arr[fast]<0){
                int temp=arr[fast];
                arr[fast]=arr[slow];
                arr[slow]=temp;
                slow++;
            }
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        MoveNegative(arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }


}
