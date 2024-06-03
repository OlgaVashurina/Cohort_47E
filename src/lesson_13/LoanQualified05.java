package lesson_13;

import java.util.Scanner;

public class LoanQualified05 {
    public static void main(String[] args) {
// что мы згнаем?

        int requiredSalary = 30000;
        int requiredYersEmployed = 2;

        // спросить у пользователя что мы не знаем?
        System.out.println(" Введите вашу зарплату");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        System.out.println(" Укажите количество лет работы ");
        double yers = scanner.nextDouble();
        scanner.close();
        // теперь надо посчитать варианты, были ли выполнены условия?
        if (salary >= requiredSalary) {            // если это условие верно, пройди дальше и загляни в еще 1 если
            if (yers >= requiredYersEmployed) {
                System.out.println(" Поздравляю ты имеешь право на получение кредита ");
            } else {
                System.out.println("Извини но ты должно быть работала на своей работе "
                        + requiredYersEmployed + "лет");
            }
        }
        else {
            System.out.println("Извини но для этого ты должна получать как минимум "
            + requiredSalary + " эту зарплату");
        }


    }
}
