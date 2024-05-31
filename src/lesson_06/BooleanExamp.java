package lesson_06;

public class BooleanExamp {
    public static void main(String[] args) {
        /*
       лог Операции которые оперируют значениями. Позволяют проверять условия и проверять истинно или ложно
              Если дождь я возьму зонт если солнце то очки
         используются когда оба условия истина и тепло и не идет дождь
         */

        boolean and = true & true; // если оба условия истинны будет тру
        System.out.println("b1: " + and);

        and = (2 < 5) & (11 < 10);
        System.out.println("b1: " + and);
// логическое не меняет значение на противоположное
        // или or
        boolean or = true | false; // если хотя бы одно будет тру
        System.out.println("true | false" + or);
        System.out.println("true | true " + (true | false));
        System.out.println("false | false" + (true | false));


        // исключающее логическое по сути возвращает тру если операнды - разные
        //
        boolean xor = true ^ false;
        System.out.println("true ^ false -> " + xor);
        System.out.println("true ^ false -> " + (true ^ false));
        System.out.println("true ^ false -> " + (true ^ true));
        System.out.println("true ^ false -> " + (false ^ false));


        // &&  - логическое сокращение

        boolean and1 = true && true; // если оба условия истинны будет тру
        System.out.println("true && true -> " + (true && true));
        System.out.println("true && false -> " + (true && false));
        int a = 2;
        int b = 10;
        //             a = 2 - true --> надо считать правую часть и сокращеное и ее посчитает
        //             a = 0--> false        true   // правая часть не имеет значение не влияет на результат
        boolean greatThat = (a != 0) & (b / a > 3); // для этого у нас есть если а не равно 0
        System.out.println("greatThat: " + greatThat);

        // вес логическое отличие от обычного и и сокращенного. Логическое и опр. если есть условие (фолс) оно понимает что можно если левая фолс правая не перещитыватся


        // логическое сокращенное или принцип работы такой же если хоть 1 тру то результирующее тоже тру
        // та же логика
        boolean test = (a == 0) || (b / a > 3);
        System.out.println(test);
        // логическое и главнее ксора

        System.out.println(true ^ true & false);
        System.out.println(true ^ true & false); // тру ксор фолс - дает нам тру
        System.out.println(true);

        System.out.println(true ^ true && false); // тру ксор тру = выдает фолс


// то что сократиться справа было послдеднее
        // если поставить скобки то выражение будет первое
        System.out.println((true || true) ^ false);
        System.out.println(true || false ^ true & !true);
        System.out.println(true || false ^ true & false);
        System.out.println(true || false ^ false);
        System.out.println(true || true ^ false);
        System.out.println(true);



        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JaVa";
        String str4 = new String("Java");

        System.out.println(str1);
        System.out.println(str2);
// ссылочные типы в том числе стринг сравниваются ссылки

        System.out.println("str1 == str2 --> " + (str1 == str2));
        System.out.println("str1 == str3 --> " + (str1 == str3));
        System.out.println("str1 == str4 --> " + (str1 == str4));


        // ссылочные типы данных нужно сравнивать методом equals - если мы хотим сравнить их значения
// метод ecouals cравнивает 2 строки по значениям

        System.out.println("str1.equals(str2)" + str1.equals(str2));
        System.out.println("str1.equals(str4)" + str1.equals(str4));
        System.out.println("str1.equals(str3)" + str1.equals(str3));


        // условные операторы блок это составной оператор джава



    }
}
