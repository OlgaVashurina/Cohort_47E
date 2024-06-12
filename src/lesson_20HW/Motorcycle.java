package lesson_20HW;

public class Motorcycle extends Vehicle {
    public Motorcycle() {
        super("Motorcycle", 0);
    }

    @Override
    public void startEngine() {
        System.out.println("Запуск двигателя мотоцикла.");
    }
}