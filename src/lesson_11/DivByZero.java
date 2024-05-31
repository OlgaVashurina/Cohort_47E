package lesson_11;

public class DivByZero {
    public static void main(String[] args) {

        int a = 10;
        // System.out.println(a / 0);

        double b = 10.0;
        System.out.println(b / 0); // infinity- бесконечность
        double inf = b / 0;
        double inf1 = b / 0;


        System.out.println(1 / inf); // нан значение не определено и результат не определен.
    }
}
