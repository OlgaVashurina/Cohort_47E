package lesson_05;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {

        // хотим почитать данные с клавиатуры.  Когда стартует программа - есть поток вывода и ввода.
        //  Можем внедрить сканер (он сканирует все что угодно)и попросить его сканировать ввод
        // сканер настройся надо сканировать то что вводим

        Scanner scanner = new Scanner(System.in);

        // когда мы пишем программу нужны доп функции или иструменты - в джава они в библиотеках или пакетах
        // и in мы говорим что хотим использовать библиотеку (например попросили сканер) -
        // прога должна импортировтаь его из пакетов . сходи в гараж и принеси коробку
        // с инструментами.  Принеси сканер я буду его использовать
        // вначале надо задать вопрос
// СТРОКА

        System.out.println("Введите ваше имя: ");
// говорим - я хочу сказать что бы он сохранил то что ввел пользователь
        // пользователь что то введет, сохрани это
        String name = scanner.nextLine();
        System.out.println(" Привет, " + name + "!");
// сканер все считал и я могу его вывести Ольга
// Привет, Ольга! Будет все считано и выведено
        // можем считывать и строки и числа


        // а если мне нужно число с запятой??
        System.out.println("Сколько стоит кефир?");
        double price = scanner.nextDouble();
        scanner.nextLine(); // некс лайн захватит весь кусок после токена. и уберет его!!!!!!!!!!!!!!!!!
        System.out.println("кефир стоит: " + price); // все числа через точку.. может отображать из 1, 57 или 1.57 - локализация сканера

        // ЦЕЛОЕ ЧИСЛО:
        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();
        System.out.println("Ваш возраст: " + age);
// все читает и запрашивает дальше.  Все принял все сохрани
        // все считал и положил в инт

        // если возраст меньше 100 окей, если цифра вышла за периметр то стопарим.
        // напиши мне регулярное выражение для проверки возраста
// не на одну джуновую вакансию регулярки знать не надо


        // числа он считает токенами.
        // одно число пробел потом еще число. Он будет искать число до начала пробела,
        // хвост будет висеть и он будет пытаться ждать еще

        // у нас есть возможность сбрасывать сканер и это рекомендуемо
        // мы можем отбросить хвост и перенести сканер!!!
//Сколько стоит кефир?
//1,45 1000
//кефир стоит: 1.45
// от ночала строки до пробела  - токен 234 354 2124723
// при работе с консолью лучше обнулять и читать новое число!
   // формат чисел запомнить либо с 1.2 либо 1,2






    }
}
