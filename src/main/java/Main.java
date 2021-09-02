/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Tyler Snowdon
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String firstInput;
        String secondInput;
        int firstNumber;
        int secondNumber;
        Scanner reader = new Scanner(System.in);
        System.out.print("What is your first number? ");
        firstInput = reader.nextLine();
        System.out.print("What is your second number? ");
        secondInput = reader.nextLine();
        try {
            firstNumber = Integer.parseInt(firstInput);
            secondNumber = Integer.parseInt(secondInput);
        } catch (Exception e) {
            System.out.println("Invalid input! Please run the program again and try again.");
            return;
        }

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        int dividend = firstNumber / secondNumber;

        System.out.println(
                firstNumber + " + " + secondNumber + " = " + sum + "\n" +
                firstNumber + " - " + secondNumber + " = " + difference + "\n" +
                firstNumber + " * " + secondNumber + " = " + product + "\n" +
                firstNumber + " / " + secondNumber + " = " + dividend
        );
    }
}
