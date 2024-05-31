package lesson_07;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int waterInBarrel = 0;

        while (waterInBarrel < 300) { // кандишн или предикат .... повторение цикла итерация
            // вес что внутри скобок это тело цикла  возвращаемся к ваил пока условие выдает тру мы крутимся
            // несем ведро с водой и выливаем в бочку
            waterInBarrel += 10; // вылили ведро в бочку
            System.out.println("Добавил ведро. В бочке тперь: " + waterInBarrel + "литров воды");

        }

        System.out.println("Бочка наполнена");

        // циклы часто используются когда нужно получить и распечатать числа (переменная 10 шт 0123456789
// циклы позволяют записать нам это короче
        int x = 0;   //  = 100
        while (x <= 10) {    // y> 0
            System.out.println(x);
            x++;
        }
        System.out.println("Текущее значение х: " + x);


        int y = 100;

        while (y > 0) {
            System.out.println(y--);
        }
        System.out.println("Y" + y);

        // вывести на экран все четные числа в диапозоне от 0 до 21.
        /*
        Нужна сама последовательность запустить перебор чисел от 0 до 21
        проверить является ли число четным
        2.1.если четное - распечатать
        2.2 если не четное не делать ничего переходим дальше
        3. увеличить счетчик цикла (перебираемое число)
         */

        int i = 0;
        while (i <= 21) {
            // проверка числа на четность
            if (i != 0 && i % 2 == 0) {
                // является четным печатаем
                System.out.println(i + " ; ");
            }
            i++;
        }

        System.out.println();

        String hello = "Hello Java";

// распечатать каждый символ из строки hello в отедльную строку,
// перебрать по символьно строку и каждый симовл систем аут принт элэн
        // вес буквы пронумерованы и они начинаются с 0 и
        // символ последней буквы  - перебрать все доступные символы по индексу,
        // взять текущий символ и вывести на экран символ и его десятичный код
        // можем перебрать цикл котоорый будет перебирать числа от 0 до -1

        i = 0; // 0.1.2.3.4.5.6.7
        while (i <= hello.length() - 1) { // предварительно проверяются условия
            char ch = hello.charAt(i);
            System.out.println(ch + " | " + (int) ch);

            i++;
        }


        // цикл с пост условием do-while
        // сначала выполняется тело цикла - без проверок (как мин 1 раз)
        // потом проверяется условие. если тру - еще раз выполняется тело цикла и потом проверка

        int a = 0;
        do {
            System.out.println("Внутри тела цикла do-while" + a);
            a++;
        } while ((a < 2));

        Scanner scanner = new Scanner(System.in);

        int number;
        System.out.println(" Cделайте выбор: введите число 1 или 2");
        number = scanner.nextInt();
        scanner.nextLine();

        while (number != 2 && number != 1) {
            System.out.println("Введите число 1 или 2");
            number = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println(" Cделайте выбор: введите число 1 или 2");


        int counter = 0;

        do  {
            System.out.println(" Cделайте выбор: введите число 1 или 2");
            number = scanner.nextInt();
            scanner.nextLine();
            counter++;
        } while (number != 2 && number != 1 && counter < 3); // если не равна двойке и не равнa 1 тоо кол-во попыток стало. Если будет равно 4 то выпадем



        System.out.println("Вы ввели число с " + counter + "попытки");
    }
}