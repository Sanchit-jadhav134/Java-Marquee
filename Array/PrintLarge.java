package Array;

import java.util.Scanner;

public class PrintLarge {
    public static void check(int arr[]){
        int large = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>=large){
                large = arr[i];
            }
        }
        System.out.println("Large element is "+large);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("element of array");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        check(arr);
    }
}
