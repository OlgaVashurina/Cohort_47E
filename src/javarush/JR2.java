package javarush;

import java.util.Scanner;

public class JR2 {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой возраст");
        int age = scanner.nextInt();
        if (age <= 20 || age >= 60) {
            System.out.println("можно не работать");
            // }else{
            // System.out.println("Работай"); // можно так и так!
        }
        System.out.println("\n================================\n");
        Costet(scanner);
    }

    /*
    Ввести с клавиатуры два целых числа, которые будут координатами точки (первое считанное число - это координата "x", а второе - координата "y").
    Известно, что точка не лежит на координатных осях OX и OY.
    Вывести на экран номер координатной четверти, в которой находится данная точка.
    Подсказка: Принадлежность точки с координатами (x, y) к одной из четвертей определяется следующим образом:
    для первой четверти x>0 и y>0;
    для второй четверти x<0 и y>0;
    для третьей четверти x<0 и y<0;
    для четвертой четверти x>0 и y<0.
    */
    public static void Costet(Scanner scanner) {
        System.out.println("Ввести с клавиатуры два целых числа, которые будут координатами точки: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Принадлежность точки с координатами (x, y) к 1 четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("Принадлежность точки с координатами (x, y) к 2 четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("Принадлежность точки с координатами (x, y) к 3 четверти");
        } else if (x > 0 && y < 0) {
            System.out.println("Принадлежность точки с координатами (x, y) к 4 четверти");
        }
        NumberNumber(scanner);
    }

    /*
    У нас есть программа, которая считывает с клавиатуры два числа и выводит на экран большее из них. Если числа одинаковые, то выводится любое.
    Перепиши программу с использованием тернарного оператора, чтобы ее функционал остался без изменений.
    */
    public static void NumberNumber(Scanner scanner) {
        System.out.println("Введите два числа: ");
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();

        int number = numberA > numberB ? numberA : numberB;
        System.out.println("Tернарный оператор: " + number);

        Doubledouble(scanner);
    }

    /*
    Напиши программу, которая считывает с клавиатуры два вещественных числа (double) и выдает сообщение о том,
    равны ли эти числа с точностью до одной миллионной.
    */
    public static void Doubledouble(Scanner scanner) {
        System.out.println("Введите два числа");
        double A = scanner.nextDouble(); // Double A = 1.000001;
        double B = scanner.nextDouble(); // Double B = 1.000002;

        if (Math.abs(B - A) < 0.000001) {
            System.out.println("числа равны");
        } else {
            System.out.println("числа не равны");
        }
    }
}

/*
Напиши программу, которая считывает с клавиатуры две строки и выдает сообщение о том, одинаковые ли эти строки.
*/
class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        String b = console.nextLine();
        // напишите тут ваш код
        if (a.equals(b)) {
            System.out.println("строки одинаковые");
        } else {
            System.out.println("строки разные");
        }
    }
}

/*
В методе main напиши код попарного сравнения по ссылке строк string1, string2 и string3 с выводом соответствующего сообщения после каждого сравнения:
"ссылки на строки одинаковые" или "ссылки на строки разные".

Порядок сравнения должен быть следующим:
- строку string1 со строкой string2
- строку string2 со строкой string3
- строку string1 со строкой string3.
*/
class Solution1 {
    public static String string1 = "Амиго";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        String same = "ссылки на строки одинаковые";
        String different = "ссылки на строки разные";

        if (string1 == string2) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }

        if (string2 == string3) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }

        if (string1 == string3) {
            System.out.println(same);
        } else {
            System.out.println(different);
        }
    }
}
