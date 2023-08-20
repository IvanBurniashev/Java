package Lesson.lesson_310723.classwork;

public class Classwork_cat {
    double hight;
    String name;
    int age;
    String color;
    boolean claws;

    boolean sleep;

    public Classwork_cat(){
        this.hight = 0;
        this.name = "";
        this.age = 0;
        this.color = "";
        this.claws = false;
        this.sleep = false;
    }

    public Classwork_cat(double hight, String name, int age, String color, boolean claws) {
        this.hight = hight;
        this.name = name;
        this.age = age;
        this.color = color;
        this.claws = claws;
    }

    public Classwork_cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.color = "";
        this.claws = false;
        this.hight = 0;
    }

    public void eat(){
        if(!this.sleep){
            System.out.println("Cat is eating");
            return;
        }
        System.out.println("Cat is not eating");
    }

    public void play(){
        System.out.println("Cat is playing");
    }

    public void setSleep(boolean sleep){
        this.sleep = sleep;
    }

    public boolean getSleep(){
        return this.sleep;
    }

    public void meow(){
        System.out.println("meow");
    }
}
