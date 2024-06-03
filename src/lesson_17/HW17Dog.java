package lesson_17;
/*
Task 1.
1.Создать 5 объектов класса HW17Dog со случайным прыжком от 30 до 80
2.Создать массив "барьеров" на 7 значений. Заполнить массив случайными
значениями от 70 до 170.
3.Каждая из собак должна по очереди попробовать преодолеть каждый барьер из
массива барьеров.
4.Посчитать и вывести на экран сколько барьеров удалось преодолеть каждой собаке
 */
public class HW17Dog {

    private String name;
    private int jumpHeight;
    private int maxJump;

    private static final int INCREASE_PER_TRAINING = 10;
    private static final int MAX_JUMP_MULTIPLIER = 2;
    private static int totalJumps;

    public HW17Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJump = jumpHeight * MAX_JUMP_MULTIPLIER;
    }

    public void getBarrier(int barrier) {
        if (jumpHeight >= barrier) {
            jump();
            return;
        }
        if (maxJump >= barrier) {
            System.out.println(name + " тренит");
            while (jumpHeight < barrier) {
                train();
            }
            jump();
        } else {
            System.out.printf("Барьер высотой %d собака %s взять не может. Высота прыжка: %d%n", barrier, name, jumpHeight);
        }
    }

    public void train() {
        if (jumpHeight + INCREASE_PER_TRAINING > maxJump) {
            System.out.println("Запрещено тренировать");
        } else {
            jumpHeight += INCREASE_PER_TRAINING;
            System.out.println(name + " тренит. Высота прыжка: " + jumpHeight);
        }
    }

    public void jump() {
        System.out.println(name + " прыгнул");
        totalJumps++;
    }

    public static int getTotalJumps() {
        return totalJumps;
    }

    @Override
    public String toString() {
        return "{HW17Dog " + name + "; current jump: " + jumpHeight + "}";
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setName(String name) {
        this.name = name;
    }
}