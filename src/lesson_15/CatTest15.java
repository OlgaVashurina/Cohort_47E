package lesson_15;

public class CatTest15 {
    public static void main(String[] args) {

        Cat15 cat = new Cat15(" Catty ", 8, 5);
        cat.sayMeow();

        // fаксессоры (гетторы и сеттеры)
        String catName = cat.getName();
        System.out.println();


        System.out.println("cat.getAge(): " + cat.getAge());
        System.out.println("cat.getWeight(): " + cat.getWeight());
        cat.setAge(10);
        System.out.println("cat.getAge(): " + cat.getAge());

    }
}
