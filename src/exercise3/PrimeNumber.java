package exercise3;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean numberPrime = true;

        System.out.println("Enter number n (n > 2): ");
        long number = input.nextLong();
        long divider = 2;
        while (divider <= number / 2) {
            if (number % divider == 0) {
                numberPrime = false;
                break;
            }
            divider++;
        }

        System.out.println("Prime number: " + numberPrime);
    }

}
