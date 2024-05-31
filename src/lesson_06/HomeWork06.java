package lesson_06;

import java.util.Random;
import java.util.Scanner;

public class HomeWork06 {
    public static void main(String[] args) {

        /*
            Task 1
            Необходимо написать программу, которая предлагает
            пользователю ввести число на выбор: 1, 2 или 3.
            Программа должна сказать, какое число ввёл пользователь:
            Один, Два, или Три (текстом)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1, 2 или 3:");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Один");
                break;
            case 2:
                System.out.println("Два");
                break;
            case 3:
                System.out.println("Три");
                break;
            default:
                System.out.println("Неверное число. Введите 1, 2 или 3.");
        }
        scanner.close();

        /*
        Task 2
Запишите в 4 переменные случайные числа от 0 до 100.
Выведите все 4 числа на экран.
Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
Output: Максимальное число: 33
         */
        Random rand = new Random();
        int n1 = rand.nextInt(101);
        int n2 = rand.nextInt(101);
        int n3 = rand.nextInt(101);
        int n4 = rand.nextInt(101);

        System.out.println("Числа: " + n1 + ", " + n2 + ", " + n3 + ", " + n4);

        int max = Math.max(Math.max(n1, n2), Math.max(n3, n4));
        System.out.println("Макс.число: " + max);


        /* Task 4
Построчно упростить логическое выражение (соблюдая приоритетность операций):
System.out.println((true | false) | (45 < 70) & !(true) ^ (6 == 5));
Copy Пример выполнения:
System.out.println(true || false ^ true && !true);
System.out.println(true || false ^ true && false);
System.out.println(true || true && false);
System.out.println(true || false);
System.out.println(true);
Copy
Убедиться, что во всех выведенных строчках
выводится одинаковое значение типа boolean.
         */

                System.out.println((true | false) | (45 < 70) & !(true) ^ (6 == 5));
                System.out.println(true || false ^ true && !true);
                System.out.println(true || false ^ true && false);
                System.out.println(true || true && false);
                System.out.println(true || false);
                System.out.println(true);


            }
        }

