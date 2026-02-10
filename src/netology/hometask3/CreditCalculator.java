package netology.hometask3;

public class CreditCalculator {

    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public CreditCalculator(double interestRate) {
        this.interestRate = interestRate;
    }

    public int calculatePayment (int amount, int countMonth) {
        double payment = amount * interestRate/100/12 * Math.pow((1 + interestRate/100/12), countMonth) / (Math.pow((1 + interestRate/100/12
        ), countMonth) - 1);
        return (int)payment;
    }
}
