import java.util.*;

public class DiscountFeeCalculator {
    public static void main(String[] args) {
        // here i create a Scanner object for user inputs
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the fee for the course (INR): ");
        double fee = scanner.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercent = scanner.nextDouble();

        double discount = (fee * discountPercent) / 100;

        // In this line I Cal the final fee after discount
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);

    }
}
