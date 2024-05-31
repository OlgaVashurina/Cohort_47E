package lesson_09;

import java.util.Random;
import java.util.Scanner;

public class HW08 {
    public static void main(String[] args) {


        System.out.println("\n===========================Task 2=========================");

/* Task 2 Программа запрашивает у пользователя ввод произвольного числа.
Вывести сумму цифр этого числа.
Пример: 567432 -> 5+6+7+4+3+2 -> 27
 */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int userNumber = scanner.nextInt();
        scanner.nextLine();
        if (userNumber < 0) userNumber *= -1;
        int sum = 0; // куда-то эту сумму нужно собирать будем сюда
        while (userNumber > 0) {     // пока больше нуля будем что-то делать - код откусывания цифры
            int currentDigit = userNumber % 10;
            sum += currentDigit;
            System.out.println(currentDigit + ((userNumber > 10) ? " + " : " -> "));
            userNumber /= 10;
        }
        System.out.println(sum);


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
        int length = 5 + random.nextInt(11);

        int[] numbers2 = new int[length];

        for (int j = 0; j < length; j++) {
            numbers2[j] = -50 + random.nextInt(101);
        }

        int minNum = numbers2[0];
        int maxNum = numbers2[0];
        int sum1 = 0;

        for (int number1 : numbers2) {
            if (number1 < minNum) {
                minNum = number1;
            }
            if (number1 > maxNum) {
                maxNum = number1;
            }
            sum1 += number1;
        }

        double average = (double) sum1 / length;

        System.out.println("Массив: ");
        for (int number1 : numbers2) {
            System.out.print(number1 + " ");
        }
        System.out.println("Минимальное значение: " + minNum);
        System.out.println("Максимальное значение: " + maxNum);
        System.out.println("Среднее арифметическое: " + average);

    }

}
