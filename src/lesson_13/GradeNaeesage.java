package lesson_13;

import jdk.jshell.StatementSnippet;

import java.util.Scanner;

public class GradeNaeesage {
    public static void main(String[] args) {
        System.out.println("Введи оценку");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch (grade) {          // каждый вариант это путь
            case "A":
                message = "Отличная работа";
                break;
            case "B":
                message = "Хорошая работа";
                break;
            case "C":
                message = "Нормальная работа";
                break;
            case "D":
                message = "Тебе нужно работать лучше";
                break;
            case "F":
                message = "Плохо";
                break;
            default:
                message = "Ошибка, не верные данные!";
                break;
        }
        System.out.println(message);
    }
}
