package lesson_17;

public class HW17DogTest {
    public static void main(String[] args) {

        HW17Dog HW17Dog1 = new HW17Dog("Улли", 70);
        HW17Dog HW17Dog2 = new HW17Dog("Шарик", 80);
        HW17Dog HW17Dog3 = new HW17Dog("Шуша", 90);
        HW17Dog HW17Dog4 = new HW17Dog("Оливер", 100);
        HW17Dog HW17Dog5 = new HW17Dog("Доби", 110);

        int[] barriers = {60, 70, 80, 90, 100, 110, 120};

        for (int barrier : barriers) {
            HW17Dog1.getBarrier(barrier);
            HW17Dog2.getBarrier(barrier);
            HW17Dog3.getBarrier(barrier);
            HW17Dog4.getBarrier(barrier);
            HW17Dog5.getBarrier(barrier);
        }

        System.out.println(HW17Dog1);
        System.out.println(HW17Dog2);
        System.out.println(HW17Dog3);
        System.out.println(HW17Dog4);
        System.out.println(HW17Dog5);

        System.out.println("Количество прыжков: " + HW17Dog.getTotalJumps());
    }
}
