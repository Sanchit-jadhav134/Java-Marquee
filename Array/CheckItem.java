package Array;

import java.util.Scanner;

public class CheckItem {
    public static int check(String menu[],String item){
        for(int i = 0;i<menu.length;i++){
            if(menu[i].equals(item)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of item");
        int n = sc.nextInt();
        sc.nextLine();
        String[] menu = new String[n];
        System.out.println("Enter the item of the menu");
        for (int i = 0;i< n;i++){
            menu[i] = sc.nextLine();
        }
        System.out.println("Enter the menu you want to Search");
        String item = sc.nextLine();
        int index = check(menu,item);
        System.out.println("The item at index"+index);
    }
}
