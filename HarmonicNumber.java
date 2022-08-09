package BCP4;

import java.util.Scanner;

public class HarmonicNumber {
    public static double harmonic(int n) {
        double sum = 0;
        if (n > 0) {
            for (double i = 1; i <= n; i++) {
                sum += (1 / i);
            }
        } else {
            System.out.println("Invalid");
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to print harmonic number : ");
        int n = sc.nextInt();
        System.out.println("Harmonic Number : "+harmonic(n));
    }
}
