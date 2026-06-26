package JavaFunction;
import java.util.*;
public class binomailCoefficient {
    public static int fact(int n){
        int fac = 1;
        for(int i = 1;i<=n;i++){
            fac = fac*i;

        }
        return fac;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        System.out.println("enter r:");
        int r= sc.nextInt();
        int binomail = fact(n)/(fact(r)*fact(n-r));
        System.out.println(binomail);
    }
}
