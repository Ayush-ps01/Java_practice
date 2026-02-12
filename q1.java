//find the no. of occurance of x in an array

import java.util.Scanner;
public class q1{
     static int coutnOccurance(int[] arr, int x){
        int count =0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==x) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();

        int[] arr_1 = new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr_1[i] = sc.nextInt();
        }
        System.out.println("enter X");
        int x = sc.nextInt();
        System.out.println(coutnOccurance(arr_1,x));
//        for(int i=0;i<n;i++){
//            if(arr[i]==x){
//                System.out.println(i);
//                return;
//            }
//        }
    }
}
    

    


        