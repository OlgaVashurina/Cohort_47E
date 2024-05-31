package lesson_07;

import java.util.Scanner;

public class HomeWork7_Task1und2 {
    public static void main(String[] args) {
        /*
        Task 1
Перепишите решение задачи с использованием switch вместо if-else:
Напишите программу, которая предлагает пользователю ввести число 1, 2 или 3.
Программа должна выводить на экран введенное число прописью: "Один", "Два" или "Три".
         */
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Введите 1, 2 или 3");
            number = scanner.nextInt();

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
                    System.out.println("Некорректный ввод.");
            }
        } while (number != 1 && number != 2 && number != 3);

        /*
        Task 2
Напишите программу с использованием оператора switch:
Программа просит пользователя ввести число от 1 до 7.
Если число равно 1, выводим на консоль "Понедельник",
2 — "Вторник" и так далее. Если 6 или 7 — "Выходной".
         */

        Scanner scanner1 = new Scanner(System.in);
        int numberWeek;
        do {
            System.out.println("Введите число от 1 до 7");
            numberWeek = scanner.nextInt();

            switch (numberWeek) {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6:
                    System.out.println("Выходной");
                    break;
                case 7:
                    System.out.println("Выходной");
                    break;

                default:
                    System.out.println("Некорректный ввод.");
            }
        } while (numberWeek < 1 || numberWeek > 7);




    }
}
