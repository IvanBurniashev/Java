package Lesson.lesson_160823;

public class Main {
    public static void main(String[] args) {
    //     int[] numbers = {1, 34, 5, 2, 1, 5, 6, 4, 2};
    //     int pos = find(numbers, 5);
    //     if (pos == -1) {
    //         System.out.println("Элемент не найден!");
    //     } else {
    //         System.out.println("Позиция равна: " + pos);
    //     }


    }

    // static int find(int[] array, int value) {
    //     int count = array.length;
    //     int position = -1;

    //     for (int i = 0; i < count; i++) {
    //         if(array[i] == value) {
    //             position = i;
    //             break;
    //         }
    //     }
    //     return position;
    // }

    // static int find2(int[] array, int value) {
    //     int count = array.length;

    //     for (int i = 0; i < count; i++) {
    //         if(array[i] == value) {
    //            return i;
    //         }
    //     }
    //     return -1;
    // }

    // static int findAll(int[] array, int value) {
    //     int length = array.length;
    //     int count = 0;
    //     for (int i = 0; i < length; i++) {
    //         if(array[i] == value) {
    //            count++;
    //         }
    //     }
    //     return count;
    // }
    int[] array = {3, 1, 2, 8, 5, 4, 3, 1, 2};
    static void bubbleSort(int[] array) {
        int length = array.length;
        for (int k = 0; k < length - 1; k++) {
            for (int i = 0; i < length - 1 - k; i++) {
                if (array[i] > array[i + 1]) {
                int t = array[i];
                array[i] = array[i + 1];
                array[i + 1] = t;
                }
            }
        }

    }

}
