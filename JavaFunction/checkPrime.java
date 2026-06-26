package JavaFunction;
import java.util.*;
public class checkPrime {
    public static void prime(int n) {
        int count = 0;
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("is prime");
        }else{
            System.out.println("not prime");
        }
    }
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime(n);
        }

}
