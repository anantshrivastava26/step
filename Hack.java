import java.util.Scanner;

public class Hack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter height (in meters), weight (in kg) and steps taken:");

        double height = readHeight(in);
        int weight = readWeight(in);
        int steps = readSteps(in);

        int stepCalories = calculateStepCalories(steps);
        double bmi = calculateBMI(height, weight);
        String classification = classifyBMI(bmi);

        printResults(stepCalories, bmi, classification);

        in.close();
    }

    private static double readHeight(Scanner in) {
        return in.nextDouble();
    }

    private static int readWeight(Scanner in) {
        return in.nextInt();
    }

    private static int readSteps(Scanner in) {
        return in.nextInt();
    }

    private static int calculateStepCalories(int steps) {
        return (steps * 4) / 100;
    }

    private static double calculateBMI(double height, int weight) {
        if (height <= 0) return 0.0;
        return weight / (height * height);
    }

    private static String classifyBMI(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    private static void printResults(int stepCalories, double bmi, String classification) {
        System.out.println("Calories from Steps: " + stepCalories);
        System.out.printf("BMI: %.1f%n", bmi);
        System.out.println(classification);
    }
}
