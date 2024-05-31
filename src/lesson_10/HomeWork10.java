package lesson_10;

public class HomeWork10 {
    public static void main(String[] args) {

        int[] origArray = {0, 1, 2, 3, 4, 5, 6};
        int[] newArray = copyOfArray(origArray, 3);
        printArray(newArray);


        String[] inputArray = {"One", "Two", "Three", "Four", "Five"};
        String[] resultArray = findMinMaxLengthStrings(inputArray);
        printArray(resultArray);


        int[] inputNumbers = {0, 13, -25, 11, 31, 55, 98, 11, 5};
        int[] primeArray = filterPrimeNumbers(inputNumbers);
        printArray(primeArray);


        int[] array1 = {100, 112, 256, 349, 770};
        int[] array2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;

        int kthElement = findKthElement(array1, array2, k);
        System.out.println("Искомое число: " + kthElement);
    }

/*Task 1 Написать свой метод copyOfArray, дублирующий функционал метода Arrays.copyOf()
на вход принимает массив целых чисел и число - длинну нового массива.
Метод должен создать и распечатать массив заданной в параметрах длинны.
В начало массива должны быть скопированы элементы из входящего массива:
{0, 1, 2, 3, 4 , 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода*/

    public static int[] copyOfArray(int[] source, int newLength) {
        int[] newArray = new int[newLength];
        for (int i = 0; i < newLength && i < source.length; i++) {
            newArray[i] = source[i];
        }
        return newArray;
    }

    public static void printArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

/* Task 2 Написать метод, принимающий на вход массив строк. Метод должен вернуть массив,
состоящий из самой короткой и самой длинной строки изначального массива.*/

    public static String[] findMinMaxLengthStrings(String[] strings) {
        if (strings == null || strings.length == 0) {
            return new String[]{};
        }

        String minLengthString = strings[0];    // минимальная длина строк
        String maxLengthString = strings[0];// максимальная длина строк

        for (int i = 1; i < strings.length; i++) {
            if (strings[i].length() < minLengthString.length()) {
                minLengthString = strings[i];
            }
            if (strings[i].length() > maxLengthString.length()) { // если строка и длина больше чем то что хранится в строк переписываем

                maxLengthString = strings[i];
            }
        }
        return new String[]{minLengthString, maxLengthString};
    }

    public static void printArray(String[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }


/*Task 3 Написать метод, принимающий на вход массив целых чисел.
Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве
вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5} */

    public static int[] filterPrimeNumbers(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (isPrime(number)) {
                count++;  // если метод вернет число то пусть дальше ищет
            }
        }

        int[] primes = new int[count];
        int index = 0;
        for (int number : numbers) {
            if (isPrime(number)) {         //Для каждого числа в массиве вызывается метод isPrime, который проверяет, является ли текущее число простым.
                primes[index++] = number; // Если число является простым, оно добавляется в массив primes на позицию, указанную переменной index.
            }
        }
        return primes;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
/*Task 4 со звездочкой** опционально
Дано: Два отсортированных массива целых чисел.
Вам нужно найти элемент, который будет находиться на k-й позиции в объединенном отсортированном массиве.
Массив 1 - {100, 112, 256, 349, 770}
Массив 2 - {72, 86, 113, 119, 265, 445, 892}
k = 7 Вывод : 256 Можно такой вывод:72, 86, 100, 112, 113, 119, 256
Искомое число: 256
Объединенный отсортированный массив был бы такой (выводить, формировать его не обязательно) -
[72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892]
7-й элемент (по счету) этого массива хранит значение 256. */

    public static int findKthElement(int[] array1, int[] array2, int k) {
        int[] mergedArray = new int[array1.length + array2.length];
        int i = 0, j = 0, m = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                mergedArray[m++] = array1[i++];
            } else {
                mergedArray[m++] = array2[j++];
            }
        }

        while (i < array1.length) {
            mergedArray[m++] = array1[i++];
        }

        while (j < array2.length) {
            mergedArray[m++] = array2[j++];
        }

        return mergedArray[k - 1];
    }
}
