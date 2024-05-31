package lesson_09;

import java.util.Random;

/* Task 3 Заполните массив 50 случайными числами от 1 до 100.
Программа должна найти, и вывести на экран все простые числа.
 Посчитайте сколько получилось таких чисел в массиве.
 Простое число - число, которое делится на цело только на 1 и само себя.
Пример простых чисел: 3, 5, 7, 11, 13 и т.д */
public class Task3 {
    public static void main(String[] args) {

        int range = 50;
        int[] numbers = new int[range];
        fillArray(numbers);
        printNumbers(numbers);
        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            boolean isSimple = true;

            if (num < 2) continue; // если число меньше 2, оно не является простым

            // Проверяем делители до квадратного корня из числа
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    isSimple = false;
                    break; // число не является простым, прерываем цикл
                }
            }

            if (isSimple) {
                System.out.print(num + ", ");
                counter++; // увеличиваем счетчик простых чисел
            }
        }
        System.out.println();
        System.out.println("Найдено простых чисел: " + counter);

    }

    public static void fillArray(int[] number) {
        Random random = new Random();
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(100) + 1;
        }
    }

    public static void printNumbers(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ((i < arr.length - 1) ? ", " : "]\n"));
        }
    }
}
