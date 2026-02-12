//checking array is sorted or not
import java.util.Scanner;

public class q3 {
    static String checkSorted(int[] arr){
        for(int i = 1;i< arr.length;i++){
                if(arr[i]<arr[i-1]){
                    return "NO";
                }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(checkSorted(arr));
    }
}
