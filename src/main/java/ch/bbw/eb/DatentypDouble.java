package ch.bbw.eb;

import java.util.Scanner;

public class DatentypDouble {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double number1;
        number1 = keyboard.nextDouble();
        System.out.print("Nummer 1: ");
        System.out.println(number1);

        double number2;
        number2 = keyboard.nextDouble();
        System.out.print("Nummer 2: ");
        System.out.println(number2);

        double sum = number1 + number2;
        System.out.println(String.format("%.2f + %.2f = %.2f", number1, number2, sum));
        //%.2f = Zwei Nachkommastellen
        keyboard.close();
    }
}
