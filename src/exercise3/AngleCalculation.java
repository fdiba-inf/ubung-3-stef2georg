package exercise3;

import java.util.Scanner;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double angle;
        char unit;
        do {
            System.out.print("Enter angle: ");
            angle = input.nextDouble();

            System.out.print("Enter unit: ");
            String symbole = input.next();
            unit = symbole.charAt(0);
            if (unit == 'r') {
                double newAngle = angle / Math.PI * 180;
                System.out.println("Angle: " + newAngle + "d");
            } else if (unit == 'd') {
                double newAngle = angle * Math.PI / 180;
                System.out.println("Angle: " + newAngle + "r");
            }
        } while (unit == 'd' || unit == 'r');
    }

}
