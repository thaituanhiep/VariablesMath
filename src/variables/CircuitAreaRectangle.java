package variables;

import java.util.Scanner;

public class CircuitAreaRectangle {
    public static void main(String[] args) {
        float width, height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the width of rectangle: ");
        width = sc.nextFloat();
        System.out.println("Input the height of rectangle: ");
        height = sc.nextFloat();

        float area = width * height;
        System.out.println("The area of rectangle is : " + area);
    }
}
