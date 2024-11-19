public class CreditPaymentService {

    public double monthlyLoanPayment(double creditAmount, double creditTerm, double loanPercentage) {
        double monthlyInterestRate = loanPercentage / 100 / 12;
        double ratioAnnuity = monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, creditTerm) / (Math.pow(1 + monthlyInterestRate, creditTerm) - 1));
        return creditAmount * ratioAnnuity;
    }
}
