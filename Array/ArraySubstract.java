package Array;

import java.util.HashMap;

public class ArraySubstract {

    public static int[] sumArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int[] result = new int[n + 1];
        int carry = 0;

        for (int i = n - 1; i >= 0; i--) {
            int sum = arr1[i] + arr2[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }

        result[0] = carry;
        return result;
    }

    public static int[] subtractArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        int borrow = 0;

        for (int i = arr1.length - 1; i >= 0; i--) {
            int a = arr1[i] - borrow;
            int b = arr2[i];

            if (a < b) {
                a += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            result[i] = a - b;
        }

        return result;
    }

    public static int maxDuplicateDistance(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxDistance = 0;

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                maxDistance = Math.max(maxDistance, i - map.get(arr[i]));
            } else {
                map.put(arr[i], i);
            }
        }

        return maxDistance;
    }

    public static int shortBetweenEven(int[] arr) {
        int prev = -1;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (prev != -1) {
                    min = Math.min(min, i - prev);
                }
                prev = i;
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public static int countLessThanX(int[] arr, int x) {
        int count = 0;

        for (int num : arr) {
            if (num < x) {
                count++;
            }
        }

        return count;
    }

    public static int[] subtractDifferentSize(int[] arr1, int[] arr2) {
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int[] result = new int[arr1.length];
        int borrow = 0;

        for (int k = result.length - 1; k >= 0; k--) {
            int a = (i >= 0) ? arr1[i] : 0;
            int b = (j >= 0) ? arr2[j] : 0;

            a -= borrow;

            if (a < b) {
                a += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            result[k] = a - b;
            i--;
            j--;
        }

        return result;
    }

    public static void printArray(int[] arr) {
        int start = 0;

        while (start < arr.length - 1 && arr[start] == 0) {
            start++;
        }

        for (int i = start; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 0, 7};

        int[] sumResult = sumArray(arr1, arr2);
        printArray(sumResult);

        int[] subtractResult = subtractArray(arr1, arr2);
        printArray(subtractResult);

        int[] duplicateArr = {1, 2, 3, 1, 4, 2, 1};
        System.out.println(maxDuplicateDistance(duplicateArr));

        int[] evenArr = {1, 2, 3, 3, 4, 5, 6, 4, 4};
        System.out.println(shortBetweenEven(evenArr));

        int[] lessArr = {1, 5, 2, 7, 3, 9};
        System.out.println(countLessThanX(lessArr, 5));

        int[] a = {9, 0, 0};
        int[] b = {1, 0};

        int[] diff = subtractDifferentSize(a, b);
        printArray(diff);
    }
}