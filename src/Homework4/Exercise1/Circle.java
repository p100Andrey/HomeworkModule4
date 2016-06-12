package Homework4.Exercise1;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = Math.PI * (Math.pow(radius, 2));
        return area;
    }
}
