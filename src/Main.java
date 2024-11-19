public class Main {
    public static void main(String[] args) {
        CreditPaymentService calculete = new CreditPaymentService();

        double creditAmount = 1_000_000; // сумма кредита
        double creditTerm = 12; // срок кредита в месяцах
        double loanPercentage = 9.99; // процент кредита


        System.out.println("\nПриложение для расчета ежемесячного платежа по кредиту");


        System.out.println("\nСумма кредита: 1 000 000 ");
        System.out.println("Срок кредита: 12 месяцев");
        System.out.println("Годовая процентная ставка: 9,99 %");

        double monthlyLoanPayment = calculete.monthlyLoanPayment(creditAmount, creditTerm, loanPercentage);
        long MonthlyPayment = (long) monthlyLoanPayment;
        System.out.println("Ежемесячный платёж по кредиту составляет: " + MonthlyPayment);

        System.out.println("\nСумма кредита: 1 000 000 ");
        System.out.println("Срок кредита: 24 месяцев");
        System.out.println("Годовая процентная ставка: 9,99 %");
        creditTerm = 24; // изменение срока кредита с 12 на 24
        monthlyLoanPayment = calculete.monthlyLoanPayment(creditAmount, creditTerm, loanPercentage);
        MonthlyPayment = (long) monthlyLoanPayment;
        System.out.println("Ежемесячный платёж по кредиту составляет: " + MonthlyPayment);

        System.out.println("\nСумма кредита: 1 000 000 ");
        System.out.println("Срок кредита: 36 месяцев");
        System.out.println("Годовая процентная ставка: 9,99 %");
        creditTerm = 36; // изменение срока кредита с 24 на 36
        monthlyLoanPayment = calculete.monthlyLoanPayment(creditAmount, creditTerm, loanPercentage);
        MonthlyPayment = (long) monthlyLoanPayment;
        System.out.println("Ежемесячный платёж по кредиту составляет: " + MonthlyPayment);
    }
}
