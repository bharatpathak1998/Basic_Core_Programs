package BCP10;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
    public static void largestAmongThreeNo(int num1, int num2, int num3) {
        if (num1>num2 && num1>num3) {
            System.out.println("Largest number among three numbers : " + num1);
        } else if (num2>num3) {
            System.out.println("Largest number among three numbers : " + num2);
        } else {
            System.out.println("Largest number among three numbers : " + num3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third number : ");
        int num3 = sc.nextInt();
        largestAmongThreeNo(num1, num2, num3);
    }
}
