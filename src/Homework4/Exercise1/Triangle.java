package Homework4.Exercise1;

import java.util.Scanner;

public class Triangle {
    static Scanner triangle = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Введите стороны треугольника: ");
        System.out.println("Сторона А: ");
        double sideA = triangle.nextDouble();
        System.out.println("Сторона B: ");
        double sideB = triangle.nextDouble();
        System.out.println("Сторона C: ");
        double sideC = triangle.nextDouble();
        int two = 2;
        double halfP = (sideA + sideB + sideC) / two;
        double areaTriangle = Math.sqrt(halfP * (halfP - sideA) *
                (halfP - sideB) * (halfP - sideC));
        System.out.println("Площадь прямоугольника равна: " + areaTriangle);
    }
}
