public class Main {   // Класс, в котором располагается точка входа в программу - Главный класс

    public static void main(String[] args) {  // Точка входа
        System.out.println("Начинаем самари!");
        System.out.println("Отвечаем на вопросы!");
        /*
        Реализовать расчеты суммы и разности целочисленных переменных a и b;
         */
        int a = 2;                 // Создаем переменную типу int со значением 2;
        int b = 4;

        int res = a + b;           // Находим сумму переменных
        System.out.println("Сумма: " + res);  // Выводим сумму на консоль
        res = a - b;               // Присваиваем переменной res новое значение - разность a и b;
        System.out.println("Разность: " + res);  // Выводим сумму на консоль

        // Нужно многократно повторять суммирование и вычитание для разных чисел. Возникает проблема дублирования кода

        a = 4;   // Меняем значение a и b
        b = 10;
        res = a + b;           // Находим сумму переменных
        System.out.println("Сумма: " + res);  // Выводим сумму на консоль
        res = a - b;               // Присваиваем переменной res новое значение - разность a и b;
        System.out.println("Разность: " + res);  // Выводим сумму на консоль

        a = -7;   // Меняем значение a и b
        b = 5;
        res = a + b;           // Находим сумму переменных
        System.out.println("Сумма: " + res);  // Выводим сумму на консоль
        res = a - b;               // Присваиваем переменной res новое значение - разность a и b;
        System.out.println("Разность: " + res);  // Выводим сумму на консоль

        //TODO Избавимся от дублирования кода. Для этого создадим методы для суммирования и вычитания переменных

        add(1, 2); // Вызываем метод(процедура) add и передаем ему параметры: 1 и 2
        add(3,4);
        add(10, -8);
        System.out.println(sub(4, 5)); // Получаем значение из метода sub и выводим его на консоль
        res = sub(5, 7); // В отличие от процедур, функции могут вернуть значение, которое впоследствии в программе можно будет использовать. В данном случае запоминаем разность в переменную res
        // Сложим разность чисел 5 и 7 из примера выше с 9
        System.out.println("Запомнили результат работы sub(5, 7) в переменную res: " + res);
        add(res, 9); // Получаем сумму 9 и запомненного результата от предыдущего вычисления
        // В это и есть разница между процедурой(void) и функцией - значение, которое вернет функция можно использовать в программе далее, процедура ничего не вернет

        /*
        Задача
        1 уровень сложности: №1

         Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
         Числа могут быть, как целочисленные, так и дробные.

         Например :
         ввод : m=10.5, n=10.45
         вывод: Число 10.45 ближе к 10.

         Решение
         1) В double можно записать как целое, так и дробное число, поэтому создадим две переменные типа double
         2) Создадим метод(процедуру), который будет определять какое число ближе
         3) Определить является ли число отрицательным. //TODO Доп. задание - познакомиться с классом Math
         3.1) Проверяем является ли первое число отрицательным
         */
        double m = 5;        // Локальные переменные, т.е. объявленные в методы
        double n = 15;
        solver1(m, n);

        // Создадим несколько котов

        Cat myrka = new Cat("Мурка", 5, "Common"); // Создаем объект класса Cat
        myrka.run(); // Вызываю метод объекта

        Cat pysya = new Cat("Пуся", 7, "Common"); // Создаем объект класса Cat
        pysya.run(); // Вызываю метод объекта
        pysya.meow();

        // Создадим класс, в котором будут решаться задачи калькулятора
        // Создадим его объект, вызывав, конструктор по умолчанию
        Calculator calculator = new Calculator();   // Создаем объект калькулятора
        // Найдем сумму, вызвав, метод(функцию) объекта calculator;
        System.out.println(calculator.add(5, 7));
    }

    // TODO Разобрать решение задачи и потом не подсматривая в код попробовать ее реализовать самостоятельно
    public static void solver1(double x, double y){  // Метод принимающий параметры число
        double res1;    // Декларируем переменные для расстояний между параметром и 10
        double res2;
        // Проверяем больше ли нуля или меньше нуля параметры и взависимоти от этого мы определяем алгоритм решения
        if(x < 0){
           x = Math.abs(x);  // Вызываем класс Math и его функцию abs, которая находит модуль число, т.е. делает его неотрицательным
           res1 = 10 + x;
           x = -x;           // В случае, когда x меньше нуля, нужно будет вернуть ему его исходное значение после вычисления расстояния, чтобы вывести корректную начальную координату
        }
        else {
            res1 = Math.abs(10 - x);
        }
        if(y < 0){
            y = Math.abs(y);
            res2 = 10 + y;
            y = -y;
        }
        else {
            res2 = Math.abs(10 - y);
        }
       if(res1 < res2){   // Проверяем какое расстояние меньше, если res 2, то выводим тело if, в противном случае тело else
           System.out.println( x + " Ближе к 10 чем " + y);
       }
       else if(res1 == res2){
           System.out.println("Точки: " + x  + " и " + y +  " равноудалены");
       }
       else {
           System.out.println( y + " Ближе к 10 чем " + x);
       }
    }

    public static void add(int x, int y){ // Сигнатура метода: public - модификатор доступа - метод будет виден всем, static - помещает метод в Metaspace, void - возвращает в точку вызова только управление программой, add - имя метода, по которому к нему можно обратиться, в скобках указаны параметры, которые получает метод
        // Метод принял значения и будет имя пользоваться под названием x и y
        System.out.println("Работает метод add: ");
        int res = x + y;           // Находим сумму переменных
        System.out.println("Сумма: " + res);  // Выводим сумму на консоль
    }

    public static int sub(int x, int y){ // Единственное отличие от метода add - вместо void указали int и теперь в методе нужно прописать return - вернуть в точку вызова, значение типа int
       System.out.println("Работает метод sub:");
       return x - y; // Возвращаю разность
    }
}


