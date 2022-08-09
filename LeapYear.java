package BCP2;

import java.util.Scanner;

public class LeapYear {

    public void leapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year to check leap year or not : ");
        int year = sc.nextInt();

        if(year%100==0 && year%400==0 || year%100!=0 && year%4==0) {
            System.out.println(+year+ " is leap year");
        } else {
            System.out.println(+year+ " is not a leap year");
        }
    }
}
