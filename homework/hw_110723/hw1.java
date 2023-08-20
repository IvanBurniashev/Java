package homework.hw_110723;
import java.util.Scanner;
class Car {
    String model;
    public double volume;
}

public class hw1 {
    public static void main (String[] args ) {
        // №1
        //1. В методе main инициализировать все примитивные типы и не примитивные типы. 
            //1. Примитивы.
            // Целые числа
        byte my_byte = 127;
        short my_short = 32767;
        int my_int= 2_147_483_647;
        long my_long = 9_223_372_036_854_775_807L;
            // Вещественные
        float my_float =  123.123456789012345678901234567890f;
        double my_double = 1234567.123456789012345678901234567890;
            // Логический
        boolean my_boolean = true;
            // Символьный
        char my_char = '\uffff';

            //2. Ссылочного типа.
            //1. Классы-обертки
                // Целые числа
        Byte myByte = 127;
        Short myShort = 32767;
        Integer myInteger= 2_147_483_647;
        Long myLong = 9_223_372_036_854_775_807L;
                // Вещественные числа
        Float myFloat =  123.123456789012345678901234567890f;
        Double myDouble = 1234567.123456789012345678901234567890;
                // Логический
        Boolean myBoolean = true;
                // Символьный
        // Character myCharacter = '\uffff';

            //2. Строка
        String myString = "string";

            //3. Массив
        int[] myArray = new int[10];

            //4. Обьект
        Car myCar = new Car();
        myCar.model = "Audi";
        myCar.volume = 2.0;

        // 2. Вывести их результат в консоль.
        System.out.println("Примитивы");
        System.out.println("byte: " + my_byte);
        System.out.println("short: " + my_short);
        System.out.println("int: " + my_int);
        System.out.println("long: " + my_long);
        System.out.println("float: " + my_float);
        System.out.println("double: " + my_double);
        System.out.println("boolean: " + my_boolean);
        System.out.println("char: " + my_char);
        System.out.println("=======================");
        System.out.println("Ссылочного типа");
        System.out.println("Byte: " + myByte);
        System.out.println("Short: " + myShort);
        System.out.println("Integer: " + myInteger);
        System.out.println("Long: " + myLong);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("Boolean: " + myBoolean);
        // System.out.println("Character: " + myCharacter);

        // №2. Дано трехзначное число. Вывести на экран все цифры этого числа.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        // Решение №1 числами
        int didgit = (int) (Math.log10(number) + 1);
        int[] Arr = new int[didgit];
        for (int i = didgit - 1; i >= 0; i--) {
            Arr[i] = number % 10;
            number /= 10;
        }
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + (i < Arr.length - 1 ? ", " : ". "));
        }

        // // Решение №2 строкой
        // String result = ".";
        // while (number != 0) {
        //     result = (number / 10 != 0 ? ", " : "") + String.format("%d", number % 10) + result;
        //     number /= 10;
        // }
        // System.out.println(result);
    }
}


