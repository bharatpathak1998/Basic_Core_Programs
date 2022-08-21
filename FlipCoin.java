package BCP1;

import java.util.Scanner;

public class FlipCoin {
    public void flipCoin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many times do you want to flip coin : ");
        int flips = sc.nextInt();
        int head = 0;
        int tail = 0;

        for(int i=1; i<=flips; i++) {
            double random = Math.random();

            if (random < 0.5) {
                head++;
                System.out.println("Head : "+head);
            } else {
                tail++;
                System.out.println("Tail : "+tail);
            }
        }
        int percentOfHead = (head*100)/flips;
        System.out.println("Percentage Of Head : "+percentOfHead);
        int percentOfTail = (tail*100)/flips;
        System.out.println("Percentage Of Tail : "+percentOfTail);
    }
}
