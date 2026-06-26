package JavaFunction;

import java.util.Scanner;

public class ArmStrong {

    public static boolean arm(int n) {
        int temp = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        while (temp != 0) {
            int last = temp % 10;
            sum += (int) Math.pow(last, digits);
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (arm(n)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }

        sc.close();
    }
}