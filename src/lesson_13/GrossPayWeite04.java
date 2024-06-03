package lesson_13;

import java.util.Scanner;

/*
используем иф элс
 */
public class GrossPayWeite04 {
    public static void main(String[] args) {
        // инициализируем то что известно
        int quota = 10;
        // мы не знаем сколько было продаж
        System.out.println(" Сколько было продаж на этой неделе:  ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        // расчитать превысил ли обьем продаж квоту или был равен ей?

        if (sales >= quota)   //больше или равно квоты { блокируем нашу команду
            System.out.println("Супер ты выполнила свою норму ");
        else {
            int salesShort = quota - sales;
            System.out.println("Ты не выполнила свою норму " + salesShort);
        }


    }
}
