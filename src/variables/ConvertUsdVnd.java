package variables;

import java.util.Scanner;

public class ConvertUsdVnd {
    public static void main(String[] args) {
        float rateUsdVnd = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("US Dollar to Vietnamese Dong Conversion");
        System.out.println("Input amount USD: ");
        float amountUsd = sc.nextFloat();

        float valueVnd = amountUsd * rateUsdVnd;
        System.out.println("Value VND is: " + valueVnd);
    }
}
