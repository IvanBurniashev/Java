package SergeyTasks;
import java.util.Scanner;
public class numbers {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Разложить число на элементы.    
        // Scanner sc = new Scanner(System.in);
        // int value;
        // System.out.print("value: ");
        // value = sc.nextInt();
        // while (value != 0) {
        //     System.out.println(value % 10);
        //     value = value / 10;
        // }

        // // Задача: сделайте возведение в степень числа.
        // int number;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter number: ");
        // number = sc.nextInt();

        // int result = number * number;
        // System.out.println(result);
        // //double result = Math.pow(number, 2);
        // //String output = String.format("result = %d", result);

        // double x, y;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("x: ");
        // x = sc.nextDouble();
        // System.out.print("y: ");
        // y = sc.nextDouble();
        // System.out.println(x == y * y);

        // По двум заданным числам проверять является ли одно квадратом другого

        // // Оптимальное решение
        // // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a: ");
        // Double a = sc.nextDouble();    
        // System.out.println("Enter b: ");
        // Double b = sc.nextDouble();
        // System.out.println(a == b * b || b == a * a);    

        // // Решение 1
        // double a, b;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a: ");
        // a = sc.nextDouble();
        // System.out.println("Enter b: ");
        // b = sc.nextDouble();
        // double result1 = a * a;
        // double result2 = b * b;
        // if (a == result2 || b == result1) {

        // оптимизируем, убирая лишние переменные
        // // if (a == b * b || b == a * a) {

        //     System.out.println("YES");
        // }
        // else {
        //     System.out.println("NO");
        // }

        // // Решение 2
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter first: ");
        // double first;
        // first = sc.nextDouble();

        // System.out.println("Enter second: ");
        // double second;
        // second = sc.nextDouble();

        // double result1 = first * first;
        // double result2 = second * second;

        // if (result1 == second) {
        //     System.out.println("second == firstˆ2");
        // } else {
        //     if (result2 == first) {
        //         System.out.println("first == secondˆ2");
        //     } else {
        //         System.out.println("No");
        //     }    
        // }

        // // Лекция из Интернета.
         
        //         Scanner scanner = new Scanner("Люблю тебя, Петра творенье,\n" +
        //                 "Люблю твой строгий, стройный вид,\n" +
        //                 "Невы державное теченье,\n" +
        //                 "Береговой ее гранит");
        //         // String s = scanner.nextLine();
        //         // System.out.println(s);
        //         String s = scanner.nextLine();
        //         System.out.println(s);
        //         s = scanner.nextLine();
        //         System.out.println(s);
        //         s = scanner.nextLine();
        //         System.out.println(s);
        //         s = scanner.nextLine();
        //         System.out.println(s);

        // // Задача №3. Даны два числа. Показать большее и меньшее числo
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a: ");
        // if (sc.hasNextDouble()) {
        //     double a = sc.nextDouble();
        //     System.out.println("Enter b: ");
        //     if (sc.hasNextDouble()) {
        //         double b = sc.nextDouble();
        //         if (a > b) {
        //             System.out.println("a > b");
        //             System.out.println("b < a");
        //         } else if (a < b) {
        //             System.out.println("b > a");
        //             System.out.println("a < b");
        //         } else {
        //             System.out.println("a = b");
        //         }
        //     } else {
        //         System.out.println("Input b is not correct!");
        //     }    
        // } else {
        //     System.out.println("Input a is not correct!");
        // }
        
        // // Задача №4. По заданному номеру дня недели вывести его название

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number 1-7: ");
        // Byte number = sc.nextByte();
        // if (!(number> 0 && number < 8)) {
        //     System.out.println("Input is not correct!");
        // }
        // if (number == 1) {
        //     System.out.println("Montag");
        // }
        // if (number == 2) {
        //     System.out.println("Dienstag");
        // }
        // if (number == 3) {
        //     System.out.println("Mitwoch");
        // }
        // if (number == 4) {
        //     System.out.println("Donerstag");
        // }
        // if (number == 5) {
        //     System.out.println("Freitag");
        // }
        // if (number == 6) {
        //     System.out.println("Samstag");
        // }
        // if (number == 7) {
        //     System.out.println("Sonntag");
        // }
        
        // Задача №5. Найти максимальное из трех чисел

        // // Решение 1
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a, b, c: ");
        // Byte a = sc.nextByte();
        // Byte b = sc.nextByte();
        // Byte c = sc.nextByte();
        // if (a >= b) {
        //     if (a >=c ) {
        //         System.out.println("a is max");
        //     } else {
        //         System.out.println("c is max");
        //     }        
        // } else {
        //     if (b >= c) {
        //         System.out.println("b is max");
        //     } else {
        //         System.out.println("c is max");
        //     }
        // }

