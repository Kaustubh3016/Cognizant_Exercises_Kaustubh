import java.util.*;

public class Financial{

    public static double futureValue(double currentValue, double growthRate, int years) {

        if (years == 0)
            return currentValue;

        return futureValue(currentValue, growthRate, years - 1) * (1 + growthRate / 100);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Current Value: ");
        double currentValue = sc.nextDouble();

        System.out.print("Enter Annual Growth Rate (%): ");
        double growthRate = sc.nextDouble();

        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();

        double result = futureValue(currentValue, growthRate, years);

        System.out.printf("\nPredicted Future Value: %.2f\n", result);

        System.out.println("Time Complexity: O(n)");

        sc.close();
    }
}