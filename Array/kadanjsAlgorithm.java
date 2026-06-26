package Array;

import java.util.Scanner;

public class kadanjsAlgorithm {
    public static void printMax(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum= 0;
        for(int i =0;i<arr.length;i++){
            currSum = currSum+arr[i];
            if(currSum<=0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.print("max sum"+maxSum);
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int[] arr = new int [n];
        System.out.println("Entet the eelement of the array");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        printMax(arr);
    }
}
