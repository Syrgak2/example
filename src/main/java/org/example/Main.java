package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        String text = "Привет мир";
//        String text2 = "Я готов тебе помочь";
//
//        print(text, 1);
//
////        String name = getName();
//        String name = "Syrgak";
//        int[] ages = getAge();
////        print(name);
//        print(getName(), 5);
//        for (int i = 0; i < ages.length; i++) {
//            System.out.println(ages[i]);
//        }

        Scanner scanner = new Scanner(System.in);

        int numberOne = 0;
        int numberTwo = 0;
        String operations;

        System.out.println("Ввидите первое число: ");
        numberOne = scanner.nextInt();

        System.out.println("Ввидите второе число: ");
        numberTwo = scanner.nextInt();

        System.out.println("Ввидите операцию: ");
        operations = scanner.next();


        printResult(numberOne, numberTwo, operations);

        System.out.println("test 2");

    }

    public static void printResult(int numberOne, int numberTwo, String operations) {
        int result = 0;
        if (operations.equals("+")) {
            result = calculatePlus(numberOne, numberTwo);
        } else if (operations.equals("*")) {
            result = calculateMultiplication(numberOne, numberTwo);
        } else if (operations.equals("/")) {
            result = calculateDevide(numberOne, numberTwo);
        } else if (operations.equals("-")) {
            result = calculateMinus(numberOne, numberTwo);
        } else {
            System.out.println(operations + " Это не операция");
        }

        System.out.println("Результат " + result);

    }

    public static int calculatePlus(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
    public static int calculateMinus(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }
    public static int calculateMultiplication(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    public static int calculateDevide(int numberOne, int numberTwo) {
        int result = 0;
        if (numberTwo == 0) {
            System.out.println("Экинчи номер 0 го барабар болбош керек");
        } else {
            result = numberOne / numberTwo;
            System.out.println(result);
        }

        return result;
    }


//    public static void print(String text, int number) {
//        for (int i = 0; i < number; i++) {
//            System.out.println(text);
//        }
//        String name = "HJfk";
//    }
//
//
//    public static String getName() {
//        String name = "Syrgak";
//        return name;
//    }
//
//    public static int[] getAge() {
//        int[] ages = {12, 32, 43};
//        return ages;
//    }

}