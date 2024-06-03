package lesson_14;

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    void eat() {
        System.out.println("Я кушаю!");
        weight++;   // вес уменьшается на 1
    }

    void run() {
        while (weight < 5) {
            System.out.println("Сорян я голодный.");
            System.out.println(" Надо поесть" + weight);
            eat();  // использовать цикл пока не будет меньше 5 (пока вес меньше 5 кг отпралять ее кушать
        }

        System.out.println("Я бегу!");
        weight -= 2;                  // бегает уменьшается вес
    }

    void printInfo() {
        System.out.println("I am dog " + this.name + ", my weight: " + weight);
    }
}
