public class ProfitLossCalculator {
    public static void main(String[] args) {
        double CP = 129;
        double SP = 191;
        double profit = SP - CP;
        double profitPercentage = (profit / CP) * 100;

        System.out.println("Profit = " + profit + " INR \n Profit Percentage = " + profitPercentage + "%");
    }
}
