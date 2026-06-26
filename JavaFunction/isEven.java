package JavaFunction;

import java.util.Scanner;

public class isEven {
    public static  boolean check(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       boolean even = check(n);
        System.out.println(even);
    }
}
