package lesson_13;

import java.util.Arrays;
import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {

        int[] array = {3, 2, 1, 0};
// возвращает строковые преддставления массива
        String arrayToString = Arrays.toString(array);

        System.out.println(arrayToString);
        System.out.println(Arrays.toString(array));


//сортирует указанный массив

        Arrays.sort(array, 1, 3);  // сортировка массива по порядку
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        // binarySearch - бинарный поиск ( массив должен быть отсортирован)

        int index = Arrays.binarySearch(array, 3);
        System.out.println("index: " + index);

        // Метод проверяет равна ли два метода
        int[] test = {0, 1, 3, 2};
        boolean isArraysEquals = Arrays.equals(array, test);
        System.out.println("isArraysEquals: " + isArraysEquals); // порядок важен надо сравнивать одинаковые массивы

        // находит и возвращает индекс первого различия между массивами
        int mismatchIndex = Arrays.mismatch(array, test);
        System.out.println("mismatchIndex: " + mismatchIndex);

// возвращает строковое представление массива, включая вложенные массивы.
        int[][] arrayD = new int[3][4];
        System.out.println(Arrays.deepToString(arrayD));


        // аналогично для сравнения многомерных массивов используется метод
        int[][] arrayC = new int[3][4];
        arrayC[2][3] = 1;
        boolean isEquals = Arrays.equals(arrayC, arrayD);
        System.out.println("isEquals: " + isEquals);

        int[][] arrayE = new int[3][4];
        arrayC[2][3] = 1;
        boolean isEqualsNew = Arrays.deepEquals(arrayE, arrayD);
        System.out.println("deepEquals: " + isEqualsNew);

        // метод копирует массив или его часть copyOf

        int[] copyOfTest = Arrays.copyOf(test, 10);
        System.out.println("Arrays.toString(copyOfTest): " + Arrays.toString(copyOfTest));
        System.out.println("Arrays.toString(Arrays.copyOf(test, 2): " + Arrays.toString(Arrays.copyOf(test, 2)));


        // заполнение массива
        int[] arr = new int[5];
        Arrays.fill(arr, 10);
        Arrays.fill(arr, 2, 5, 1000);
        Arrays.fill(arr, 2, 5, generatRandom());
        System.out.println(Arrays.toString(arr));

    }
    private static int generatRandom() {
        Random random = new Random();
        System.out.println("Метод генерации значения");
        int res = random.nextInt(101);

        return  res;
    }
}

