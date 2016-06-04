package Homework4.Exercise2;


import java.util.Scanner;

public class ConvertTemperatures {
    static Scanner fahrenheit = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Введите температуру по шкале Фаренгейта: ");
        System.out.println("Ввода значений: ");
        double constC1 = 5;
        double constC2 = 9;
        double constC = constC1 / constC2;
        int constCF = 32;
        double tF = fahrenheit.nextDouble();
        double tC = constC * (tF - constCF);
        System.out.println("Температура по шкале Цельсия: " + tC);
    }
}
