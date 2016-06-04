package Homework4.Exercise3;


import java.util.Scanner;

public class CalculatingDistance {
    static Scanner distance = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Введите координаты точек: ");
        System.out.println("х1: ");
        int x1 = distance.nextInt();
        System.out.println("х2: ");
        int x2 = distance.nextInt();
        System.out.println("y1: ");
        int y1 = distance.nextInt();
        System.out.println("y2: ");
        int y2 = distance.nextInt();
        double distance = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        System.out.println("Растояние между двумя точками," +
                " представленными координатами" +
                " в двумерном пространстве равно: " + distance);
    }
}
