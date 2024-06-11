package javarush;

import java.util.Scanner;

public class JR3 {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String input = scanner.nextLine();

        if (secret.equalsIgnoreCase(input)) {
            System.out.println("доступ разрешен");
        } else {
            System.out.println("доступ запрещен");
        }

        // Вызов метода SolutAmigo
        SolutAmigo(scanner);
    }

    /* Используя цикл while вывести на экран сто раз цитату (переменная quote):
    «Я никогда не буду работать за копейки. Амиго»
    Каждое значение вывести с новой строки.*/

    public static void SolutAmigo(Scanner scanner) {
        String quote = "Я никогда не буду работать за копейки. Амиго";
        int count = 0;
        while (count < 100) {
            System.out.println(quote);
            count++;
        }

        Sveta(scanner);
    }

    /*
    Ввести с клавиатуры имя и, используя цикл while, 10 раз вывести: <имя> любит меня (переменная text).
    Каждый вывод - с новой строки.
    Пример вывода на экран для имени Света:
    Света любит меня.
    Света любит меня.
    Света любит меня.
     */
    public static void Sveta(Scanner scanner) {
        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();
        int counter = 0;
        while (counter < 10) {
            System.out.println(name + " любит меня.");
            counter++;
        }
        isExitEnter(scanner);
    }

    /* Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму, пока пользователь не введет слово "ENTER".
    Вывести на экран полученную сумму и завершить программу.*/

    public static void isExitEnter(Scanner scanner) {
        int sum = 0;
        boolean isExit = false;
        while (!isExit) {
            System.out.println("Введите число или 'ENTER' для завершения: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("ENTER")) {
                isExit = true;
            } else {
                try {
                    int number = Integer.parseInt(input);
                    sum += number;
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод, пожалуйста введите число или 'ENTER' для завершения.");
                }
            }
        }
        System.out.println("Сумма введенных чисел: " + sum);

        Solution11();
    }

    /*
    Используя вложенные циклы while (цикл в цикле) выведи на экран прямоугольник размером 5 (высота) на 10 (ширина), заполненный буквой 'Q'.

    Пример вывода:
    QQQQQQQQQQ
    QQQQQQQQQQ
    QQQQQQQQQQ
    QQQQQQQQQQ
    QQQQQQQQQQ
     */

    public static void Solution11() {
        int n = 0;
        while (n < 5) {
            int m = 0;
            while (m < 10) {
                System.out.print("Q");
                m++;
            }
            System.out.println();
            n++;
        }
        Solution12();
    }

    /*Используя вложенные циклы while (цикл в цикле) выведи на экран незаполненный прямоугольник (его контур) размером 10 (высота) на 20 (ширина) из букв 'Б'.
Незаполненная часть состоит из пробелов.
Пример вывода:
ББББББББББББББББББББ
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
Б                  Б
ББББББББББББББББББББ*/


    public static void Solution12() {
        int height = 1;
        while (height <= 10) {
            int width = 1;
            while (width <= 20) {
                if (height == 1 || height == 10) {
                    System.out.print('Б');
                } else if (width == 1 || width == 20) {
                    System.out.print('Б');
                } else {
                    System.out.print(' ');
                }
                width++;
            }
            System.out.println();
            height++;
        }

        NumberNumber1(new Scanner(System.in));
    }

    public static void NumberNumber1(Scanner scanner){
        boolean isExit = false;
        while (!isExit){
            System.out.println("Введите 'Exit' для завершения: ");
            String s = scanner.nextLine();
            isExit = s.equalsIgnoreCase("Exit");
        }
        System.out.println("Введено 'Exit'. Программа завершена.");
    }
}
