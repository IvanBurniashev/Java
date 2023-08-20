package Lesson.lesson_070823;

public class Main {
    public static void main(String[] args) {
        
        /*
        Создайте и инициализируйте переменную int = 10
        В блоке if сравните созданную переменную со значением 15
        Внутри блока добавьте инструкцию System.out.println("i is smaller than 15");
        В  блоке else добавьте инструкцию System.out.println("i is greater than 15");
        */
        int number = 10;
        if( number < 15 ){
            System.out.println("i is smaller than 15");
        } else {
            System.out.println("i is greater than 15");
        }
        System.out.println("I am Not in if");

        /*
        Создайте и инициализируйте переменную int = 10
        В блоке if сравните созданную переменную со значением 10 (==)
        Внутри блока добавьте блок if и сравните переменную со значением 15 , внутри блока добавить инструкцию System.out.println("i is smaller than 15");
        Добавите еще один блок if-else и сравните переменную со значением 12 
        В блоке if добавить инструкцию System.out.println("i is smaller than 12 too")
        В  блоке else добавьте инструкцию System.out.println("i is greater than 12");
        Проанализируйте вывод
        */    
        if (number == 10) {
            System.out.println("i equals 10");
        }
        if (number < 15) {
            System.out.println("i is smaller than 15");
        } else {
            if (number < 12) {
                System.out.println("i is smaller than 12 too");
            } else {
                System.out.println("i is greater than 12");
            }
        }
    }
}
