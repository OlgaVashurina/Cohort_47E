package lesson_11;

public class MainUtilsTest {
    public static void main(String[] args) {
        int[] ints = {25, 11, 53, 45, 56, 93, 46, 55, 3734, 857, 36};
        ArraysUtil.sortArray(ints);
        ArraysUtil.printArray(ints);
        System.out.println(ArraysUtil.linearSearch(ints, 77));
        System.out.println(ArraysUtil.linearSearch(ints, 100));

        int[] testInts = ArraysUtil.fillTestArrray(100);
        System.out.println(ArraysUtil.binarySearch(testInts, 1_000_000_000));
       ArraysUtil.sortArray(testInts);
        System.out.println("Sort done");

        System.out.println(ArraysUtil.binarySearch(ints, 100));
        System.out.println(ArraysUtil.binarySearch(testInts, 2000));
        System.out.println(ArraysUtil.linearSearch(testInts, 2000));

    }
}
