package lesson_20HW;

public class CarNew extends Vehicle {
    public CarNew() {
        super("CarNew", 0);
    }

    @Override
    public void startEngine() {
        System.out.println("Запуск двигателя автомобиля.");
    }
}