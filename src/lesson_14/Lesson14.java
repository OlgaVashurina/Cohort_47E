package lesson_14;

public class Lesson14 {
    public static void main(String[] args) {
        Cat cat = new Cat(); // создание обьект класса Cat
/*
Нью кет - это вызов конструктора, конструктор классса - метод который вызывается при создании нового обьекта, осн. задача установить осн. свойство полей
Инициализоровать начальные значения полей!
При создании обьекта класса все его поля инициализируются значениями по умолчанию
Для числовых примитивных типов -0 \ 0.0
для булевого типа =- фолсе
для всех ссылочнх типов - null

 */

        cat.sayMeow(); // можем вызвать любой метод
        cat.run();
        cat.sleep();

        String name = cat.name; // в переменной будет храниться то что
        System.out.println("Имя: " + name);
        cat.whoAmI();

        Cat cat1 = new Cat("Max");  // была присвоена полю класса нейм. Была присвоено некое значение полю или состояние.
        System.out.println("name: " + cat1.name);
        cat1.whoAmI();

        Cat cat2 = new Cat("Diamant", "red");
        System.out.println("Имя второго кота: " + cat2.name);
        System.out.println("Цвет второго кота: " + cat2.color);

        Cat cat3 = new Cat("Том", "black", 2);
        cat3.whoAmI();

        Cat cat4 = cat3;
        cat4.whoAmI();
        // конструктор всега создает новый обьект, его поля инициализируются полями

    }
}
