package lesson_09;

public class MethodsExample {
    public static void main(String[] args) {

        sayHello(); // метод необходимо вызвать! (2) вызвал его - код можно переиспользовать сколько угодно раз
        sayHello(); // метод необходимо вызвать! (2) вызвал его - код можно переиспользовать сколько угодно раз

        String string = "Java";
        saySomething("World"); // (4)
        saySomething(string);

        char ch = 'A'; // некая передаточная камера передать из 1 параметра в другой. Данные должны как то получены или являться результатом работы внутренних методов

        printDecimalCodeOfChar(ch);
        printDecimalCodeOfChar((char) 98);
        printDecimalCodeOfChar('c'); // через шлюз передаются значения

        /*
        надо разделить на части
        cutMeal (meal)
        bowlen() сам код будет проще восприниматься
         */
        int[] array = {1, 45, 67, 89, 443, 0, -24, 67};
        int[] array2 = {1, 2, 3, 4, 443, 0, -24, 67};

        printArray(array);
        printArray(array2);
        array2[3] = -1000;
        array2[2] = -1_000_000;

        printArray(array2); // исправлена опечатка в названии метода
        // перегрузка метода method overloading
        // написать метод который выводит на экран числа от 1 до x
        // написать метод который выводит на экран числа от A до B

        printNumbers(8);
        printNumbers(5, 11);
        printNumbers(10, "Hello");
        printNumbers("ChatGPT", 10);

        int x = 100;
        changeMe(x);
        System.out.println("x = " + x);


        int[] digits = {0, 1, 2, 3, 4};
        changeMe(digits);
        System.out.println("array[0] из метода: " + array[0]);


    } // Method area все методы пишутся тут внутри класса

    public static void changeMe(int[] array) {
        array[0] = 100;
        System.out.println("Array[0] из метода: " + array[0]);


    }


    public static void changeMe(int value) {
        value = value + 500;
        System.out.println("Value: " + value);
    }


    public static void printNumbers(int a, String str) {
        System.out.println(a + " УРА! " + str);
    }

    public static void printNumbers(String st, int b) {
        System.out.println(st + ", сек одиноко! поговори со мной");
        System.out.println(" Мне нужно хотя бы " + b + " истории");
    }

    public static void printNumbers(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printNumbers(int range) {
        for (int i = 0; i <= range; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] ints) { // исправлена опечатка в названии метода
        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + ((i < ints.length - 1) ? ", " : "]\n"));
        }
    }

    public static void printDecimalCodeOfChar(char ch1) { // этот чар и выше это разные чары (передай нам что нибудь и я смогу им пользоваться)
        System.out.println((int) ch1);
    }

    public static void sayHello() { // метод без параметров и возвращения
        // тело метода (1) обратился к методу
        System.out.println("Hello");
        System.out.println("End of method");
    }

    public static void saySomething(String str) {
        System.out.println("Hello: " + str); // (3) пишем список параметров что должен делать метод! это что-то будет помещено туда. Есть метод у него есть 1 параметр который хочет принять строку и эта строка будет называться str.
    }
} // end class
