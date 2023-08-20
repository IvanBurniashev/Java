package Lesson.lesson_100823;

public class Main {
    public static void main(String[] args) {
        // int i = 1;
        // while (i < 5) {
        //     System.out.println(i);
        //     i = i + 2;
        // }

        // int i = 1;
        // do {
        //     System.out.println(i);
        //     i = i + 2;
        // } while (i < 5);
                    /*

         * 2. 
            Сисадмин обнаружил, что его сообщения перехватываются и читаются в замке «Близнецы», поэтому его атаки перестали быть внезапными. Немного подумав, он разработал программу, которая будет шифровать передаваемые сообщения по следующему алгоритму: программа получает на вход строку и меняет местами в ней каждые 2 подряд идущих символа. Если длина строки нечётная, то последний символ остаётся на своём месте.

            encrypt("move");   // "omev"
            encrypt("attack"); // "taatkc"
            encrypt("car!"); // "ac!r"
            
            // Если длина строки нечётная,
            // то последний символ остаётся на своём месте
            encrypt("go!"); // "og!"
         */
    // Решение №1
        System.out.println(crypt ("абвгдежзи"));
    // Решение №2
        System.out.println(crypt1 ("абвгдежзи"));
    }

    // Решение №1
    public static String crypt (String input) {
        String out = "";
        for (int i = 0; i < input.length() - 1; i += 2) {
                out = out + input.charAt(i+1) + input.charAt(i);
        }
        if (input.length() % 2 != 0) {
            out += input.charAt(input.length() - 1);
        }
        return out;
    }

    // Решение №2
    public static String crypt1 (String input) {
        String out = "";
        for (int i = 0; i < input.length(); i += 2) {
            out = out + (i != input.length() - 1 ? input.charAt(i+1) : "") + input.charAt(i);
        }
        return out;
    }
}
