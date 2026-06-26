package Array;
import java.util.*;
public class reverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int j = 0;
    int[] arr1 = new int[n];
        for(int i = arr1.length-1;i>=0;i--){
            arr1[j] = arr[i];
            j++;
        }
        for(int i = 0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
