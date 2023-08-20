public class Cat {  // Шаблон для котов
    String name;    // Набор свойств, которые будут у котов
    int age;
    String breed;

    public Cat(String name, int age, String breed){ // Конструктор для создания кота
        this.name = name;                           // this - означает ссылку на текущий объект
        this.age = age;
        this.breed = breed;
    }

    // Кроме данных в объект можно погрузить и операции - методы

    public void run(){
        System.out.println(name + " is running");
    }

    public void meow(){
        System.out.println(name + " is meowing");
    }

}
