import java.util.Scanner;

public class MultiPizza2 {
    private double[] gain = new double[5];

    public MultiPizza2() {
        for (int i = 0; i < 5; i++) {
            gain[i] = 0;
        }
    }

    public double read_diameter_side() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give the diameter/side of a Pizza: ");
        return scanner.nextDouble();
    }

    public double read_price() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give the price of this Pizza: ");
        return scanner.nextDouble();
    }

    public double calculate_circle_area(double d) {
        return Math.PI * (d / 2) * (d / 2);
    }

    public double calculate_square_area(double d) {
        return d * d;
    }

    public double calculate_rate(double price, double area) {
        return price / area;
    }

    public void calc_largest() {
        double largest = Double.MIN_VALUE;
        double secondLargest = Double.MIN_VALUE;
        int largestIndex = -1;
        int secondLargestIndex = -1;

        for (int i = 0; i < 5; i++) {
            if (gain[i] > largest) {
                secondLargest = largest;
                secondLargestIndex = largestIndex;
                largest = gain[i];
                largestIndex = i;
            } else if (gain[i] > secondLargest) {
                secondLargest = gain[i];
                secondLargestIndex = i;
            }
        }

        System.out.println("largest is " + largest + " at position " + (largestIndex + 1));
        System.out.println("second largest is " + secondLargest + " at position " + (secondLargestIndex + 1));
    }

    public void store_gain(int index, double value) {
        gain[index] = value;
    }}
