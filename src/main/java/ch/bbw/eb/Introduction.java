package ch.bbw.eb;

import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int number1;
        // Ausgabe
        System.out.println("Geben Sie eine Zahl ein:");
        // Zahl einlesen
        number1 = keyboard.nextInt();
        System.out.print("Nummer 1: ");
        System.out.println(number1);

        System.out.println("Geben Sie eine zweite Zahl ein:");

        int number2 = keyboard.nextInt();
        System.out.print("Nummer 2: ");
        System.out.println(number2);

        int summe = number1 + number2;
        System.out.println(String.format("%d + %d = %d", number1, number2, summe));
        //%s = String
        //%d = Decimal
        //%f = float oder double

        keyboard.close();
    }
}
