import java.util.Arrays;
import java.util.Scanner;

public class MultiPizza {
    public static void main(String[] args) {
        double[] gain = new double[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Give the diameter/side of Pizza no " + (i + 1) + ": ");
            double d = scanner.nextDouble();

            System.out.println("Give the price of Pizza no " + (i + 1) + ": ");
            double p = scanner.nextDouble();

            // Area if not purchased on Sunday (Circular pizza)
            double areaNonSunday = Math.PI * (d / 2) * (d / 2);
            // Area if purchased on Sunday (Square pizza)
            double areaSunday = d * d;

            // Price per unit area if not purchased on Sunday
            double pricePerAreaNonSunday = p / areaNonSunday;
            // Price per unit area if purchased on Sunday
            double pricePerAreaSunday = p / areaSunday;

            gain[i] = Math.abs(pricePerAreaSunday - pricePerAreaNonSunday);
            System.out.println(Arrays.toString(gain));
        }

        double maxGain = -1;
        int maxGainIndex = -1;

        for (int i = 0; i < gain.length; i++) {
            if (gain[i] > maxGain) {
                maxGain = gain[i];
                maxGainIndex = i;
            }
        }

        // Set the largest gain to a very small value to find the second largest gain
        double secondMaxGain = -1;
        int secondMaxGainIndex = -1;
        gain[maxGainIndex] = Double.MIN_VALUE;

        for (int i = 0; i < gain.length; i++) {
            if (gain[i] > secondMaxGain) {
                secondMaxGain = gain[i];
                secondMaxGainIndex = i;
            }
        }
         //Printing the maxgain and announcing the position it was found on the table.
        // I add "one" to avoid the "ugly" zero position chance.
        // By adding one, i get 1st,2nd,3rd,4th and 5th position that sound more natural and useful to the end user.

        System.out.println("Largest is " + maxGain + " at gain table position " + (maxGainIndex + 1));
        System.out.println("Second largest is " + secondMaxGain + " at gain table position " + (secondMaxGainIndex + 1));
    }
}


