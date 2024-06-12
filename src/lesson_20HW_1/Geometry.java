package lesson_20HW_1;

import java.util.ArrayList;
import java.util.List;
/*
Task 3 опционально \Фигуры и их площади
Создайте класс Фигура с методом рассчитатьПлощадь().
Реализуйте классы различных геометрических фигур (например, Круг, Квадрат, Треугольник).
В главном классе создайте список фигур и вычислите площадь каждой из них.
 */
public class Geometry {
    private List<Figure> figures;

    public Geometry() {
        figures = new ArrayList<>();
    }

    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    public void calculateAreas() {
        for (Figure figure : figures) {
            System.out.println(figure.getClass().getSimpleName() + " area: " + figure.calculateArea());
        }
    }

    public static void main(String[] args) {
        Geometry geometry = new Geometry();
        geometry.addFigure(new Circle(5));
        geometry.addFigure(new Square(4));
        geometry.addFigure(new Triangle(3, 6));

        geometry.calculateAreas();
    }
}
