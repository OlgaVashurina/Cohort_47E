package lesson_20;

public class CastingExample {
    public static void main(String[] args) {

        Animal animal = new Hamster(); // здесь тип Hamster автоматически преобразуется к типу Animal


        animal.voice();

        Animal animal1 = new Dog();//Восходящее преобразования
        animal1.voice();

        Animal animal2 = new Cat();
        animal2.voice();

        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal1;
        animals[2] = animal2;

        Cat catLink = (Cat) animal2; // нисходящее явное преобразование

        catLink.voice();
        catLink.eat();

        System.out.println("\n==============================\n");

        for (int i = 0; i < animals.length; i++) {

            if (animals[i] instanceof Cat) {   // проверяем тип обьекта
                System.out.println(i + "-я ссылкуа в массива может быть downcassting к Cat (приведена)");
                Cat teamCat = (Cat) animals[i];
                teamCat.eat();

            }
            if (animals[i] instanceof Hamster) {
                System.out.println("Может быть кастирован к хомяку " + i);
                Hamster hamster = (Hamster) animals[i];
                hamster.voice("Перегруженный voice от хомяка");
            }

            System.out.println("sout" + animals[i]);
            animals[i].voice();

        }
        sayHello(new Cat());
        sayHello(new Hamster());

        Object obj = new Dog();
        System.out.println("\n=============================\n");
        Animal animalSuper = new SuperCat();

        if (animalSuper instanceof Cat) {
            Cat cat = (Cat) animalSuper;
            cat.eat();
        }

        if (animalSuper instanceof SuperCat) {
            SuperCat superCat = (SuperCat) animalSuper;
            superCat.eat();
            superCat.superDance();
        }
    }

    public static void sayHello(Animal animal) {
        animal.voice();
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.eat();
        }
    }
}