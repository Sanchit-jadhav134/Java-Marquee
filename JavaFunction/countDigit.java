package JavaFunction;
import java.util.*;
public class countDigit {

        static int count(int n){

            int c = 0;

            while(n > 0){
                n = n / 10;
                c++;
            }

            return c;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            System.out.println(count(n));
        }

}
