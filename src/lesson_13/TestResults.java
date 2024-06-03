package lesson_13;

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {

        // получить тест от пользователя
        System.out.println("Введи свою оценку");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        // хотим получить оценку
        char grade;
        if (score < 60) {
            grade = 'F';
        } else if (score < 70) {
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else if (score < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }
        System.out.println(" Твоя  оценка " + grade);
    }
}
