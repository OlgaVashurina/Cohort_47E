package lesson_03;

public class HomeWork03_1 {

        public static void main(String[] args) {
            // Task 1
            // Переменная 1 - имя
            String myName = "Ольга";

            // Переменная 2 - сколько полных лет
            int myAge = 37;

            // Переменная 3 - стоимость 1 литра молока
            double milkPrice = 1.5;

            // Вывод значений переменных
            System.out.println("Имя: " + myName);
            System.out.println("Возраст: " + myAge);
            System.out.println("Цена молока: " + milkPrice);

            // Task 2
            int a = 0;
            int b = 1;
            int c = 2;
            int d = 3;

            int average = (a + b + c + d) / 4;
            System.out.println("Среднее арифметическое: " + average);

            // Вывод количества отброшенных дробных частей
            double preciseAverage = (a + b + c + d) / 4.0;
            System.out.println("Отброшенная дробная часть: " + (preciseAverage - average));

            // Task 3
            int priceA = 1000;
            int priceB = 500;
            double discount = 0.10;

            int totalPrice = priceA + priceB;
            double discountAmount = totalPrice * discount;
            double discountedPrice = totalPrice - discountAmount;

            System.out.println("Стоимость товаров A и B со скидкой: " + discountedPrice);
            System.out.println("Сумма скидки: " + discountAmount);

            // Task 4
            int[] temperatures = {15, 17, 20, 18, 16, 19, 21}; // Примерные данные температур за неделю
            int sum = 0;
            for (int temp : temperatures) {
                sum += temp;
            }
            double averageTemp = sum / (double) temperatures.length;

            System.out.println("Средняя температура за неделю: " + averageTemp);
        }
    }
