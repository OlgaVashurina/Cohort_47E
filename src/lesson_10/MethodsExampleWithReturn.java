package lesson_10;

public class MethodsExampleWithReturn {
    public static void main(String[] args) {
        int sum = 10 + 5;
        int sum1 = calculateSum(10, 15);
        System.out.println("sum1: " + sum1);

        sum = calculateSum(5, 5) + calculateSum(10, 20);
        System.out.println(sum);

        System.out.println(powTwo(-4));
        double pow = powTwo(-6);
        System.out.println(pow);

        int square = squareNumber(-2);
        System.out.println(square);

        double sq1 = squareNumber(1.5);
        System.out.println(sq1);

        int[] ints = {-1, 43, 0, 10, 3443, -100, 100, 555, 44};

        int minIndex = minIndexArray(ints);

        if (minIndex != -1) {
            System.out.println("Минимальное значение: " + ints[minIndex]);
        } else {
            System.out.println("НЕ найден");
        }

        int minValue = minValueArray(ints);
        System.out.println("Минимальное значение в массиве: " + minValue);

        System.out.println(isNumberInArray(ints, 555));
        System.out.println(isNumberInArray(ints, 777));
        System.out.println(searchNumber(ints, 555));
        System.out.println(searchNumber(ints, 777));

        int index = searchNumber(ints, 555);
        System.out.println(index);
    }

    public static boolean isNumberInArray(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) return true;
        }
        return false;
    }

    public static int searchNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1; // если число не найдено
    }

    public static int minIndexArray(int[] ints) {
        if (ints == null || ints.length == 0) return -1;

        int minIndex = 0;
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] < ints[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int minValueArray(int[] ints) {
        if (ints == null || ints.length == 0) throw new IllegalArgumentException("Array is null or empty");

        int minValue = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] < minValue) {
                minValue = ints[i];
            }
        }
        return minValue;
    }

    public static double squareNumber(double number) {
        return number * number;
    }

    public static int calculateSum(int a, int b) {
        return a + b;    // для завершения работы метода
    }

    public static double powTwo(int x) {
        boolean isPositive = x >= 0;

        if (!isPositive) x *= -1;

        double result = 1;
        for (int i = 1; i <= x; i++) {
            result *= 2;
        }

        if (!isPositive) result = 1.0 / result;

        return result;
    }

    public static int squareNumber(int x) {
        return x * x;
    }
}
