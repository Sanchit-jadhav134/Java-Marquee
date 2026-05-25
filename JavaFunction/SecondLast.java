package JavaFunction;

import java.util.*;

public class SecondLast {

    static boolean check(int n){

        n = n / 10;

        int rem = n % 10;

        if(rem % 2 == 0){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(check(n));
    }
}