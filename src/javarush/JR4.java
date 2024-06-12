package javarush;

import java.util.Scanner;

/* Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
Слово "enough" выводить не нужно.
Для этого необходимо использовать бесконечный цикл (while(true)).
Подсказка: чтобы завершить бесконечный цикл, используй оператор break. */
public class JR4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите текст или enough");
        while (true) {
            String s = console.nextLine();
            if (s.equals("enough")) {
                break;
            }
            System.out.println(s);
        }
        NumBerI();

        // Вызов метода для вывода суммы чисел от 1 до 100 включительно, не кратных 3.
        SolutionNum();
    }

    public static void NumBerI() {
        int i = 1;
        while (i <= 20) {
            if ((i % 7) == 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }

    /* Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3. Для этого используй цикл while.
    Подсказка: чтобы в цикле перейти к следующему числу, используй оператор continue. */
    public static void SolutionNum() {
        int summes = 0;
        int numberes = 0;
        while (numberes <= 100) {
            if (numberes % 3 == 0) {
                numberes++;
                continue;
            }
            summes = summes + numberes;
            numberes++;
        }
        System.out.println(summes);
    }
}
