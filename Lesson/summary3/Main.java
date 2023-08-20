
import java.util.Scanner;

public class Main { // Класс, который содержит главный метод. Он управляет приложением

    public static void main(String[] args) {  // Точка входа в приложение. Отсюда начинается исполнение программы.
        /*
       Задача
       Расчет площади треугольника и прямоугольника
        */
//        double sq = square(10, 20);  // Вычисляем площадь прямоугольника
//        System.out.println("Площадь прямоугольника: " + sq);
//        sq = square(3, 4, 5 );  // Вычисляем площадь треугольника
//        System.out.println("Площадь треугольника: " + sq);

        // Создаем полиморфные объекты
        Human vlad = new Human("Влад", 86);
        Human vera = new Human("Вера", 300, 22);
        /*
        Организовать управление фитнес центром:
        1) Добавление человека по первому конструктору
        2) Добавление человека по второму конструктору
        3) Выход
        Решение
        1) Создать класс Human  -> Смотреть класс.
        2) Создать чтение из консоли - Scanner -> Далее создавать в методе в main
        3) Сделать бесконечный цикл while(true)
        4) Вывести приглашение для пользователя на выбор режима
        5) Получаем с консоли код операции
        6) Проверяем операцию
        7) Выполняем действие по операции
         */

        Scanner sc = new Scanner(System.in);                 // Создаем ввод с консоли
        while (true){                                        // Бесконечный цикл - главный цикл
            System.out.println("Введите операцию:\n" +       // Приглашение для пользователя на выбор режима
                    "1 - Добавление по первому конструктору\n" +
                    "2 - Добавление по второму конструктору\n" +
                    "3 - изменить свойства первого объекта\n"  +
                    "4 - Выход");
            int operation = sc.nextInt(); // Получаем код операции с консоли
            switch (operation){   // Перебираем условия, полученные от пользователя с консоли
                case 1:           // Условие 1
                    System.out.println("Введите имя и вес");   // Приглашение ввести данные
                    sc.nextLine();                             // Считали строку и перешли на новую строку
                    String name =  sc.nextLine();
                    //  System.out.println(g);
                     double weight = sc.nextDouble();           // Считываем вес
                    // Закоментировали провеку в месте использования переменной, потому что инкапсулировали ее в класс
//                    if(weight < 0){                            // Проверяем правильность ввода
//                        System.out.println("Ошибка. Вес не может быть меньше нуля"); // Выводим сообщение об ошибке
//                        break;                                 // Выходим аварийно. Без создания объекта
//                    }
                   vlad = new Human(name, weight);                   // Создаем объект, пользуясь первым конструктором
                    break;                                         // Завершаем case, т.е. действия на данное условие

                case 2:                                        // Условие 2
                    System.out.println("Введите имя, финансовый баланс и возраст");   // Приглашение ввести данные
                    name = sc.next();                     // Считываем имя
                    double balance = sc.nextDouble();     // Считываем финансовый баланс
                    int age = sc.nextInt();               // Считываем возраст
                    vera = new Human(name, balance, age);      // Создаем объект, пользуясь вторым конструктором
                    break;                                     // Завершаем case, т.е. действия на данное условие

                case 3:                                        // Условие 3
                    System.out.println("Изменить имя - 1 \n" + //
                            "Изменить вес - 2");
                    int mode = sc.nextInt();
                    if(mode == 1){
                        System.out.println("Введите новое имя: ");
                        name = sc.next();
                      vlad.setName(name);
                      System.out.println("Имя: " + vlad.getName() + " Вес: " + vlad.getWeight());
                    }
                    else {
                        System.out.println("Введите новый вес: ");
                        weight = sc.nextDouble();
                      vlad.setWeight(weight);
                      System.out.println("Имя: " + vlad.getName() + " Вес: " + vlad.getWeight());
                    }
                    break;

                case 4:                                        // Условие 4
                    System.exit(0);                            // Завершение программы
                    break;

                default:                                       // Прописываем дефолтный оператор
                    System.out.println("Такого варианта нет");
            }   //TODO Сделать калькулятор: в бесконечном цикле для сложения, вычитания, умножения и деления

        }
    }
    // Пример полиморфизма методов
    /*

    Метод для
    расчета площади прямоугольника*
    @param
    a ширина*
    @param
    b длина*@return площадь*/

    public static double square(int a, int b) { // TODO добиться проверки на корректность ввода. Отрицательные параметры недопустимы
        return a * b;
    }

    /*

    Метод для
    расчета площади прямоугольника*
    @param a сторона А*
    @param b сторона В*
    @param c сторона С*@return площадь*/

    public static double square(int a, int b, int c){   // Считаем по формуле Герона
        int per = (a+ b+ c)/2;                          // TODO организовать проверку на существование треугольника(Подсказка: сумма любых двух сторон должна быть больше третьей)
        return Math.sqrt(per*(per-a)*(per-b)*(per-c));
    }
}

