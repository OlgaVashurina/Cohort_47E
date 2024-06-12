package lesson_20HW;

public class Fleet {
    public static void all() {
        Vehicle[] vehicles = {
                new CarNew(),
                new Bicycle(),
                new Motorcycle()
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }
    }

    public static void main(String[] args) {
        all();
    }
}