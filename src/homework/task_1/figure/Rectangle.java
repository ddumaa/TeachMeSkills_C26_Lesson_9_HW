package homework.task_1.figure;

public final class Rectangle extends BaseFigure {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double areaCalculation() {
        return length * length;
    }
    @Override
    public double perimeterCalculation() {
        return (length + width) * 2;
    }
}
