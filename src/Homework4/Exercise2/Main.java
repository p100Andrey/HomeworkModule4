package Homework4.Exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение температуры в цельсиях: ");
        double celsius = scanner.nextDouble();

        System.out.println("Введите значение температуры в фаренгейтах: ");
        double fahrenheit = scanner.nextDouble();

        double celsiusResult = ConvertTemperatures.fahrenheitToCelsius(fahrenheit);
        double fahrenheitResult = ConvertTemperatures.celsiusToFahrenheit(celsius);
        System.out.println(celsius + "C = " + fahrenheitResult + "F");
        System.out.println(fahrenheit + "F = " + celsiusResult + "C");
    }
}
