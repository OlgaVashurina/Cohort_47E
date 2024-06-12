package lesson_20HW;

/*
Task 2
Создайте иерархию классов для разных типов транспортных средств: Vehicle (родительский класс), Car, Bicycle и Motorcycle (дочерние классы).
Родительский класс Vehicle должен иметь метод startEngine(), который не будет иметь реализации.
Дочерние классы Car, Bicycle и Motorcycle должны переопределить метод startEngine() для запуска соответствующего типа двигателя (если есть).
Создайте массив транспортных средств разных типов. Используйте полиморфизм для вызова метода startEngine() для каждого транспортного средства.
 */
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