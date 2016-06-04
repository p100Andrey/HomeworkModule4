package Homework4.Exercise1;

import java.util.Scanner;

public class Circle {
    static Scanner circle = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Введите радиус: ");
        double radius = circle.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("Площадь круга равна: " + area);
    }
}
