package JavaFunction;

import java.util.*;

public class ReplaceNumber {

    static int replace(int n){

        int x = 0;
        int place = 1;

        while(n > 0){

            int rem = n % 10;

            if(rem == 0){
                rem = 5;
            }

            x = x + rem * place;

            place = place * 10;

            n = n / 10;
        }

        return x;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(replace(n));
    }
}