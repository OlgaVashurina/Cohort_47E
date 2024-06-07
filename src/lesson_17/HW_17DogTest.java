package lesson_17;

import lesson_15.MagicArray;

import java.util.Arrays;
import java.util.Random;

public class HW_17DogTest {
    /*
       Создать 5 объектов класса HW_17Dog со случайным прыжком от 30 до 80
       Создать массив "барьеров" на 7 значений. Заполнить массив случайными значениями от 70 до 170.
       Каждая из собак должна по очереди попробовать преодолеть каждый барьер из массива барьеров.
       Посчитать и вывести на экран сколько барьеров удалось преодолеть каждой собаке
        */
    public static void main(String[] args) {
        Random random = new Random();

        int[] barriers = new int[7];

        for (int i = 0; i < barriers.length; i++) {
            barriers[i] = random.nextInt(101) + 70;
        }

        System.out.println("Barriers: " + Arrays.toString(barriers));

        DogNew[] dogs = new DogNew[5];

        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new DogNew("Jumper_" + (i + 1), random.nextInt(51) + 30);
            System.out.println(dogs[i].toString());
        }


        /*
        Каждую собаку попросить пройти через последовательность барьеров. Посчитать сколько барьеров было взято
         */

        for (int i = 0; i < dogs.length; i++) {
            DogNew DogNew = dogs[i];

            int gotBarriers = 0;
            MagicArray magicArray = new MagicArray();

            for (int j = 0; j < barriers.length; j++) {
                if (DogNew.getBarrier(barriers[j])) {
                    gotBarriers++;
                    magicArray.add(barriers[j]); // записываю в список величины барьеров, которые взяла собака
                }
            }

            System.out.println(DogNew.getName() + " преодолела барьеров: " + gotBarriers + ". " + magicArray.toString());
        }

        System.out.println(testRandom());
    }

    public static double testRandom() {
        Random random = new Random();
        int count = 1_000_000;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += random.nextInt(101);
        }
        return (double) sum / count;
    }
}