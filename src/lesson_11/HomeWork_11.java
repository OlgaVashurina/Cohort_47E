package lesson_11;

public class HomeWork_11 {
    public static void main(String[] args) {

        /* Task 1 Написать метод, который считает сумму всех элементов в массиве. */
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = sumAllSum(number);
        System.out.println("Сумма элементов: " + sum);

        /* Task 2 Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое).*/
        int[] numbers = {14, 52, 63, 44, 75};

        double average = calculateAverage(numbers);
        System.out.println("Среднее: " + average);

        /* Task 3 Написать метод, который проверяет, является ли массив палиндромом (читается одинаково с обоих концов). */
        int[] numbers1 = {5, 8, 9, 10, 9, 8, 5};
        int[] numbers2 = {1, 2, 3, 4, 5};

        boolean isPalindrome1 = isArrayPalindrome(numbers1);
        boolean isPalindrome2 = isArrayPalindrome(numbers2);

        System.out.println("Массив numbers1 палиндром: " + isPalindrome1);
        System.out.println("Массив numbers2 палиндром: " + isPalindrome2);

        /* Task 4 Написать метод, который удаляет все вхождения заданного числа из массива и возвращает новый массив без этого числа.*/
        int[] numbersToRemove = {1, 2, 3, 2, 4, 2, 5};
        int valueToRemove = 2;

        int[] newArray = removeElement(numbersToRemove, valueToRemove);
        System.out.println("Новый массив: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }

    /* Task 4 Написать метод, который удаляет все вхождения заданного числа из массива и возвращает новый массив без этого числа. */
    public static int[] removeElement(int[] array, int value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                count++;
            }
            if (count == 0) return array;
            if (count == array.length) return  new int[0];
        }


        int[] newArray = new int[array.length - count]; // длина старого массива - кол во элементов сколько хотим выкинуть
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != value) {
                newArray[index++] = array[i];
            }
        }

        return newArray;
    }

    /* Task 3 Написать метод, который проверяет, является ли массив палиндромом (читается одинаково с обоих концов). */
    public static boolean isArrayPalindrome(int[] array) {
        int left = 0;
        int right = array.length - 1;
// код проверки.
        while (left < right) {
            if (array[left] != array[right]) {
                return false; // Если элементы не равны, это не палиндром
            }
            left++;
            right--;
        }

        return true;
    }

    /* Task 2 Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое). */
    public static double calculateAverage(int[] array) {
        if (array == null) return 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = (double) sum / array.length;
        return average;
    }

    /* Task 1 Написать метод, который считает сумму всех элементов в массиве. */
    public static int sumAllSum(int[] array) {
        if (array == null)
            return -2_147_000_000;  // хорошего решения тут пока что нет. Нужно создать ошибку и вернуть ошибку.
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
