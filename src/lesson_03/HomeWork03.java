package lesson_03;

public class HomeWork03 {
    private static Object Task;

    public static void main(String[] args) {

        //Task 1
        String perName;
        int perOld;
        int perLt;

        perName = "Ольга";
        perOld = 37;
        perLt = 2;

        System.out.println("Имя: " + perName);
        System.out.println("Возраст: " + perOld);
        System.out.println("Task 1 Цена литра молока: " + perLt + " euro");

        // Task 2

        int var1 = 0;
        int var2 = 1;
        int var3 = 2;
        int var4 = 3;

        int result = (0 + 1 + 2 + 3) / 4;
        System.out.println("Результат деления: " + result);

        int result1 = ((0 + 1 + 2 + 3) % 4);
        System.out.println("Task 2 Остаток от деления: " + result1);

        //Task 3
        int preisA = 1000;
        int preisB = 500;

        int sum = preisA + preisB;

        double discont = sum * 0.10;
        double resultAB = sum - discont;
        double resultABD = sum * 0.10;

        System.out.println("Цена при покупке вместе: " + resultAB);
        System.out.println("Task 3 Цена скидки в euro: " + resultABD);

        //Task 3

        int day1 = 21;
        int day2 = 27;
        int day3 = 25;
        int day4 = 22;
        int day5 = 23;
        int day6 = 23;
        int day7 = 25;

        int resultWesser = (day1 + day2 + day3 + day4 + day5 + day6 + day7) / 7;

        System.out.println("Task 3 Средняя погода за неделю: " + resultWesser);

        //Task 4. Теоретический
        // Какие числа могут получаться в качестве остатка
        // от деления какого-либо целого числа на 2? На 3?
        // При деление могут получатся целые числа и числа со значением после запятой.
        // числительные (все числа после запятой откидываются, остаются в остатке)
        // и с плавательной точкой (все цифры после запятой фиксируются.)


    }
}
