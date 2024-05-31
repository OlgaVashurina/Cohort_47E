package lesson_05;

import java.util.Locale;

public class StringExem {
    public static void main(String[] args) {
        //  джава тип стринг дает встроенные инструменты для работы с данными метод!!
        // метод действие выполняемое строками
        String greeting = "hello, World!";
        System.out.println(greeting.length()); // выдает нам в длину колличество символов в строке
        // посчитал символы
        // toLowerCase

        String lowerCase = greeting.toLowerCase();
        System.out.println("lowerCase" + lowerCase); // строка не изменяема!
        System.out.println("greeting" + greeting); //  изменить не сможем

        //toUpperCase
        System.out.println(greeting.toUpperCase());
// конкатенация \ обьединение . склеивание

        String str1 = "One"; // хочу получить One hello
        String str2 = " ";
        String str3 = "hello";

        String concatStr = str1 + str2 + str3; // если между строками + знак склеивание строк
        System.out.println("concatStr: " + concatStr); // самое простое склеить строки

        // вариант 2
        concatStr = str1.concat(str3); // str1 + str3 возьми строку 1 и приклей строку 3, аналогичное  str1 + str3


        // копирование строки кнтр + д
        // перемещение строки контр алт и стрелка вверх или вниз
        // удалить строку с курсором контр и Y
        System.out.println("concatStr: " + concatStr); // самое простое склеить строки
// можем вызвать несколько методов
        concatStr = str1.concat(str2).concat(str3); // вначале 1 метод потом второй метод в конкате
        System.out.println("concatStr1: " + concatStr); //


        concatStr = str1.concat(str2).concat(str3).toUpperCase(); // вначале 1 метод потом второй метод в конкате
        System.out.println("concatStr2: " + concatStr); //

/*

Способ 3
 все строки будут склеины и между нихи будет вставлен делитель!in( delimiter" ",
        concatStr = String.join(" ", str1, str3, "Java", " ", "string"); // обьедини \склей все строки и между ними вставь разделитель
 либо пробел либо разделитель. можно знаки вопроса вставить


 конкатенация
 метод
 стринг джой ( первый метод разделитель и набор строк, все строки будут склеины

 */
        concatStr = String.join("_", str1, str3, "Java", " ", "string"); // обьедини \склей все строки и между ними вставь разделитель
        System.out.println("concatStr: " + concatStr);









    }
}
