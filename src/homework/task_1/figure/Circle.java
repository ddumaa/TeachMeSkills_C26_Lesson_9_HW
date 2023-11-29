package homework.task_1.figure;

public final class Circle extends BaseFigure  {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double areaCalculation() {
        return 3.14 * (radius * radius);
    }
    @Override
    public double perimeterCalculation() {
        return 2 * 3.14 * radius;
    }
}
