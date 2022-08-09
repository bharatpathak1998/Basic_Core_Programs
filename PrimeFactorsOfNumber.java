package BCP5;

import java.util.Scanner;

public class PrimeFactorsOfNumber {
    public static void factors(int n) {
        for (int i=2; i*i<=n; i++) {
            while (n%i==0) {
                System.out.println(i);
                n=n/i;
            }
        }
        if (n > 2) {
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factors : ");
        int n = sc.nextInt();
        factors(n);
    }
}
