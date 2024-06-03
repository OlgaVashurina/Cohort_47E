package lesson_13;

import java.util.Scanner;

public class HWGrossSesson {
    public static void main(String[] args) {

        System.out.println(" Введите время года?: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println(" Введите целое число: ");
        int numbers = scanner.nextInt();

        System.out.println(" Введите прилагательное ");
        String adjective = scanner.next();
        scanner.close();

        System.out.println(" on a "  + adjective + " day " + season + ", i drink a minimum of " +  numbers + " cups of coffee");

    }
}
