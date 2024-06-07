package lesson_17;

public class HW17DogTest {
    public static void main(String[] args) {

        HW17Dog HW17Dog1 = new HW17Dog("Улли", 30);
        HW17Dog HW17Dog2 = new HW17Dog("Шарик", 40);
        HW17Dog HW17Dog3 = new HW17Dog("Шуша", 50);
        HW17Dog HW17Dog4 = new HW17Dog("Оливер", 600);
        HW17Dog HW17Dog5 = new HW17Dog("Доби", 80);

        int[] barriers = {70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170};

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
