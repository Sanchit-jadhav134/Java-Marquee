package Array;

import java.util.Scanner;

public class PairinArray {
    public static void pair(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int curr = arr[i];
            for(int j = i+1;j< arr.length;j++){
                System.out.print("("+curr+" , "+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements :");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        pair(arr);
    }
}
