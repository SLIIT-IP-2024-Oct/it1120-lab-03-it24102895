import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter the price of 1kg rice: ");
        double priceKg = Scanner.nextDouble();

        System.out.print("Enter the number of Kg: ");
        double Kilograms = Scanner.nextDouble();

        double totalcost = priceKg * Kilograms;
        double discount = totalcost * 0.10;
        double AmountToPay = totalcost - discount;

        System.out.println("Full amount to pay after discount:  Rs" + AmountToPay);

    }
}