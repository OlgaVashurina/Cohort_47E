package lesson_11;

import java.util.Random;

public class ArraysUtil {

    public static void main(String[] args) {
        // Пример использования методов
        int[] ints = {25, 11, 53, 45, 56, 93, 46, 55, 3734, 857, 36};
        sortArray(ints);
        printArray(ints);
        System.out.println(linearSearch(ints, 77));
        System.out.println(linearSearch(ints, 100));
    }

    public static int binarySearch(int[] array, int value) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int counter = 0;

        while (startIndex <= endIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2; // Вычисляем середину

            counter++;

            if (array[middleIndex] == value) {
                System.out.println("Число найдено за шагов: " + counter);
                return middleIndex;
            }

            if (array[middleIndex] < value) {
                startIndex = middleIndex + 1;
            } else {
                endIndex = middleIndex - 1;
            }
        }

        System.out.print("Число не найдено. Количество шагов: " + counter);
        return -1;
    }

    public static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1; // Возвращаем -1, если элемент не найден
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = minIndexSearch(array, i);
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static int minIndexSearch(int[] array, int startIndex) {
        int min = array[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex + 1; i < array.length; i++) { // Начинаем с startIndex + 1
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void printArray(int[] ints) {
        if (ints == null) {
            System.out.println("null");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + ((i < ints.length - 1) ? ", " : "]\n"));
        }
        if (ints.length == 0) {
            System.out.println("]");
        }
    }

    public static int[] fillTestArrray(int size) {
        int[] result = new int[size];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(2001) - 1000;
        }
        return result;
    }
}
