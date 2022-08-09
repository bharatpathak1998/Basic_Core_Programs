package BCP3;

import java.util.Scanner;

public class PowerOfTwo {

    public static void powerOfTwo(int n) {
        int num = 2;
        for (int i = 1; i < n; i++) {
            num *= 2;
        }
        System.out.println("2^"+n+" = "+num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for power of 2 : ");
        int n = sc.nextInt();
        powerOfTwo(n);
    }
}
