package homework.hw_030823;

import java.util.Scanner;

public class CloserToTen {
    private double m;
    private double n;
    Scanner scan = new Scanner(System.in);
    
    protected void closeToTen() {
        System.out.print("Введите первое число: ");
        m = scan.nextDouble();
        System.out.print("Введите второе число: ");
        n = scan.nextDouble();
        double c = Math.abs(m - 10);
        double d = Math.abs(n - 10);
        if (c < d) {
            System.out.println("Ответ: " + m + " ближе к 10 чем " + n);
        } else {
            if (c > d) {
                System.out.println("Ответ: " + n + " ближе к 10 чем " + m);
            } else {
                System.out.println("Ответ: " + m + " и " + n + " равноудалены от 10");
            }
        }
    }
}
