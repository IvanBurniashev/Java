package homework.hw_030823;

import java.util.Scanner;

public class Homework {
    protected void runHomework() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.print("Программа демонстрирует решения задач домашнего задания!\n"
            + "Сделайте выбор задачи:\n"
            + "0. Выход из программы\n"
            + "1. Вывод на экран ближайшее к 10 из двух чисел\n"
            + "2. Табло показывает остаток рабочего дня в секундах и часах\n"
            + "3. Является ли год високосным?\n"
            + "4. Метод getLetter(), который извлекает из переданной строки указанный символ по порядковому номеру\n");
            int operation;
            if (scan.hasNextInt()) {
                operation = scan.nextInt();
            } else {
                System.out.print(scan.next() + " - некорректный ввод!");
                operation = 5;
            }
            System.out.println();
            switch (operation) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    CloserToTen ten = new CloserToTen();
                    while (true) {
                        System.out.println("Решаем задачу №1!");
                        ten.closeToTen();
                        System.out.println();
                        System.out.println("0. Выход\n"
                        + "1. Повторить вычисление");
                        operation = scan.nextInt();
                        System.out.println();
                        if (operation == 0) {
                            break;
                        }
                    }
                    break;   
                case 2:
                    Scoreboard scor = new Scoreboard();
                    while (true) {
                        System.out.println("Решаем задачу №2!");
                        scor.runScoreboard();
                        System.out.println();
                        System.out.println("0. Выход\n"
                        + "1. Повторить вычисление");
                        operation = scan.nextInt();
                        System.out.println();
                        if (operation == 0) {
                            break;
                        }
                    }
                    break;   
                case 3:
                    LeapYear leapYear = new LeapYear();
                    while (true) {
                        System.out.println("Решаем задачу №3!");
                        System.out.print("Введите год: ");
                        int year = scan.nextInt();
                        System.out.println("Ответ: " + leapYear.runLeapYear(year));
                        System.out.println("0. Выход\n"
                        + "1. Повторить вычисление");
                        operation = scan.nextInt();
                        System.out.println();
                        if (operation == 0) {
                            break;
                        }
                    }
                    break;   
                case 4:
                    Substring subStr = new Substring();
                    while (true) {
                        System.out.println("Решаем задачу №4!");
                        System.out.print("Введите строку: ");
                        scan.nextLine();
                        String str = scan.nextLine(); 
                        System.out.print("Введите порядковый номер символа: ");
                        int position = scan.nextInt();
                        System.out.println("Ответ: " + subStr.getLetter(str, position));
                        System.out.println();
                        System.out.println("0. Выход\n"
                        + "1. Повторить вычисление");
                        operation = scan.nextInt();
                        System.out.println();
                        if (operation == 0) {
                            break;
                        }
                    }
                    break;   
                default:
                    System.out.println("Выберите от 0 до 4!");
                    break;
            }
        }
    }
}
