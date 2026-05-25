package JavaFunction;
import java.util.*;
public class EvenSum {
    static int sum(int start, int end){
        int s = 0;
        for(int i = start; i <= end; i++){
            if(i % 2 == 0){
                s = s + i;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(sum(start, end));
    }
}