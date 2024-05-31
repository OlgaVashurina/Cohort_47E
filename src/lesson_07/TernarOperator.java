package lesson_07;

public class TernarOperator {
    public static void main(String[] args) {

        // пользовательь вводит число. если число больше или равно
        // 0 - прибавь к нему 20, иначе отнять от него 20

        int n = 10;

        if (n >= 0) {
            n += 20;

        } else {
            n -= 10;
        }
        n = (n >= 0) ? n + 20 : n - 10;

        // если будет возвращаться тру то n = n +20;
        // фолс n = n -10;

        int x = 0;

        String result;

        if (x>0) {
            result = "больше нуля";
        }else  {
            result = "меньше или нуль";
        }
        System.out.println(result);
        System.out.println((x>0) ? " Больше нуля " : " Меньше нуля");
/*
 торнадный оператор используется если есть только 2 тру и фолс
 */





    }


}
