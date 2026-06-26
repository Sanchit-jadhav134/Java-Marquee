package JavaFunction;

import java.util.Scanner;

public class printPrime {
    public static void print(int start,int end){
        int count = 0;
        for(int i = start;i<=end;i++){
            if(i%2==0){
                count++;

            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        print(start,end);
    }
}

