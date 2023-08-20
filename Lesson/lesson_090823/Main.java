package Lesson.lesson_090823;

public class Main {
    public static void main(String[] args) {
        // int delta = -1;
        // for (int i = 5; i < -5; i = i + delta) {
        //     System.out.println(i);
        // }
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         System.out.printf("%d x %d = %d\n", i, j, i * j);
        //     }
        // }

        // /*
        //  * 
        // 6.Функция countChars() из теории считает, сколько раз входит буква в предложение и при этом учитывает регистр букв. То есть A и a с её точки зрения разные символы. Реализуйте вариант этой же функции, так чтобы регистр букв был не важен:
        // countChars("QeXZpE!", "e"); // 2
        // countChars("FeqkE123", "E"); // 2

        //  */
        // String result = mySubstr("If I look back I am lost", 4);
        // System.out.println(result);

        // // Каждый n-й символ в слове сделать ВЕРХНИМ регистром
        // String strWord = "abcdefghijklmnopqrstu";
        // System.out.println(makeItFunny(strWord, 4));
    }

    public static String mySubstr(String word, int length) {
        String subString = "";
        for (int i = 0; i < length; i++) {
          subString = subString + word.charAt(i);
        }
        return subString;
    }

    public static String makeItFunny(String str, int n) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if ((i + 1) % n == 0) {
                s += Character.toUpperCase(str.charAt(i));
            } else {
                s += str.charAt(i);
            }
        }
        return s;
    }
}
