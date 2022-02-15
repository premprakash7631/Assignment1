package com.company;
import java.util.Scanner;

class findDay1 {
    int givenNum;

    findDay1(int a) {
        givenNum = a;
    }

    void getDay() {
        switch (givenNum) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a valid No");
        }
    }
}
public class DayName2 {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number Like 1 for monday,2 for tuesday etc");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        findDay1 t = new findDay1(num);
        t.getDay();
    }
}