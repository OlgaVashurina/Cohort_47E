package lesson_13;

public class lessenNext {
    public static void main(String[] args) {
// boole (true \ false)
        // целочисленные числа 1 3 4 5 2 -32947 и т.д
        // byte = 8 bit 2 в 8 степени = 256 (-128 до 127)
        // short - 16 бит 2 в 16 степени от -32678 до 32767
        //int - 32 бита 2 в степини 32 (- 2 мла 147 мил 438 до 2147 4836 47)
        // long - 64 бита 2 в 64
        //  2.5 или -2.6 :
        // double - 8 байт
        // float -4 байта -+4.9. * 10 до -+1.8 *10 в степени 308
        // char - 16 бит  и хранит символы а $

// gпеременная - область памяти храняшая область определенного вида
        //   тип данных_ имя ппеременной ;
        // 7
        // int x; // обьявили переменную
        //  x = 7; // инициализация - присвоили
/*
        int x = 7; // vможно сразу присвоить и обьявить
        x = 10;
        System.out.println(x);
        int a, b;
        a = 10;
        b = 7;
        final int LIMIT = 5;
        double PI = 3.5244555;

        System.out.println(PI);
 */


        //
        int a, b, c;
        a = 10;
        b = 7;

        c = b;
        b = a;
        a = c;
        System.out.println(a);
        System.out.println(b);

        b = a + b; //17
        a = b - a; //17 -10 =7
        b = b - a; // 17 -7 = 10;

        System.out.println(a);
        System.out.println(b);

    }
}
