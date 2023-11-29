package homework.task_1;

import homework.task_1.figure.BaseFigure;
import homework.task_1.figure.Circle;
import homework.task_1.figure.Rectangle;
import homework.task_1.figure.Triangle;

public class Runner {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(7, 3, 12);
        Triangle triangle2 = new Triangle(15, 9,24);
        Rectangle rectangle1 = new Rectangle(24,14);
        Circle circle1 = new Circle(12);
        Circle circle2 = new Circle(22);

        BaseFigure[] baseFigures = new BaseFigure[5];
        baseFigures[0] = triangle1;
        baseFigures[1] = triangle2;
        baseFigures[2] = rectangle1;
        baseFigures[3] = circle1;
        baseFigures[4] = circle2;

        double sumAllPerimeter = 0;
        for (BaseFigure figure : baseFigures) {
            sumAllPerimeter += figure.perimeterCalculation();
            System.out.println("Area " + figure.areaCalculation() + " Perimeter " + figure.perimeterCalculation());
        }
        System.out.println("Sum of the perimeters of all figures: " + sumAllPerimeter);
    }
}