        // // Решение 2
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a, b, c: ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // if (a >= b && a >= c) {
        //     System.out.println("a is max");
        // } else {
        //     if (b >= a && b >= c) {
        //         System.out.println("b is max");
        //     } else {
        //         System.out.println("c is max");
        //     }
        // }

        // // Задача №6. Выяснить является ли число чётным
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number: ");
        // int number = sc.nextInt();
        // if (number % 2 == 0) {
        //     System.out.println("number is even");
        // }
        
        // Задача №7. Показать числа от -N до N
        // // Решение с использованием цикла << While >>
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number N: ");
        // int N = sc.nextInt();
        // int i = -N;
        // while (i <= N) {
        //     System.out.println(i);
        //     i++;
        // }

        // // Решение с использованием цикла << do {} While >>
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number N: ");
        // int N = sc.nextInt();
        // int i = -N;
        // do {
        // System.out.println(i);
        // i++;
        // } while (i <= N);

        // // Решение с использованием цикла << for >>
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number N: ");
        // int N = sc.nextInt();
        // for (int i = -N; i <= N; i++) {
        //     System.out.print(i + " ");
        // }

        // // Задача №INT из Интернета: переворот строки. Вывести слово зеркально перевернутым.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter string: ");
        // String str = sc.nextLine();
        // for (int i = str.length() - 1; i >= 0; i--) {
        //     System.out.print(str.charAt(i));
        // }

        // // Задача №8. Показать четные числа от 1 до N
        // // Решение 1
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter N: ");
        // int N = sc.nextInt();
        // for (int i = 1; i <= N; i++) {
        //     if (i % 2 == 0) {
        //         System.out.print(i + " ");
        //     }
        // }
        // // Решение 2
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter N: ");
        // int N = sc.nextInt();
        // for (int i = 2; i <= N; i += 2) {
        //     System.out.print(i + " ");
        // }

        // // Задача №9. Показать последнюю цифру трёхзначного числа
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number: ");
        // int number = sc.nextInt();
        // System.out.println(number % 10);

        // // Задача №10. Показать вторую цифру трёхзначного числа
        // System.out.println("Enter number: ");
        // int number = sc.nextInt();
        // System.out.println(number / 10 % 10);

        // // Задача №11. Дано число из отрезка [10, 99]. Показать наибольшую цифру числа
        // System.out.println("Enter number: ");
        // int number = sc.nextInt();
        // // System.out.println(number / 10 % 10);
        // // System.out.println(number % 10);
        // // System.out.println("max is " +  (number / 10 % 10 >= number % 10 ? number / 10 % 10 : number % 10));
        // int max = number / 10 % 10 >= number % 10 ? number / 10 % 10 : number % 10;
        // System.out.println("max is " +  max);

        // // Задача №12. Удалить вторую цифру трёхзначного числа.
        // System.out.println("Enter number: ");
        // int number = sc.nextInt();
        // System.out.println(number / 100 % 10 * 100 + number % 10); //удаляет десятки
        // System.out.println(number / 100 % 10 * 10 + number % 10); //удаляет саму позицию

        // // Задача №13. Выяснить, кратно ли число заданному, если нет, вывести остаток.
        // System.out.println("Enter number: ");
        // int number = sc.nextInt();
        // int const1 = 3;
        // System.out.println(number % const1 == 0 ? "number is multiple of " + const1 : "remainder: " + number % const1 );

        // // Задача №14. Найти третью цифру числа или сообщить, что её нет
        // System.out.println("Enter number: ");
        // int number = sc.nextInt();
        // System.out.println(number / 100 % 10 != 0 ? number / 100 % 10 : "no third digit");

        // // Задача №15. Дано число. Проверить кратно ли оно 7 и 23
        // System.out.println("Enter number: ");
        // int number = sc.nextInt();
        // System.out.println(number % 7 == 0 && number % 23 == 0 ? "Yes" : "No");

        // // Задача №17. По двум заданным числам проверить является ли одно квадратом другого
        // System.out.println("Enter number 1: ");
        // int number1 = sc.nextInt();
        // System.out.println("Enter number 2: ");
        // int number2 = sc.nextInt();
        // System.out.println(number1 == number2 * number2 || number2 == number1 * number1 ? "Yes" : "No");

        // // Задача №18. Программа проверяет пятизначное число на палиндромом.
        // System.out.println("Enter number: ");
        // int number = sc.nextInt();
        // System.out.println(number / 10000 == number % 10 || number / 1000 == number / 10 % 10 ? "Yes" : "No");

