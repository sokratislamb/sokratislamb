import java.util.Scanner;

public class Pizza1 {
    // Calculate the area of a circle using its diameter
    private static double circularPizzaArea(double diameter) {
        double radius = diameter / 2.0;
        return Math.PI * radius * radius;
    }

    // Calculate the area of a square using its side length
    private static double squarePizzaArea(double side) {
        return side * side;
    }

    // Calculate price per unit of area for a pizza
    private static double pricePerUnitArea(double price, double area) {
        return price / area;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Give the diameter/side of the first Pizza: ");
        double firstDiameter = kb.nextDouble();
        System.out.print("Give the price of the first Pizza: ");
        double firstPrice = kb.nextDouble();

        double firstCircularArea = circularPizzaArea(firstDiameter);
        double firstSquareArea = squarePizzaArea(firstDiameter);
        double firstCircularPPU = pricePerUnitArea(firstPrice, firstCircularArea);
        double firstSquarePPU = pricePerUnitArea(firstPrice, firstSquareArea);

        double firstDifference = Math.abs(firstCircularPPU - firstSquarePPU);

        System.out.println("For the first Pizza, the gain per area unit is " + firstDifference);

        double secondDiameter, secondPrice;
        do {
            System.out.print("Give the diameter/side of the second Pizza: ");
            secondDiameter = kb.nextDouble();
            System.out.print("Give the price of the second Pizza: ");
            secondPrice = kb.nextDouble();

            if (Math.abs(secondDiameter - firstDiameter) < 0.001 && Math.abs(secondPrice - firstPrice) < 0.001) {
                System.out.println("Both diameter/side and price are same as the first pizza. Enter again.");
            }
        } while (Math.abs(secondDiameter - firstDiameter) < 0.001 && Math.abs(secondPrice - firstPrice) < 0.001);

        double secondCircularArea = circularPizzaArea(secondDiameter);
        double secondSquareArea = squarePizzaArea(secondDiameter);
        double secondCircularPPU = pricePerUnitArea(secondPrice, secondCircularArea);
        double secondSquarePPU = pricePerUnitArea(secondPrice, secondSquareArea);

        double secondDifference = Math.abs(secondCircularPPU - secondSquarePPU);

        System.out.println("For the second Pizza, the gain per area unit is " + secondDifference);

        if (firstDifference < secondDifference) {
            System.out.println("It is best buying the first Pizza on a Sunday");
        } else {
            System.out.println("It is best buying the second Pizza on a Sunday");
        }
    }
}

