package lesson_20HW;

public class Bicycle extends Vehicle {
    public Bicycle() {
        super("Bicycle", 0);
    }
    @Override
    public void startEngine() {
        System.out.println("Велосипед ждёт человека");
    }
}