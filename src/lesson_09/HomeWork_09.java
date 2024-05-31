package lesson_09;

public class HomeWork_09 {
    public static void main(String[] args) {

/* Task 1 Написать метод, принимающий массив целых чисел и
распечатывающий массив в обратной последовательности.
{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1] */

        int[] numbers = {1, 4, 3, 6, 7};
        printArrayInReverse(numbers);
        printArrayInReverse(numbers, 2);
        printArrayInReverse(numbers, true);
        printArrayInReverse(numbers, false);

    }

    public static void printArrayInReverse(int[] array) {
        System.out.print("[");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");


        }
        System.out.println();
    }

    public static void printArrayInReverse(int[] array, int index) {
        System.out.print("[");
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = array.length - 1; i >= index; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArrayInReverse(int[] array, boolean reverse) {
        System.out.print("[");
        if (reverse) {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
