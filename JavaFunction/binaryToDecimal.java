package JavaFunction;

import java.util.Scanner;

public class binaryToDecimal {

    public static int decimal(int n) {
        int pow = 0;
        int decimal = 0;

        while (n > 0) {
            int last = n % 10;
            decimal += last * (int) Math.pow(2, pow);
            pow++;
            n /= 10;
        }

        return decimal;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int n = sc.nextInt();

        System.out.println("Decimal = " + decimal(n));

        sc.close();
    }
}