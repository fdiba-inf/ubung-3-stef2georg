package exercise3;

import java.util.Scanner;

public class NamePrinter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.next();
        for (int index = 0; index < name.length(); index++) {
            char letter = name.charAt(index);
            System.out.println("* " + letter + " *");
        }
    }

}
