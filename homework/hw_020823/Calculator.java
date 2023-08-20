package homework.hw_020823;

import java.util.Scanner;

public class Calculator {
    private double a;
    private double b;
    private double result;

    public void runCalculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        a = sc.nextInt();
        System.out.print("Введите второе число: ");
        b = sc.nextInt();
        System.out.println();
        additionNumbers();
        subtractiontionNumbers();
        multiplicationNumbers();
        divisionNumbers();
    }

    private void additionNumbers() {
        result = a + b;
        System.out.println("Сумма чисел: " + result);
    }

    private void subtractiontionNumbers() {
        result = a - b;
        System.out.println("Разность чисел: " + result);
    }

    private void multiplicationNumbers() {
        result = a * b;
        System.out.println("Произведение чисел: " + result);
    }

    private void divisionNumbers() {
        result = a / b;
        System.out.println("Частное чисел: " + result);
    }
}
