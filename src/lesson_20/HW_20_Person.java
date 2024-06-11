package lesson_20;

public class HW_20_Person {

/* Task 1
Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи
У человека есть метод бежать (run()). Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;
Также у наших спортсменов есть необходимость в отдыхе. Человек нужен отдых после пробежки 15 минут, любитель 10, профи 5
В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам */

    public static void main(String[] args) {
        HW_20_Person person = new HW_20_Person();
        Amateur amateur = new Amateur();
        Professional professional = new Professional();

        person.run();
        amateur.run();
        professional.run();
    }

    public void run() {
        System.out.println("Обычный человек бежит со скоростью 10 км/ч.");
        rest(15);
    }

    public void rest(int minutes) {
        System.out.println("Человеку нужно " + minutes + " минут(ы) для отдыха.");
    }
}

class Amateur extends HW_20_Person {
    @Override
    public void run() {
        System.out.println("Любитель бежит со скоростью 15 км/ч.");
        rest(10);
    }
}

class Professional extends HW_20_Person {
    @Override
    public void run() {
        System.out.println("Профи бежит со скоростью 25 км/ч.");
        rest(5);
    }
}


