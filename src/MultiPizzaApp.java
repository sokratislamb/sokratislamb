import java.util.Scanner;
public class MultiPizzaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MultiPizza2 multiPizza = new MultiPizza2();
        String userChoice;

        do {
            for (int i = 0; i < 5; i++) {
                double diameter = multiPizza.read_diameter_side();
                double price = multiPizza.read_price();

                double circleArea = multiPizza.calculate_circle_area(diameter);
                double squareArea = multiPizza.calculate_square_area(diameter);

                double rateCircle = multiPizza.calculate_rate(price, circleArea);
                double rateSquare = multiPizza.calculate_rate(price, squareArea);

                multiPizza.store_gain(i, Math.abs(rateSquare - rateCircle));
            }

            multiPizza.calc_largest();

            System.out.print("Do you want to repeat (Y/N)? ");
            userChoice = scanner.nextLine();
        } while (userChoice.equalsIgnoreCase("Y"));
    }
}
