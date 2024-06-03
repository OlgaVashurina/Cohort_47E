package lesson_14;

public class Cat {
    // характеристики кота
    // Это поля классов!! ниже
    String name;
    String color;
    int age;

    public Cat() {        // конструктор инициализирует

    }

    public Cat(String catName) {             // конструктор
        name = catName; // в джаве должен быть хотя бы 1 конструктор!!!

    }

    public Cat(String catName, String color) {
        name = catName;
        // ключевое слово this - используется внутри класса для ссылки на текущий обьект
        this.color = color;  // используется для разрешения конфликтов
    }

    public Cat(String name, String color, int age) {
     // ключевое слово this также может быть использовано для вызова других конструкторов этого класса
        // если будет стоять не в первой строчке будет гореть ошибка компиляцмм
        this(name, color); // вызывается конструктор принимающий 2 стринги
        // будет создан оьект пронизиализировнаы соответствующие поля - такие как опредлны в конструкторе

        this.age = age;


    }

    // кот умеет: ниже метод
    void sleep() {
        System.out.println(" я сплю ");
    }

    void run() {
        System.out.println(" я бегу ");
    }

    void sayMeow() {
        System.out.println("Meow");
    }

    void whoAmI() {
        System.out.println(" Я котик " + name + ", мой возраст: " + age + ", мой окрас: " + color);
    }



}
