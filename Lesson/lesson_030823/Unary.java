package Lesson.lesson_030823;
// 1 решение
// public class Unary {
//     int unaryConverter(int value) {
//         return -value;
//     }
// }

// public class Unary {

//   public static void main(String[] args) {
    // Создайте класс Unary
    // Создайте переменную с положительным знаком
    // Измените знак на отрицательный используя унарный минус
    // Результат распечатайте в консоли


//   }
// }

public class Unary {
  int number;

  public Unary(int n) {
    number = n;
  }

  int getOriginValue() {
    return number;
  }

  int unaryConverter() {
    return -number;
  }
}

// class UnaryOleksandr {
//   int unaryConverter(int value) {
//     return -value;
//   }
// }

// int value = 10;
// Unary u = new Unary(value);
// value = u.unaryConverter();
// System.out.println(value);
