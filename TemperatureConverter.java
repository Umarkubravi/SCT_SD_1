import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");

        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        double result;

        switch(choice) {

            case 1:
                result = (temp * 9/5) + 32;
                System.out.println("Result: " + result + " °F");
                break;

            case 2:
                result = (temp - 32) * 5/9;
                System.out.println("Result: " + result + " °C");
                break;

            case 3:
                result = temp + 273.15;
                System.out.println("Result: " + result + " K");
                break;

            default:
                System.out.println("Invalid option");
        }

        sc.close();
    }
}