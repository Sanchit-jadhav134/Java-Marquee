package JavaFunction;

import java.util.*;

public class degreeConversion {

    static float fahrenheit(float c){

        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float c = sc.nextFloat();

        System.out.println(fahrenheit(c));
    }
}