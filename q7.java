import java.util.Scanner;

// find unique no. where all the element of array are repeated twice
public class q7 {
    static int uniqueNo(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans = arr[i];
            }
        }
        return ans;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(uniqueNo(arr));

    }

}
