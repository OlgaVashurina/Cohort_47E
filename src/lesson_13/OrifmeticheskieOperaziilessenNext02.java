package lesson_13;

import java.util.Scanner;

public class OrifmeticheskieOperaziilessenNext02 {
    public static void main(String[] args) {
/*
        int a = 10;
        int b = 7;

        // арифметические операции
        System.out.println("a + b =" + (a + b));
        System.out.println("a - b=" + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b =" + (a / b));
        System.out.println("a % b = " + (a % b));   // остаток после запятой
        System.out.println("a++ = " + (a++));       // инкремент значение на 1 увеличивает
        System.out.println("b-- = " + (a--));       // декримент значение на 1 уменьшает

        System.out.println("");

        //Onepaторы cpaвнения
        System.out.println("a == b=" + (a = b));       // а равно б
        System.out.println("a != b =" + (a != b));     // а не равно б
        System.out.println("a > b =" + (a > b));       // а больше б
        System.out.println("a < b=" + (a < b));        // а меньше б
        System.out.println("a >= b =" + (a >= b));     // а больше или равно б
        System.out.println("a <= b =" + (a < b));      // а меньше или равно б

        int c;
        c = a + b;
        System.out.println(c);

// весь код выполнялся последовательно но при условии выводилось (хорошая или плохая оценка)

        if (условия){
            действия 1 ();
            дейстаия 2 ();
    }  else {
            какое - то другое действие ();
        }

 int mark = 3;
        if (mark == 5) ;
        {
            System.out.println("Super");
        }
        if (mark == 4) {
            System.out.println("Horosho");
        } else {
            System.out.println("Ploho");
        }

        double temp = 29.0;
//холодно <= 0
//жарко > 30
//тепло > 0, но <= 30

        if (temp <= 0) {
            System.out.println("Холодно");
        } else if (temp > 30) {
            System.out.println("Жарко");
        } else {
            System.out.println("Тепло");
        }

        // цикл for wail to wail
        // вывести на экран числа от 1 до 100
            /*  int i = 1;
        System.out.println(i);

        i = i + 1;
         i += 1;   все одно и тоже! Что бы по сто раз не писать используют цикл фор
         i++;


        for (int u = 1; u < 100; u++) {
            System.out.println(u);
        }

 do while  цикл выполняет код а потом проверяет условия и пока - истина
 цикл повторяется
 цикл ду гарантирует как мин однократное выполнение действий

        int s = 1;
        do {
            System.out.println(s);
            s++;
        }
        while (s < 100);

// while

        int i = 1;
        while (i < 100) {
            if (i == 10)
                break;
            System.out.println(i);
            i++;
        }

*/
        /*
        int n = 5; // Высота елочки

        for (int i = 1; i <= n; i++) { // Каждый уровень елочки
            for (int j = i; j < n; j++) { // Печатаем пробелы
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) { // Печатаем звездочки
                System.out.print("*");
            }
            System.out.println(); // Переход на следующую строку
        }
         */
        /*
        int number = 20;
        switch (number) {
            case 1:
                System.out.println("1");
                break;
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            default:
                System.out.println(" Неверное значение");
        }
         */
        // примитивынй калькулятор

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");

        double number1 = scanner.nextDouble(); // Используем nextDouble() для ввода вещественного числа
        System.out.println("Введите второе число");
        double number2 = scanner.nextDouble(); // Используем nextDouble() для ввода вещественного числа

        System.out.println("Выберите действие:\n 1. +\n 2. -\n 3. *\n 4. /");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Результат: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Результат: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Результат: " + (number1 * number2));
                break;
            case 4:
                if (number2 != 0) {
                    System.out.println("Результат: " + (number1 / number2));
                } else {
                    System.out.println("Ошибка: деление на ноль невозможно.");
                }
                break;
            default:
                System.out.println("Неверная операция!");
        }
    }
}
