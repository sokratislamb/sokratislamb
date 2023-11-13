import java.util.Scanner;
public class PizzaL {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("give the diameter/side of the first Pizza:");
        int d = s.nextInt();


        System.out.print("Give the price of the first Pizza:");
        double p = s.nextDouble();

        double r = d / 2;
        double emvado1 = Math.PI * (r *r);
        double emvado2 = d * d ;

        double logos1 = p/emvado1;
        double logos2 = p/emvado2;

        double abs = Math.abs(logos1-logos2);
    }
}
