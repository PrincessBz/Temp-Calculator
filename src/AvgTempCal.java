import java.util.Scanner;

public class AvgTempCal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int numDays = scanner.nextInt();

        if (numDays <= 0) {
            System.out.println("Please enter a valid number of days.");
            scanner.close();
            return;
        }

        double[] temp = new double[numDays];
        double totalTemp = 0;

        for (int i = 0; i < numDays; i++){
            System.out.print("Enter the temperature of day " + (i + 1) + ": " );
            temp[i] = scanner.nextDouble();
        }

        for (int i = 0; i < numDays; i++){
            totalTemp += temp[i];
        }

        double avg = totalTemp / numDays;

        int aboveAverage = 0;
        for (double t : temp ) {
            if ( t > avg) {
                aboveAverage++;
            }
        }

        System.out.println("The number of days is : " + temp.length);
        System.out.printf("Average temperature: %.2f%n", avg);
        System.out.println("Number of days above average: "  + aboveAverage);

        scanner.close();










    }
}
