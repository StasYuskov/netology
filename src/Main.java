import netology.hometask3.BimIndexCalcService;
import netology.hometask3.CreditCalculator;
import netology.hometasks2.BonusCalc;
import netology.hometasks2.BonusMileServiceCalc;

public class Main {
    public static void main (String[] args) {
        int miles1 = BonusMileServiceCalc.bonusMile(1500, 20);
        int miles2 = BonusMileServiceCalc.bonusMile(10000, 25);
        System.out.println(miles1 + " " + miles2);

        BonusCalc.calculateBonus(135, 560, 15);
        BonusCalc.calculateBonus(120, 1450, 25);

        BimIndexCalcService bimIndexCalcService = new BimIndexCalcService();
        double skinnyBim = bimIndexCalcService.BimIndexCalc(64.2, 182.5);
        System.out.println(skinnyBim);

        CreditCalculator creditCalculator1 = new CreditCalculator(9.99);
        System.out.println(creditCalculator1.calculatePayment(1000000, 12) + " " + creditCalculator1.getInterestRate());

        CreditCalculator creditCalculator2 = new CreditCalculator(9.99);
        System.out.println(creditCalculator2.calculatePayment(1000000, 24) + " " + creditCalculator2.getInterestRate());

        CreditCalculator creditCalculator3 = new CreditCalculator(9.99);
        System.out.println(creditCalculator3.calculatePayment(1000000, 36) + " " + creditCalculator3.getInterestRate());
    }
}
