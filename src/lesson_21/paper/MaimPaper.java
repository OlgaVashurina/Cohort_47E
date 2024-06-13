package lesson_21.paper;

import java.awt.print.Paper;

public class MainPaper {
    public static void main(String[] args) {

        Brush brush = new Brush();
        Pencil pencil = new Pencil();

        ColorPencil colorPencil = new ColorPencil();

        Paper paper = new Paper(); // используем ваш класс Paper из lesson_21.paper

        paper.drawFigure("Квадрат", brush);
        paper.drawFigure("Овал", new Marker());
        paper.drawFigure("Квадрат", new Eraser());

        paper.drawFigure("Круг", colorPencil);

        colorPencil.setColor("Yellow");
        paper.drawFigure("Солнце", colorPencil);
    }
}