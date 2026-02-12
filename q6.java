// find triplet sum whose sum is equal to x
import java.util.Scanner;

public class q6{
    static int pairSum(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                 for (int k = j + 1; k < arr.length; k++) {
                     if (arr[i] + arr[j] + arr[k] == target) {
                        count = count + 1 ;
                    }
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(pairSum(arr, target));
    }
}


