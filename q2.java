//last occurence of a no.
import java.util.Scanner;

public class q2 {
    static int lastOccurence(int[] arr,int x){
        int lastIndex =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        System.out.println(lastOccurence(arr,x));

    }
}
