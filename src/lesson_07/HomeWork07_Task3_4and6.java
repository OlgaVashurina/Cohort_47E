package lesson_07;

import java.util.Random;
import java.util.Scanner;

public class HomeWork07_Task3_4and6 {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);


        int timeTV = 45;

        Random random = new Random();

        int note = random.nextInt(12) + 1;

        System.out.println("Принесенная оценка: " + note);

        switch (note) {
            case 12:
            case 11:
            case 10:
                System.out.println("Какой ты молодец, я рада, смотри ТВ целый час: " + note);
                timeTV += 60;
                break;
            case 9:
            case 8:
            case 7:
                System.out.println("Хорошая работа, сегодня можешь смотреть: " + note + "минут");
                timeTV += 45;
                break;
            case 6:
            case 5:
            case 4:
                System.out.println("Можно было и лучше оценку принести: " + note + "минут");
                timeTV += 15;
                break;
            case 3:
                System.out.println("Это провал, ужас: " + note);
                timeTV -= 30;
                break;
            case 2:
            case 1:
                System.out.println("На сегодня без ТВ");
                timeTV = 0;
            default:
                System.out.println("Некорректная оценка");
        }

        System.out.println(" Время для просмотра телевизора составило: " + timeTV + "минут");

        /*
        Task 4
        Используйте цикл while для решения задачи:
        Распечатайте 10 строк: "Task1", "Task2", ..., "Task10".
                */

        int x = 1;
        while (x <= 10) {

            System.out.println("Task" + x);
            x++;
        }


        /*
        Task 6
Напишите программу, которая просит пользователя ввести слово "hello".
Если пользователь вводит правильное слово, программа благодарит его и завершает работу.
Если вводится неправильное слово, программа продолжает запрашивать ввод,
пока не будет введено правильное слово.
Дополнительно: Подсчитайте количество попыток, потребовавшихся для ввода правильного слова,
и выведите это количество на экран.
         */

        Scanner scanner = new Scanner(System.in);
        String input;
        int attempts = 0;

        do {
            System.out.println("Введите hello");
            input = scanner.nextLine();
            attempts++;

            if (!input.equals("hello")) {
                System.out.println("Некорректный ввод.");
            }

        } while (!input.equals("hello"));
        System.out.println("Cпасибо, вы все ввели правильно");
        System.out.println("Количество попыток: " + attempts);

    }
}
