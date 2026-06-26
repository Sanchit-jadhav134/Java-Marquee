package loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class solidRhombs {
    public static void printsolid(int n){
        for(int i = 1;i<n;i++){
            for(int j = 1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printhollow(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=n;j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Hollow Rhombs");
        printhollow(n);
        System.out.println();
        System.out.println("Solid Rhombs");
        printsolid(n);
    }
}
