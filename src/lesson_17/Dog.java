package lesson_17;

public class Dog {

    private String name;
    private int jumpHeight;
    private final int maxJump;

    private static final int INCREASE_PER_TRAINING = 10;
    private static final int MAX_JUMP_MULTIPLIER = 2;

    private static int totalJumpCounter;

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJump = jumpHeight * MAX_JUMP_MULTIPLIER;
    }

    public boolean getBarrier(int barrier) {
        if (jumpHeight >= barrier) {
            jump();
            return true;
        }

        if (maxJump >= barrier) {
            System.out.println(name + " тренируется");
            while (jumpHeight < barrier && jumpHeight + INCREASE_PER_TRAINING <= maxJump) {
                train();
            }
            if (jumpHeight >= barrier) {
                jump();
                return true;
            }
        }

        System.out.printf("Барьер высотой %d собака %s взять не может. Высота прыжка: %d%n", barrier, name, jumpHeight);
        return false;
    }

    public void train() {
        if (jumpHeight + INCREASE_PER_TRAINING <= maxJump) {
            jumpHeight += INCREASE_PER_TRAINING;
            System.out.println(name + " тренируется. Высота прыжка: " + jumpHeight);
        } else {
            System.out.println("Запрещено тренировать");
        }
    }

    public void jump() {
        totalJumpCounter++;
    }

    public static int getTotalJumps() {
        return totalJumpCounter;
    }

    @Override
    public String toString() {
        return "{HW_17Dog " + name + "; current jump: " + jumpHeight + "}";
    }

    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setName(String name) {
        this.name = name;
    }
}

