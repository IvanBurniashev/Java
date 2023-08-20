package homework.hw_020823;

public class Main {
    public static void main(String[] args) {
        /*
         *  1 уровень сложности: 1.
        Задача №1.
        Реализовать программу, выводящую на экран результаты: 
        Сложения двух чисел
        Вычитания двух чисел
        Умножения двух чисел
        Деления двух чисел
        Каждая из арифметических операций должна быть реализована как отдельный метод.
         */
        Calculator calc = new Calculator();
        calc.runCalculator();
        
        System.out.println();

        /*
         * Задача №2. Дописать метод конвертации числа из любой системы счисления в десятичную.
         */
        Converter conv = new Converter();
        conv.runConverter();

        System.out.println();

        /*
         * Напишите программу на Java для того, чтобы поменять местами значения, хранящиеся в двух переменных с помощью третьей переменной:

        На вход: а = 2; b = 5;
        На выход: a = 5; b = 2;
        Используйте переменную temp;
         */
        int a = 2;
        int b = 5;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + " b = " + b);
    }
}
