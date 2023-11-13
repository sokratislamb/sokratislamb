import java.util.Scanner;

public class Pizza {

    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);

        // Get input for first pizza
        System.out.print("Give the diameter/side of the first Pizza: ");
        double d1 = kboard.nextDouble();
        System.out.print("Give the price of the first Pizza: ");
        double p1 = kboard.nextDouble();

        // Calculate area and price per product for the first pizza
        double AreaC1 = p1 / (Math.PI * (d1 / 2) * (d1 / 2));
        double AreaSq1 = p1 / (d1 * d1);
        double diff1 = Math.abs(AreaC1 - AreaSq1);

        System.out.println("For the first Pizza, the gain per area unit is =" + diff1);

        // Get input for second pizza
        double d2, p2;
        do {
            System.out.print("Give the diameter/side of the second Pizza: ");
            d2 = kboard.nextDouble();
            System.out.print("Give the price of the second Pizza: ");
            p2 = kboard.nextDouble();

            // Check if the details are similar to the first pizza and print an error message
            if (Math.abs(d2 - d1) < 0.01 || Math.abs(p2 - p1) < 0.01) {
                System.out.println("diameter/side and/or price of the second pizza is similar to the first pizza. Please enter again different values.");
            }

        } while (Math.abs(d2 - d1) < 0.01 || Math.abs(p2 - p1) < 0.01);

        // Calculate area and price per product for the second pizza
        double AreaC2 = p2 / (Math.PI * (d2 / 2) * (d2 / 2));
        double AreaSq2 = p2 / (d2 * d2);
        double diff2 = Math.abs(AreaC2 - AreaSq2);

        System.out.println("For the second Pizza, the gain per area unit is =" + diff2);


        // Decide which pizza is more profitable to buy
        if (diff1 > diff2) {
            System.out.println("It is best buying the first Pizza with diameter " + d1 + " on a Sunday");
        } else {
            System.out.println("It is best buying the second Pizza with diameter " + d2 + "  on a Sunday");
        }
    }
}

