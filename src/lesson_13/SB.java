package lesson_13;

import java.util.Arrays;
import java.util.Scanner;

public class SB {
    public static void main(String[] args) {

        String string = "Hello" + " from " + "Java"; // если мы в цикле собираем строку, у нас будет катастрофически затратна память.
        // В Java есть класс StringBuilder. Используется для конкатенации строк
        System.out.println("Hello, from Java: " + string);

        StringBuffer stringBuffer = new StringBuffer();

        // метод для добавления содержимого, прилепить в конец, справа
        stringBuffer.append("Hello");
        stringBuffer.append(" ").append("Java");

        // получить строковое содержимое
        String string1 = stringBuffer.toString();
        System.out.println(stringBuffer.toString());

        // вставить в указанную позицию
        StringBuffer sb = new StringBuffer("Hello world");
        sb.insert(6, "Beautiful ");
        System.out.println(sb);

        // Замена подстроки (определяется индексами) на указанное значение
        StringBuilder sb1 = new StringBuilder("Hello World");
        sb1.replace(5, 11, " Java");
        System.out.println(sb1);

        // получить символ по индексу
        char ch = sb1.charAt(3);
        System.out.println(ch);

        // получить подстроку
        String substring = sb1.substring(3);
        System.out.println("substring: " + substring);

        substring = sb1.substring(3, 9);
        System.out.println("substring: " + substring);

        // изменение длины - заполняется символами с кодами 0
        StringBuilder sb5 = new StringBuilder("Hello");
        sb5.setLength(10);
        System.out.println(sb5);
        System.out.println((int) sb5.charAt(8)); // Выводим ASCII код символа на позиции 8
        sb5.setLength(3);
        System.out.println(sb5);

        // Вставляем недостающий метод для аббревиатуры
        String test = "Hello Java";
        String[] strings = test.split(" ");
        System.out.println(Arrays.toString(strings));

/*
написать прогу запрашивающую строку состоящую из нескольких слов разделенных пробелами
Прога выводит аббривеатуру этой фразы (состоящей из первых букв каждого слова, записанных в верхнем регистре
Вход: united nations -> UN
Java virtual machine -> JVM
 */

        Scanner scanner = new Scanner(System.in);         // если хотим с кем то пообщаться

        System.out.println("Введите строку, разделенных пробелами:");     // просим пользователя ввести текст
        String input = scanner.nextLine();

        String abbreviation = createAbbreviation(input);                        // принимаем строку из парсера
        System.out.println("-> " + abbreviation);
        scanner.close();
    }

    public static String createAbbreviation(String test) {
        String[] strings = test.split(" ");                               // получаем строку делим на пробелы
        StringBuilder abbreviation = new StringBuilder();                       // завели товарища
        for (String word : strings) {
            if (word.length() > 0) {
                abbreviation.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        return abbreviation.toString();
    }
}
