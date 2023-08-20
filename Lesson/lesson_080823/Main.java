package Lesson.lesson_080823;

import java.time.DayOfWeek;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // DayOfWeek day = DayOfWeek.of(2);
        // System.out.println(day);
        // String dayString;
        // int day = 1;
        // switch (day) {
        //     case 1:
        //         dayString = "Понедельник";
        //         break;
        //     case 2:
        //         dayString = "Вторник";
        //         break;
        //     default:
        //         dayString = "Другие";
        //         break;
        // }
        // System.out.println(dayString);

        /*
         * Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру.
            Например: 398
            Выход: 9
         */
        Random random = new Random();
        int number = random.nextInt(100, 1000);
        int x, y, z;
        x = number % 10;
        y = (number % 100) / 10;
        z = number / 100;
        System.out.println(number);
        System.out.println(z);
        System.out.println(y);
        System.out.println(x);
        if (x >= y && x >= z) {
            System.out.println(x + " - наибольшее число");
        } else {
            if (y >= z) {
                System.out.println(y + " - наибольшее число");
            } else {
                System.out.println(z + " - наибольшее число");
            }
        }
    }
}
