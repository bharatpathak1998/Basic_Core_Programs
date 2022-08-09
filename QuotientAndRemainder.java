package BCP6;

import java.util.Scanner;

public class QuotientAndRemainder {

    public static void computeResult(int n1, int n2) {

        int quotient = n1 / n2;
        int remainder = n1 % n2;

        System.out.println("The Quotient is "+quotient);
        System.out.println("The Remainder is "+remainder);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int n2 = sc.nextInt();
        computeResult(n1, n2);
    }
}
