package BCP8;

import java.util.Scanner;

public class EvenOrOdd {
    public static void evenOrOdd(int n) {
        if (n%2==0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        evenOrOdd(n);
    }
}
