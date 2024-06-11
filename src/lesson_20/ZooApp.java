package lesson_20;

    public class ZooApp {
        public static void main(String[] args) {

            Animal animal = new Animal();
            animal.voice();

            Cat cat = new Cat();
            cat.eat();
            cat.voice();

            Hamster hamster = new Hamster();
            hamster.voice();
            hamster.voice("Hello!");

            Dog dog = new Dog();
            dog.voice();

            // Переопределение методов



        }
    }