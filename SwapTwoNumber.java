package BCP7;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void swapTwoNo(int num1, int num2) {
        int num3;
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("After Swap\nNum1 : "+num1+"\nNum2 : "+num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Before Swap");
        System.out.print("Num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Num2 : ");
        int num2 = sc.nextInt();
        swapTwoNo(num1, num2);
    }
}
