package lesson_13;

import java.util.Scanner;

public class GrossPayWeite {
    /*
     калькулятор заработной платы
     */
    public static void main(String[] args) {
        // выясни что я знаю
        int salary = 1000;
        int bonus = 250;
        int quota = 10;
        // узнай то что еще не знаю
        System.out.println(" Сколько продаж совершил сотрудник на этой неделе?  ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        // проведи мои расчеты (логическо езначение либо ложное либо истинно)
        // если результат будет тру - то будет выполнено все что в скобках, если фолс то программа пойдет дальше
        if (sales > quota) {    // будет ли обьем продаж больше 10?
            salary = salary + bonus;   // возьми зп и прибавь бонус
        }

        // выведи мой результат
        System.out.println(" Зарплата сотруд ника $ " + salary);
    }
}
