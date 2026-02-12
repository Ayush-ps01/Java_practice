import java.util.Scanner;
//find second maximum in array
public class q8 {
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static int seccondMax(int[] arr){
        int max = findMax(arr);
        for (int i=0;i<arr.length;i++){
            if (arr[i] == max){
                arr[i]= Integer.MIN_VALUE;
            }
        }
        int seccond = findMax(arr);

        return seccond;
    }

//    static int secondMax(int[] arr){
//        int max = Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==max){
//                arr[i]=Integer.MIN_VALUE;
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        return max;
//    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(seccondMax(arr));
    }
}
