package lesson_08;

import java.util.Random;

public class Massiv_08 {
    public static void main(String[] args) {

        /*
        есть несколько способов лобьявления
         */

        // массив структура данных которые хранятся по одному имени и иимеют доступ по индексу (список книг. набору инструментов)
        int[] array; // обьявил массив [] - массив стоят возле типа (такой вариант более приоритетный) Создали переменную. Массив типа для интов
        String[] strings;
        int array1[]; // либо ставятся после [[  - альтернативный способ обьявления Не рекомендуется использовать

        array = new int[4]; // создали массив типа инт с 4 ячейками. Надо сразу сказать сколько ячеек будет в массиве. 0 0 0 0 - во всех 4 ячейках.
        // Хранится в хип- где хранятся обьекты. ВЫДЕЛЯЕТСЯ ПАМЯТЬ
        strings = new String[6]; // создали массив строк на 6 ячеек [null null null null null null null null]
        int[] array2 = new int[8]; // обьявили и инициализировали массив инт с 8 ячейками.
        // Все эти ячейки заполняются значениями по умолчанию. Будут заполнены значениями по умолчанию.
        // Могут быть разные. Для числовых типов данных будут 0 или с плавающей точкой 0.0в том числе и char.
        // для boulen это false
        // для всех ссылочных типов - null
        int[] numbers = new int[]{45, 56, -16, 0, 159, 1444};
        int[] ints = {10, -54, 32224, 555}; // явная иницализация массива на 4 ячейки/ и каждое конкретное значение можно положить в кауую то
        int value = numbers[0]; // взять из массива значение из ячейки 0 . взять значения из ячейки 0 масива numbers
        System.out.println("В 0 ячейке масива хранится число: " + value);
        System.out.println("В 0 ячейке numbers хранится число: " + numbers[3]);
        System.out.println("В 0 ячейке strings хранится число: " + strings[4]);

        System.out.println(numbers);
        System.out.println("В 0 ячейке strings хранится число: " + numbers.length);

        int j = 0;
        while (j < numbers.length) {
            System.out.print(numbers[j] + ", ");
            j++;
        }
        System.out.println(); // хочу что бы массив выдался красиво [1, 2, 3, ]


        int i = 0;
        String arrayToString = "[";

        // перебираем индекс

        while (i < numbers.length) {

            arrayToString += numbers[i] + ((i == numbers.length - 1) ? "]" : ", "); // приклей то что было намбр и приклей скобку или запятую с пробелом в зависимости от того что выдаст команда
            // или это или выше    arrayToString += numbers[i]; // приклеиваем в строку число
            /*          if (i != numbers.length - 1) { // если моя ячейка не последняя я приклеиваю к ней ячейку и пробел
                arrayToString += ", ";
            } else {
                arrayToString += "]";
            }
*/
            i++;
        }
        System.out.println(arrayToString);


        System.out.println("\n=========================================================");
        System.out.println(" Работам как с типом String, как с массивом");


        String str = "Hello";
        int i1 = 0;
        while (i1 < str.length()) {
            System.out.println(str.charAt(i1++) + ", ");

        }
        System.out.println();

        char[] chars = str.toCharArray(); // получаю массив символов из которых состояла строка
        System.out.println("chars.length: " + chars.length);


        int e = 0;
        System.out.print("[");
        while (e < chars.length) {
            System.out.print(chars[e] + ((e != chars.length - 1) ? ", " : "]"));
            e++;
        }
        System.out.println();

        int[] arr = {3, 5, 7, 9, 11};
        arr = new int[]{1, 2, 3, 4, 5};


        String[] words = {"String", "Java", "Hello", "Python"};
        System.out.println(words[1]);
        System.out.println(words.length);
        String python = words[3];
        System.out.println(python);
        System.out.println("\n=========================================================");


        // присвоение новых значений элементам массива

        words[3] = "JS";

        i = 0;
        while (i < words.length) {
            System.out.println(words[i++] + " ");
        }
        System.out.println();

        // создать массив
        Random random = new Random();

        int[] nums = new int[10];

        i = 0;
        System.out.print("[");
        while (i < nums.length) {
            nums[i] = random.nextInt(101);
            System.out.print(nums[i] + ((i != nums.length - 1) ? ", " : "]"));
            i++;
        }
        System.out.println();


// найти минимальное значение в массиве.
        /*
        я беру значение в 1 ячейке сверяю 10 и 50 свободен 25 меньше нет.
        0 приходит говоритя меньше и в мин записываю ноль
        максимум такой же подход
        понадобится счетк=чик
         */
        int с = 0;
        int min = nums[0];

        while (с < nums.length) {
            if (nums[с] < min) {
                min = nums[с];
            }
            с++;
        }
        System.out.println("Эминим значение в массиве" + с);
    }
}
