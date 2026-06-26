package JavaFunction;

import java.util.Scanner;

public class Sum {
    public static int add(int n){
        int sum = 0;
        while(n!=0){
           int last = n%10;
           sum = sum+last;
           n = n/10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = add(n);
        System.out.println(sum);
    }
}
