package lesson_05;

import java.util.Scanner;

public class HomeWork05 {
    public static void main(String[] args) {

        // Task 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");

        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");
        System.out.println("Количество символов в имени: " + name.length());

        char ch1 = 'o';
        char ch2 = 'a';

        System.out.println("Код'" + ch1 + "': " + (int) ch1);
        System.out.println("Код'" + ch2 + "': " + (int) ch2);

        // Task 2

        String str1 = "Java";
        String str2 = " ";
        String str3 = "is";
        String str4 = " ";
        String str5 = "a";
        String str6 = " ";
        String str7 = "powerful";
        String str8 = " ";
        String str9 = "language";

        String concatStr = str1 + str2 + str3 + str4 + str5 + str6 + str7 + str8 + str9;
        System.out.println("concatStr: " + concatStr);

        concatStr = str1.concat(str2).concat(str3).concat(str4).concat(str5).concat(str6).concat(str7).concat(str8).concat(str9);
        System.out.println("concatStr: " + concatStr);


        // Task 2.2

        String phrase = "Java is a powerful programming language.";
        String replacingPhrase = phrase.replace("powerful", "super");

        System.out.println("Строка: " + replacingPhrase);

        boolean containsAge = replacingPhrase.contains("age");
        System.out.println("Содержит ли строка подстроку 'age'?: " + containsAge);

        //Task 4


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите целое число с клавиатуры: " + scanner1);

        int number1 = scanner1.nextInt();

        boolean evenValue = number1 % 2 == 0;
        boolean multipleOf = number1 % 3 == 0;
        boolean evenValueAndmultipleOf = evenValue && multipleOf;

        System.out.println("Число: " + number1 + " четное: " + evenValue + "; кратно 3: " + multipleOf + "; четное и кратное 3: " + evenValueAndmultipleOf);


        // Сейчас делаю - Task 3* (Опционально) если успею перезагружу ДЗ)
/*        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Введите строку чётной длины: " + scanner2);
        String input = scanner.nextLine(); // Мы читаем строку, которую ввел пользователь, и сохраняем её в переменную input.

        if (input.length() % 2 == 0) { //Эта строка проверяет, что длина введенной строки четная. input.length() возвращает длину строки, а input.length() % 2 == 0 проверяет, делится ли длина на 2 без остатка.
            int midIndex = input.length() / 2; // Мы находим индекс середины строки. input.length() / 2 делит длину строки на 2, чтобы найти середину.
            String middleCharacters = input.substring(midIndex - 1, midIndex + 1);
//Мы берем два средних символа строки. input.substring(midIndex - 1, midIndex + 1)
// берет подстроку от индекса midIndex - 1 до midIndex + 1 (не включая его).
*/

        }
    }
