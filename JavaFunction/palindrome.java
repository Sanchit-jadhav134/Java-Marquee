package JavaFunction;

import java.util.Scanner;

public class palindrome {
    public static int check(int n){
        int rev = 0;
        while (n !=0){
            int digit = n%10;
            rev = rev*10+digit;
            n/=10;

        }
        return rev;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int revrse = check(n);
        if(n==revrse){
            System.out.println("number is palindrome");
        }else{
            System.out.println("number is not palindrome ");
        }
    }
}
