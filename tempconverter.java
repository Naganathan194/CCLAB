import java.util.*;
public class tempconverter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Program");
        System.out.println("Choose conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        
        int choice = scanner.nextInt();
        double temperature;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
                System.out.printf("Temperature in Fahrenheit: "+(temperature * 9/5) + 32);
                break;
                
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                System.out.printf("Temperature in Celsius: "+(temperature - 32) * 5/9);
                break;
                
            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
                break;
        }
    }
}
