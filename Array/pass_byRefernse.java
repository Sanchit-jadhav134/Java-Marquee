package Array;

import java.util.Scanner;

public class pass_byRefernse{

    public static void array(int[] arr) {

        if (arr.length > 2) {
            arr[2] = 4;
        }

        System.out.println("Inside method:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
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

        array(arr);

        System.out.println("Updated array in main:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}