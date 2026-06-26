package JavaFunction;

import java.util.Scanner;

public class Avgnumber {

    public static int avg(int n,int a,int b,int c){
        int sum = 0;
    sum = a+b+c;
    int avg = sum/n;
        return avg;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = avg(n,a,b,c);
        System.out.println(avg);
    }
}
