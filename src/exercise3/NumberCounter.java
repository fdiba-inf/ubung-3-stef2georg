package exercise3;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveNumbers = 0;
        int negativeNumbers = 0;
        double sum = 0;

        System.out.println("Enter numbers:");
        int number = input.nextInt();
        while (number != 0) {
            if (number > 0) {
                positiveNumbers++;
            } else {
                negativeNumbers++;
            }

            sum += number;
            number = input.nextInt();
        }

        System.out.format("Positive numbers: %s\nNegative numbers: %s\n", positiveNumbers, negativeNumbers);
        System.out.println("Sum: " + sum);

        double average = sum / (positiveNumbers + negativeNumbers);
        System.out.println("Average: " + average);
    }

}