        // // Задача №19. Найти расстояние между точками в двумерном пространстве
        // System.out.println("Enter point1 x: ");
        // int x1 = sc.nextInt();
        // System.out.println("Enter point1 y: ");
        // int y1 = sc.nextInt();
        // System.out.println("Enter point2 x: ");
        // int x2 = sc.nextInt();
        // System.out.println("Enter point2 y: ");
        // int y2 = sc.nextInt();
        // System.out.println("корень квадратный: " + Math.pow(((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)), 0.5));

        // // Задача №20. Найти расстояние между точками в трехмерном пространстве
        // System.out.println("Enter point1 x: ");
        // int x1 = sc.nextInt();
        // System.out.println("Enter point1 y: ");
        // int y1 = sc.nextInt();
        // System.out.println("Enter point1 z: ");
        // int z1 = sc.nextInt();
        // System.out.println("Enter point2 x: ");
        // int x2 = sc.nextInt();
        // System.out.println("Enter point2 y: ");
        // int y2 = sc.nextInt();
        // System.out.println("Enter point2 z: ");
        // int z2 = sc.nextInt();
        // System.out.println("корень квадратный: " + Math.pow(((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1)), 0.5));
        
        // // Задача №21. Показать таблицу квадратов чисел от 1 до N
        // System.out.println("Enter N: ");
        // int N = sc.nextInt();
        // for (int i = 1; i <= N; i++) {
        // System.out.println(i + " " + i + "^2: " + i * i);
        // }

        // // Задача №22. Показать таблицу кубов чисел от 1 до N
        // System.out.println("Enter N: ");
        // int N = sc.nextInt();
        // for (int i = 1; i <= N; i++) {
        // System.out.println(i + " " + i + "^3: " + i * i * i);
        // }

        // // Задача №23. Найти сумму чисел от 1 до N
        // System.out.println("Enter N: ");
        // int N = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= N; i++) {
        //     sum = sum + i;
        // }
        // System.out.println(sum);

        // // Задача №24. Возведите число А в натуральную степень B используя цикл.
        // System.out.println("Enter A: ");
        // int A = sc.nextInt();
        // System.out.println("Enter B: ");
        // int B = sc.nextInt();
        // int exp = 1;
        // for (int i = 1; i <= B; i++) {
        //     exp = exp * A;
        // }
        // System.out.println(exp);

        // // Задача №25. Определить количество цифр в числе
        // System.out.print("Enter number: ");
        // int number = sc.nextInt();
        // int deg = 10;
        // int i = 1;
        // while (number / deg > 0) {
        //     deg = deg * 10;
        //     i++;
        // }
        // System.out.println("Сount the number: " + i);

        // // // Задача №My. Разложить число любого порядка на составляющие.

        // Мое решение
        // System.out.print("Enter number: ");
        // int number = sc.nextInt();
        // int deg = 1;
        // while (number / deg > 0) {
        // System.out.println(number / deg % 10);
        // deg *= 10;
        // }

        // Решение Александра
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        while (number != 0) {
        System.out.println(number % 10);
        number /= 10;
        }

        // // Задача №26. Подсчитать сумму цифр в числе.

        // // Мое решение: введенное число сохраняется после выполнения кода.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number: ");
        // int number = sc.nextInt();
        // int deg = 1;
        // int sum = 0;
        // while (number / deg > 0) {
        // sum += number / deg % 10;
        // deg *= 10;
        // }
        // System.out.println(sum);

        // // Решение Александра: шинковка самого числа. Введенное число не сохраняется.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number: ");
        // int number = sc.nextInt();
        // int result = 0;
        // while (number != 0){
        //     result += number % 10;
        //     number /= 10;
        // }
        // System.out.println(result);

        // // Задача №27. Написать программу вычисления произведения чисел от 1 до N.
        // System.out.print("Enter N: ");
        // int N = sc.nextInt();
        // int mult = 1;
        // for (int i = 1; i <= N; i++) {
        //     mult = mult * i;
        // }
        // System.out.print("mult: " + mult);

        // // Задача №28. Показать кубы чисел, заканчивающихся на четную цифру из диапазона от N1 до N2.
        // System.out.print("Enter N1: ");
        // int N1 = sc.nextInt();
        // System.out.print("Enter N2: ");
        // int N2 = sc.nextInt();
        // for (int i = N1; i <= N2; i++) {
        //     if (i % 10 % 2 == 0) {
        //         System.out.println(i * i * i);
        //     }
        // }
        


    }
}    


