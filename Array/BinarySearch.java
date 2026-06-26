package Array;

import java.util.Scanner;

public class BinarySearch {
    public static int check(int[] arr,int key){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }if(arr[mid]<key){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
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
        System.out.println("Enter key for Search");
        int key = sc.nextInt();
        int found = check(arr,key);
        System.out.println("Key found at index"+found);
    }
}
