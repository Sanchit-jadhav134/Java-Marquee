package Array;
import java.util.Scanner;

public class Subarray {
public static void sub(int arr[]){
    for(int i = 0;i<arr.length;i++){
        int start = i;
        for(int j = i+1;j<arr.length;j++){
            int end = j;
            for(int k = start;k<end;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
    }
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element : ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sub(arr);
    }
}
