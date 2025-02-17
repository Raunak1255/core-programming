import java.util.*;

public class TotalPriceCalculator {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        // here taking the unit price and quantity from user
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter the quantity to be bought: ");
        int quantity = sc.nextInt();

        // Here I am calculating the total price
        double totalPrice = unitPrice * quantity;

        // Now display the total purchase price as output
        System.out.println("The total purchase price is INR " + totalPrice 
                            + " if the quantity " + quantity 
                            + " and unit price is INR " + unitPrice);
    }
}
