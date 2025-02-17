public class AverageMarkCalculator {
    public static void main(String[] args) {
        int mathsMark = 94;
        int physicsMark = 95;
        int chemistryMark = 96;
        
        int maxMarks = 100;
        
        int totalMarks = mathsMark + physicsMark + chemistryMark;
        double averagePercentage = (totalMarks / 3.0);
        System.out.println("Sam's average mark in PCM is " + averagePercentage);
    }
}
