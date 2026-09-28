import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        int size = 0;

        Scanner scanner = new Scanner(System.in);

        // Get user input for temperatures array
        System.out.println();
        System.out.println("=".repeat(71));
        System.out.println(" ".repeat(21) + "CALCULATE AVERAGE TEMPERATURE");
        System.out.println("=".repeat(71));
        System.out.println();

        while (size <= 0) {
            System.out.print("Number of temperatures (must be greater than zero): ");
            size = scanner.nextInt();
        }

        double[] temperatures = new double[size];

        System.out.println();

        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Enter temperature " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        double averageTemp = calculateAverageTemp(temperatures);
        int aboveAverage = calculateAboveAverageTemp(temperatures, averageTemp);

        System.out.println();
        System.out.println("-".repeat(71));
        System.out.printf("Average Temperature: %.1f\n", averageTemp);
        System.out.printf("Temperatures Above Average: %d\n", aboveAverage);
        System.out.println("=".repeat(71));
        System.out.println();

        scanner.close();
    }

    // Method to calculate average temperature
    public static double calculateAverageTemp(double[] temperatures) {
        double sum = 0;

        for (double temp : temperatures) {
            sum += temp;
        }

        double averageTemp = sum / temperatures.length;

        return averageTemp;
    }

    // Method to calculate temperatures above average
    public static int calculateAboveAverageTemp(double[] temperatures, double averageTemp) {
        int aboveAverage = 0;

        for (double temp : temperatures) {
            if (temp > averageTemp) {
                aboveAverage++;
            }
        }

        return aboveAverage;
    }
}
