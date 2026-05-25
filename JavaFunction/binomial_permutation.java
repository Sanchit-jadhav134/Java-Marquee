package JavaFunction;
import  java.util.*;

public class binomial_permutation {
static int fact(int n){
    int f = 1;
    for(int i = 1;i<=n;i++){
        f *= i;
    }
    return f;
}
public static  void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();
    int bioCoe = fact(n) / ((fact(n-1)*fact(r)));
    System.out.println(bioCoe);
    int per = fact(n) / fact(n-r);
    System.out.println(per);
}
}
