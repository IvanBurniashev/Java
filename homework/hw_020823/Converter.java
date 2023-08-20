package homework.hw_020823;

import java.util.Scanner;

public class Converter {
    private int number;
    private int radix;
    private int resultInt;
    private String numberStr;
    private String resultStr;
    private double baseValue;
    private double degreesK;
    private double degreesF;

    private void runDecimalToOtherConverter(int number, int radix) {
        this.number = number;
        this.radix = radix;
        resultStr = "";
        while (number != 0) {
            resultStr = Integer.toString(number % radix) + resultStr;
            number = number / radix;
        }
        System.out.println("Число " + this.number + " в системе счисления с основанием " + radix + " это " + resultStr);
    }

    private void runOtherToDecimalConverter(String numberStr, int radix) {
        this.numberStr = numberStr;
        this.radix = radix;
        resultInt = 0;
        int degree = 0;
        while (numberStr.length() != 0) {
            resultInt += Integer.valueOf((numberStr.substring(numberStr.length() - 1))) * Math.pow(radix, degree);
            numberStr = numberStr.substring(0, numberStr.length() - 1);
            degree += 1;
        }
        System.out.println("Число " + this.numberStr + " в системе счисления с основанием " + radix  + " в десятичной системе счисления это " + resultInt);
    }

    private void runKelvinConverter(double baseValue) {
        this.baseValue = baseValue;
        degreesK = baseValue + 273.15;
        System.out.println(baseValue + " по Цельсию это " + degreesK + " по Кельвину");
    }

    private void runFahrenheitConverter(double baseValue) {
        this. baseValue =  baseValue;
        degreesF = baseValue * 1.8 + 32;
        System.out.println(baseValue + " по Цельсию это " + degreesF + " по Фаренгейту");
    }

    public void runConverter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Этот конвертер реализует 2 типа конвертации:\n"
        + "1. Системы счисления (n10 > nn и nn > n10)\n"
        + "2. Температуры (C > K и С > F)\n"
        + "Выберите, нажав цифру 1 или 2: ");
        if (sc.nextByte() == 1) {
            System.out.println();
            System.out.print("Вы хотите конвертировать:\n"
            + "1. Из десятичной СС в любую другую\n"
            + "2. Из любой другой СС в десятичную\n"
            + "Выберите, нажав цифру 1 или 2: ");
            if (sc.nextByte() == 1) {
                System.out.println();
                System.out.println("Конвертируем из десятичной СС в любую другую! ");
                System.out.print("Введите число для конвертации: ");
                number = sc.nextInt();
                System.out.print("Введите основание желаемой системы счисления: ");
                radix = sc.nextInt();
                runDecimalToOtherConverter(number, radix);
            } else {
                System.out.println();
                System.out.println("Конвертируем из любой другой СС в десятичную! ");
                System.out.print("Введите число для конвертации: ");
                sc.nextLine();
                numberStr = sc.nextLine();
                System.out.print("Введите основание системы счисления: ");
                radix = sc.nextInt();
                runOtherToDecimalConverter(numberStr, radix);
            }
        } else {
            System.out.println();
            System.out.print("Вы хотите конвертировать:\n"
            + "1. Из градусов Цельция в градусы Кельвина\n"
            + "2. Из градусов Цельсия в градусы Фаренгейта\n"
            + "Выберите, нажав цифру 1 или 2: ");
            if (sc.nextByte() == 1) {
                System.out.println();
                System.out.println("Конвертируем из градусов Цельсия в градусы Кельвина!");
                System.out.print("Введите число: ");
                baseValue = sc.nextDouble();
                runKelvinConverter(baseValue);
            } else {
                System.out.println();
                System.out.println("Конвертируем из градусов Цельсия в градусы Фаренгейта!");
                System.out.print("Введите число: ");
                baseValue = sc.nextDouble();
                runFahrenheitConverter(baseValue);
            }
        }
    }
}
