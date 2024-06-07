package lesson_17;

/*
@date 06.06.2024
@authоr Sergey Bugaienko
*/


    // Этот файл можно оставить пустым или добавить необходимый код для HW_17Dog

    /*
    Написать класс Собака (HW_17Dog).

    Каждая Собака обязательно должна иметь имя и высоту прыжка ++

    Должна уметь прыгать и должна уметь тренироваться. +-

    За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров ++

    Максимальная высота прыжка, которую может натренировать собака, не может быть больше,
    чем двукратная высота первоначального прыжка.

    Также должен быть метод взять барьер. В параметрах метод принимает высоту барьера.
    Если собака в состоянии преодолеть этот барьер - прыгает.

    Если не в состоянии, нужно проверить помогут ли тренировки (будет ли данная собака в принципе в состоянии взять барьер).
    Если да -> идем тренироваться -> берет барьер

    Добавить в класс константу. Использовать эту константу в классе. ++

    Добавить в класс поле, в котором будет храниться количество прыжков, сделанных всеми объектами класса.
     */
    public class HW_17Dog {

        private String name;
        private int jumpHeight;
        private final int maxJump;

        private static final int INCREASE_PER_TRAINING = 10;
        private static final int MAX_JUMP_MULTIPLIER = 2;

        private static int totalJumpCounter;

        public HW_17Dog(String name, int jumpHeight) {
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
