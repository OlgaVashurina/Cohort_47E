package javarush;

import java.util.Scanner;

public class JR1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();

        if (age <= 18) {
            System.out.println("Ты еще мелкий, слушай родителей!");
            System.out.println("Прибирайся в комнате");
        } else if (age >= 19 && age <= 40) {
            System.out.println("Хватит тусить по клубам, иди занимайся семьей!");
        } else if (age >= 41 && age <= 70) {
            System.out.println("Делай все что хочешь, тебе этот мир абсолютно понятен!");
        } else {
            System.out.println("Тебе можно гулять по ночам, по барам!!!");
        }

        System.out.println("\n================================\n");

        newMethod(scanner);
    }

    public static void newMethod(Scanner scanner) {
        System.out.println("Введите какой подошел автобус?");

        int bus26 = scanner.nextInt();

        if (bus26 == 26) {
            System.out.println("Зайди в автобус");
        } else {
            System.out.println("Жди следующего или иди пешком!");
        }
        theWesser(scanner);
        System.out.println("\n================================\n");
    }

    /*
    Однострочные тела условий:
    Если тело условия состоит из одной строки, то фигурные скобки {} можно опустить.
    Важный момент:
    Если в конструкции if-else не расставлены фигурные скобки, else относится к предыдущему (ближайшему к нему) if-у.
    */

    public static void theWesser(Scanner scanner) {
        System.out.println("Введите погоду: ");
        int theWesser = scanner.nextInt();

        if (theWesser < 0)
            System.out.println("Одень куртку и шапку");
        else if (theWesser < 10)
            System.out.println("Одень куртку");
        else if (theWesser <= 20)
            System.out.println("Можешь идти в кофте");
        else
            System.out.println("Иди в футболке");

        System.out.println("\n================================\n");

        NumberMinMax(scanner);
    }

    public static void NumberMinMax(Scanner scanner) {
        System.out.println("Введите два числа по очереди");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (a < b) {
            System.out.println(" Второе число больше первого");
        } else {
            System.out.println("Первое число больше второго!");
        }
        double sum = a + b;
        System.out.printf("Получилось: %.2f\n", sum);
        System.out.println("\n================================\n");

        IsSennior(scanner);
    }

    public static void IsSennior(Scanner scanner) {
        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();
        boolean isSenior = (age > 65);
        if (isSenior) {
            System.out.println("Пора на пенсию!");
        } else {
            System.out.println("Еще не пора на пенсию!");

            System.out.println("\n================================\n");

        }

        Solution(scanner);
    }

    public static void Solution(Scanner scanner) {
        System.out.println("Введите температуру тела: ");
        double bodyTemperature = scanner.nextDouble();
        boolean isHigh = bodyTemperature > 37;
        boolean isLow = bodyTemperature < 36;

        if (isHigh) {
            System.out.println("Температура высокая");
        } else if (isLow) {
            System.out.println("Температура низкая");
        } else {
            System.out.println("Температура нормальная");
        }
        System.out.println("\n================================\n");

        DoubleNumbers(scanner);
    }

    public static void DoubleNumbers(Scanner scanner) {
        System.out.println("Введите три числа по очереди");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 == number2 && number1 == number3) {
            System.out.println("Все три числа равны между собой: " + number1 + " " + number2 + " " + number3);
        } else if (number1 == number2) {
            System.out.println("Равны только 2 числа (Первое и второе): " + number1 + " " + number2);
        } else if (number1 == number3) {
            System.out.println("Равны только 2 числа (Первое и третье): " + number1 + " " + number3);
        } else if (number2 == number3) {
            System.out.println("Равны только 2 числа (Второе и третье): " + number2 + " " + number3);
        } else {
            System.out.println("Числа не равны");
        }

        System.out.println("\n================================\n");

        DoubleNumbersThri(scanner);
    }

    public static void DoubleNumbersThri(Scanner scanner) {

        String TRIANGLE_EXISTS = "треугольник существует";
        String TRIANGLE_NOT_EXISTS = "треугольник не существует";

        System.out.println("Введите 3 числа: ");


        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println(TRIANGLE_EXISTS);
        } else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }

    }
}