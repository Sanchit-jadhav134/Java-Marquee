package JavaFunction;

import java.util.Scanner;

public class areaOfCircle {
    static float area(float rad){

        return 3.14f * rad * rad;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float rad = sc.nextFloat();

        System.out.println(area(rad));
    }
}
