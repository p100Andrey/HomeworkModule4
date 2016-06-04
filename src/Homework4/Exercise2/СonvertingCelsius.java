package Homework4.Exercise2;

import java.util.Scanner;

public class СonvertingCelsius {
    static Scanner celsius = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Введите температуру по шкале Цельсия: ");
        System.out.println("Ввода значений: ");
        double constF1 = 9;
        double constF2 = 5;
        double concstF = constF1 / constF2;
        int constFC = 32;
        double tC = celsius.nextDouble();
        double tF = concstF * tC + constFC;
        System.out.println("Температура по шкале Фаренгейта: " + tF);
    }
}
