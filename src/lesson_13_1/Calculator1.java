package lesson_13_1;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");

        double number1 = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double number2 = scanner.nextDouble();

        System.out.println("Введите требуемые действия: \n 1. +\n 2. -\n 3. * \n 4. /");
        int choise = scanner.nextInt();

        switch (choise) {

            case 1:
                System.out.printf("Результат: %.2f%n", number1 + number2);
                break;
            case 2:
                System.out.printf("Результат: %.2f%n", number1 - number2);
            case 3:
                System.out.printf("Результат: %.2f%n", number1 + number2);
                break;
            case 4:
                if (number2 != 0) {
                    System.out.printf("Результат: %.2f%n", number1 / number2);
                } else {
                    System.out.println("Ошибка: деление на ноль невозможно.");
                }
                break;
            default:
                System.out.println("-");
        }


    }
}
