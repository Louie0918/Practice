package Practice;

public class loanCalcu {
    public static void main(String[] args) {
        // Variables
        double principal = 100000; // Loan amount in PHP
        double annualRate = 3.5; // Annual interest rate in percent
        int termMonths = 12; // Loan term in months

        // Calculate the interest using amortization formula
        double monthlyRate = annualRate / 12 / 100;

        // Amortization formula
        double monthlyPayment = principal * (monthlyRate * Math.pow(1 + monthlyRate, termMonths))
                / (Math.pow(1 + monthlyRate, termMonths) - 1);

        // Display the result
        System.out.printf("Monthly Installment: %.2f PHP\n", monthlyPayment);
    }
}
