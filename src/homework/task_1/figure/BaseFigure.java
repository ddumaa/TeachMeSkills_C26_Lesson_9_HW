package homework.task_1.figure;

public abstract sealed class  BaseFigure permits Circle, Rectangle, Triangle {
        public abstract double areaCalculation();
        public abstract double perimeterCalculation();
}

