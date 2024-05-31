package lesson_08;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_08 {
    public static void main(String[] args) {

        System.out.println("\n===========================Task 4=========================");

/*Task 4  Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.
Пример: { 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }
 */

        int[] numbers = new int[]{5, 6, -25, 0, 31, -15};
        int max = 0;
        int min = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[max]) {
                max = i;
            }
            if (numbers[i] < numbers[min]) {
                min = i;
            }
        }

        int tempValue = numbers[max];
        numbers[max] = numbers[min];
        numbers[min] = tempValue;

        String arrayToString = "[";
        for (int i = 0; i < numbers.length; i++) {
            arrayToString += numbers[i] + ((i == numbers.length - 1) ? "]" : ", ");
        }
        System.out.print(arrayToString);

        System.out.println("\n===========================Task 1=========================");

/* Task 1 Распечатать все числа от 1 до 100,
которые делятся на 5 без остатка, используя цикл do-while.
 */

        int i = 1;
        do {
            if (i % 5 == 0) {
                System.out.println(i + " ; ");
            }
            i++;
        } while (i <= 100);
        System.out.println();

        System.out.println("\n===========================Task 2=========================");


/* Task 2 Программа запрашивает у пользователя ввод произвольного числа.
Вывести сумму цифр этого числа.
Пример: 567432 -> 5+6+7+4+3+2 -> 27
 */

        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Введите число: ");
        number = scanner.nextInt();
        scanner.nextLine();

        int sum = 0;
        int tempValue1 = number;

        while (tempValue1 != 0) {
            sum += tempValue1 % 10;
            tempValue1 /= 10;
        }

        System.out.println("Сумма числа: " + sum);

 /*
Task 5. Дан массив строк.
Вывести на экран все символы самой длинной строки из массива.
Пример:{ "One", "Two", "Twenty" } ->
T
w
e
n
t
y */

        System.out.println("\n===========================Task 5=========================");

        String[] words = {"One", "Two", "Twenty"};
        String longStr = "";

        for (String str : words) {
            if (str.length() > longStr.length()) {
                longStr = str;
            }
        }
        System.out.println("Cамая длинная строка: " + longStr);
        for (int j = 0; j < longStr.length(); j++) {
            System.out.println(longStr.charAt(j));
        }


/* Task 3 Создать массив целых чисел произвольной длины от 5 до 15. Заполнить массив случайными значениями от -50 до 50.
Вывести на экран:
Минимальное значение в массиве
Максимальное значение в массиве
Среднее арифметическое всех значений в массиве
*/
        System.out.println("\n===========================Task 3=========================");

        Random random = new Random();
        int[] ints = new int[random.nextInt(11) + 5];

        System.out.print("[");
        for (int j = 0; j < ints.length; j++) {
            ints[j] = random.nextInt(101) - 50;
            System.out.print(ints[j] + ((j < ints.length - 1) ? ", " : "]\n"));
        }

        int minNum = ints[0];
        int maxNum = ints[0];
        int sum1 = 0;

        int j = 0;
        while (j < ints.length) {
            sum1 += ints[j];

            if (ints[j] > maxNum) maxNum = ints[j];
            if (ints[j] > minNum) minNum = ints[j];

            j++;
        }


        System.out.println("min: " + minNum);
        System.out.println("max: " + maxNum);
        System.out.println("Average: " + sum1);

    }

}