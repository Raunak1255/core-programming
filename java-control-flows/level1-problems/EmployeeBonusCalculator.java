import java.util.*;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee's salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int yearsOfService = sc.nextInt();
        
        // Here i am checking if employee is eligible for a bonus
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus for employees with less than 5 years of service.");
        }
    }
}