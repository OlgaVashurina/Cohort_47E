package lesson_13;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]) {
        // 1. посчитать зп по часам - запросить у пользователя?
        System.out.println("Cколько часов проработал сотрудник? Enter the number of hours the employee worked ?");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();   // всегде слева от равно указывают название переменной

        // 2. Хотим получить почасовую оплату
        System.out.println(" Введите сумму заработной платы по часам. Enter the employee's pay rate ");
        double rate = scanner.nextDouble();
        scanner.close();
        // 3. умножить кол во часов оплаты? ( 8 умножить на строку 12). Но ее нужно сохранить перед этим В переменную, ячейку памяти
        double grossPay = hours * rate;
        // 4. теперь отобразить результат
        System.out.println("The employee's gross pay is $ "+ grossPay);








    }

}
