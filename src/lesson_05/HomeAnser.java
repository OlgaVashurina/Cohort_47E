package lesson_05;

import java.util.Scanner;

public class HomeAnser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя");
        String name = scanner.nextLine();

        System.out.println("Колличество букв в имени" + name.length());

        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);

        System.out.println((int) firstChar + " | " + (int) lastChar);
        System.out.println(0 + firstChar + " | " + (0 + lastChar));


        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";

        String space = " ";

        String concatStr = String.join(space, str1, str2, str3, str4, str5);

        System.out.println(concatStr + "; длина: " + concatStr.length());

        concatStr = str1.concat(space)
                .concat(str1).concat(space)
                .concat(str2).concat(space)
                .concat(str3).concat(space)
                .concat(str4);
        System.out.println(concatStr + "; длина: " + concatStr.length());


        // 2/2

        String result = concatStr.replace("powerful", "super");
        System.out.println(result);

        boolean inContain = result.contains("age");
        System.out.println("Содержит ли строка подстроку 'age'?: " + inContain);

/// 2/2

        int index = result.indexOf("age");
        System.out.println(index);
        boolean isContain = index != -1; // >= 0
        System.out.println("Подстрока содержится в строке: " + inContain);

        /////

 /*

Мне нужно как то вычислить средние символы, я могу взять длину строки и понять сколько символов, мне надо вычислить индексы 2 символов
нужно найти формулу, длина строки 6 на пополам будет 3
string
012345
получается длина строки 8 делю пополам 4 - отнять мину 1 получаю прям середину.


  */

        String string = "string";
        System.out.println("Введите слово");
        string = scanner.nextLine();

        int index1 = string.length() / 2 - 1;

        System.out.println("" + string.charAt(index1) + string.charAt(index1 + 1));


        // task 4

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите целое число с клавиатуры: " + scanner1);

        int number1 = scanner1.nextInt();
        scanner.nextLine();
        boolean evenValue = number1 % 2 == 0;
        boolean multipleOf = number1 % 3 == 0;
        boolean evenValueAndmultipleOf = evenValue && multipleOf;

        System.out.println("Число: " + number1 + " четное: " + evenValue + "; кратно 3: " + multipleOf + "; четное и кратное 3: " + evenValueAndmultipleOf);


    }
}
