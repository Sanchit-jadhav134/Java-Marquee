package loops;

public class pattern15 {
    public static void main(String[] args){
        int n = 6;
        for(int i = n;i>=1;i--){
            char ch = 'A';
            for(int j = 1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
