package ch.bbw.eb;

import java.util.Scanner;

public class Heartbeat {

    private double heartbeatsPerMinute;
    private double heartbeatsTotal;
    private final double minutesPerYear = 365.25 * 24 * 60;
    private int age;
    private String output;

    public void readIn() {
       
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your age:");
        age = keyboard.nextInt();

        System.out.println("Please enter your BPM:");
        heartbeatsPerMinute = keyboard.nextInt();

        keyboard.close();

    }

    public void calculate() {
        if (age != 0) {
            heartbeatsTotal = age * minutesPerYear * heartbeatsPerMinute;
        } else {
            System.out.println("Calculation with age 0 is not allowed");
        }
    }
        public String toString () {

            return output = "The result of the Heartbeat: " + (int)heartbeatsTotal;


        }
    public static void main(String[] args) {
      Heartbeat heartbeat = new Heartbeat();

        heartbeat.readIn();

        heartbeat.calculate();

        System.out.println( heartbeat.toString() );
    }

}