package Array;

import java.util.Scanner;

public class EvenArray {

    static boolean check(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        boolean ans = check(arr, target);

        if (ans) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }

        sc.close();
    }
}