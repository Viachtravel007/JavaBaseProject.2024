package viachtravel007.homework;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        float tax_percentage;

        if ( sum < 10000 ) {
            tax_percentage = 0.025F;
        } else {
            if (sum > 10000 & sum < 25000) {
                tax_percentage = 0.043F;
            } else {
                tax_percentage = 0.067F;
            }
        }

        System.out.println("Tax amount = $" + tax_percentage * sum);

    }
}
