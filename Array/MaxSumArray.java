package Array;

import java.util.Scanner;

public class MaxSumArray {
    public static void max(int arr[]){
        int minSum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            int start = i;
            for(int j = i+1;j<arr.length;j++) {
                int end = j;
                int currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum = currSum + arr[k];
                    System.out.println("current sum : " + currSum);
                    if (currSum > minSum) {
                        minSum = currSum;
                    }
                }
            }
        }
        System.out.print("max sum"+minSum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int[] arr = new int [n];
        System.out.println("Entet the element of the array");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        max(arr);
    }
}
