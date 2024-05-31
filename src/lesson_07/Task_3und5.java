package lesson_07;

import java.util.Random;
import java.util.Scanner;

public class Task_3und5 {
    public static void main(String[] args) {

                /*
        Task 3
Используйте оператор switch для решения задачи:
Ваш ребенок принес оценку за контрольную работу по математике.
В школе 12-балльная система. Запишите в переменную случайное число от 0 до 12.
Вы разрешаете ребенку смотреть телевизор не более 60 минут в день.
На сегодня у него осталось 45 минут.
Если оценка от 10 до 12 баллов: скажите ребенку, как вы рады, и добавьте к оставшемуся времени 1 час.
Оценка от 7 до 9 баллов: похвалите ребенка и добавьте 45 минут.
Оценка от 4 до 6 баллов: нейтрально отнеситесь и добавьте 15 минут.
Оценка 3 балла: огорчитесь и вычтите 30 минут.
Оценка меньше 3 баллов: запретите телевизор на сегодня.
Выведите на экран оставшееся время для просмотра ТВ.
         */


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
                break;
            default:
                System.out.println("Некорректная оценка");
        }

        System.out.println(" Время для просмотра телевизора составило: " + timeTV + "минут");

        if (timeTV > 60) timeTV = 60;
        if (timeTV < 0) timeTV = 0;



        /*
Task 5
Используйте цикл while для решения задачи:
Распечатайте 7 чисел от 1 до 100,
которые делятся на 5 без остатка.
         */

        int i = 1;
        int countNumber = 0;

        while (i <= 100 && countNumber < 7) {
            if (i % 5 == 0) {
                // если тру то что то надо делать. печатаем
                System.out.println(i);
                countNumber++;
            }
            i++; // увеличили на единицу
        }


    }
}
