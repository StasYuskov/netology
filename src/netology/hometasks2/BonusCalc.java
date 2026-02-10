package netology.hometasks2;

import java.util.Scanner;

public class BonusCalc {
    public static void calculateBonus (int balance, int deposit, int bonusRate) {
        int result;

        if (deposit < 1000) {
            result = balance + deposit;
        } else {
            result = balance + deposit + (deposit / bonusRate);
        }
        System.out.println(result);
    }
}
