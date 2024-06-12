package lesson_20;

public class HW_20_Person {
    private int speed;
    private int restTime;

    public HW_20_Person(int speed, int restTime) {
        this.speed = speed;
        this.restTime = restTime;
    }
/* Task 1
Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи
У человека есть метод бежать (run()). Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;
Также у наших спортсменов есть необходимость в отдыхе. Человек нужен отдых после пробежки 15 минут, любитель 10, профи 5
В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам */

    public static void main(String[] args) {
        HW_20_Person person = new HW_20_Person(10, 15);
        Amateur amateur = new Amateur();
        Professional professional = new Professional();

        person.run();
        amateur.run();
        professional.run();
    }

    public void run() {
        System.out.println("Обычный человек бежит со скоростью " + speed + " км/ч.");
        rest();
    }

    public void rest() {
        System.out.println("Человеку нужно " + restTime + " минут(ы) для отдыха.");
    }

    public int getSpeed() {
        return speed;
    }

    public int getRestTime() {
        return restTime;
    }
}

class Amateur extends HW_20_Person {
    public Amateur() {
        super(15, 10);
    }

    @Override
    public void run() {
        System.out.println("Любитель бежит со скоростью " + getSpeed() + " км/ч.");
        rest();
    }
}

class Professional extends HW_20_Person {
    public Professional() {
        super(25, 5);
    }

    @Override
    public void run() {
        System.out.println("Профи бежит со скоростью " + getSpeed() + " км/ч.");
        rest();
    }
}