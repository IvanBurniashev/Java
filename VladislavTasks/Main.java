import java.lang.reflect.Field;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        Random rnd = new Random();
        
        GenerationString foo = new GenerationString();

        //Решение через Field
        Class c = foo.getClass();
        String newFiedlA = "a" + rnd.nextInt(1, 7);
        String newFiedlB = "b" + rnd.nextInt(1, 7);
        String newFiedlC = "c" + rnd.nextInt(1, 7);
        String newFiedlD = "d" + rnd.nextInt(1, 7);
        Field field1 = c.getDeclaredField(newFiedlA);
        Field field2 = c.getDeclaredField(newFiedlB);
        Field field3 = c.getDeclaredField(newFiedlC);
        Field field4 = c.getDeclaredField(newFiedlD);
        String fieldValue1 = (String) field1.get(foo);
        String fieldValue2 = (String) field2.get(foo);
        String fieldValue3 = (String) field3.get(foo);
        String fieldValue4 = (String) field4.get(foo);
        System.out.println(fieldValue1 + " " + fieldValue2 + " " + fieldValue3 + " " + fieldValue4);

        System.out.println();

        //Решение через Switch
        foo.getString(rnd.nextInt(1, 7), rnd.nextInt(1, 7), rnd.nextInt(1, 7), rnd.nextInt(1, 7));

        System.out.println();

        // Решение через массив
        foo.getStringArr(rnd.nextInt(6), rnd.nextInt(6), rnd.nextInt(6), rnd.nextInt(6));
    }
}