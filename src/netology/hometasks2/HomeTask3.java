package netology.hometasks2;

import java.util.Scanner;

public class HomeTask3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int ticketPrice = sc.nextInt();
        int bonusMileRate = 20;

        int resultMile = ticketPrice / bonusMileRate;
        System.out.println(resultMile);

    }
}
