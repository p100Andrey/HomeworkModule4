package Homework4.Exercise1;

import java.util.Scanner;

public class Rectangle {
    static Scanner rectangle = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Введите стороны прямоугольника: ");
        System.out.println("Сторона А: ");
        double sideA = rectangle.nextDouble();
        System.out.println("Сторона В: ");
        double sideB = rectangle.nextDouble();
        double areaRectangle = sideA * sideB;
        System.out.println("Площадь прямоугольника равна: " + areaRectangle);
    }
}
