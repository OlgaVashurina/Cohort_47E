package lesson_06;

import java.util.Random;
import java.util.Scanner;

public class IfStatment {
    public static void main(String[] args) {
/*
        int x = 10;

        {
            // наружу блок виден
            // Но то что обьявлена внутри блока наружу не видно
            int y = 5;
            x = x + y;
            System.out.println(x);

            //  int y = 124; - так не дает! ВОТ ДОМИК
        }
        // x = x + y; // ошибка компиляции программа не компилируется не преобразовывается в код не понимает символ y
        // пишет что нет такой переменной не видна или не доступна в не своего блока
        // блоки опред видимости переменных {} она будет жить в отдельном домике никто снаружи е не видит
        // а вот Х виден везде.
        // X обьявлен в нутри внешнего блока
        int y = 124;
        // операторы ветвления или принятия решений их условия оператор
        // условие тип булевых данных который возвращает

        y = 8;

        // if (y > 25)    System.out.println("Всем привет!");

        if (y > 11) {
            System.out.println("Всем привет!");
            System.out.println("Сейчас y равен : " + y);
        } else {
            System.out.println("Мы находимся в блоке Else ");
            System.out.println("Сейчас y равен : " + y);
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую оценку получил ваш ребенок?");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number == 1) {  // если не равняется 10 то елсо. если оно не один может оно 10
            System.out.println(" Вы ввели число один");
        } else if (number == 10) {
            System.out.println(" Вы ввели десять");
        } else if (number == 9) {
            System.out.println(" вы ввели девять");
        } else {
            System.out.println(" Вы ввели не верное значение");
        }

        // System.out.println("\n=======================================================\n" +);

        /*
        у ребенка есть карманные деньги для простоты используем инт и сейчас у него 100 денег
        ребенок пригел из школы и принес оценку. ( оценка от отдного до пяти включительоно
        за хорошую оценку ребенок получает деньги а за плохую отбирают

        5 -> + 20
        4 -> + 10
        3 -> + 0
        2 -> - 10
        1 -> все
         Введите оценку ребенка
         Теперь у ребенка столько то денег

                */
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценку ребенка");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number == 5) {
            System.out.println("Вы поставили оценку 5, ребенок может получить 20 euro");
        } else if (number == 4) {
            System.out.println("Ребенок получил 4 тогда выдайте ему 10 euro");
        } else if (number == 3) {
            System.out.println("Ребенок получил 3 - не давайте ему деньги");
        } else if (number == 2) {
            System.out.println("Ребенок получил 2 заберите у него 10 euro");
        }
        else if (number == 1) {
            System.out.println("Ребенок получил 1 заберите у него все!");
        }



        */


        int money = 100;
        int note;

        // генерация случайного числа это как сканер импортируется рандом рандом

        Random random = new Random();

        note = random.nextInt(5) + 1 ; // будет выдавать от 0 до 5 не включительно случайное число 0 1 2 3 4
        // каждый раз будет генерить какое то число. Хочу получить от 1 до 5  - мне необходимо к тому что выдаст прибавить 1
        // что бы оценку выравнил правильно
        System.out.println(" Ребенок принес: " + note);

      //  System.out.println("У тебенка теперь " + money + "денег");

        if (note == 5) {
            money += 20;
        } else if (note == 4) {
            money += 10;
        } else if (note == 3) {

        } else if (note == 2) {
            money -= 10;
        } else if (note == 1) {
            money = 0;
        } else {
            System.out.println("таких оценок не бывает");
        }


    }


}
