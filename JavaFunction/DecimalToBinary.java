package JavaFunction;

import java.util.Scanner;

public class DecimalToBinary {
    public static void binary(int n){
        int pow = 0;
        int binarry = 0;
        while(n>0){
            int rem = n%2;
            binarry = binarry + rem*(int)Math.pow(10,pow);
            pow++;
            n = n/2;
        }
        System.out.println(binarry);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binary(n);
    }
}
