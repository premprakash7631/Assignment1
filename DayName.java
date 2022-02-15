package com.company;
import java.util.Scanner;

class findDay {
    int givenNum;

    findDay(int a) {
        givenNum = a;
    }

    void getDay(){
        if(givenNum==1)
            System.out.println("Monday");
        else if(givenNum==2)
            System.out.println("Tuesday");
        else if(givenNum==3)
            System.out.println("Wednesday");
        else if(givenNum==4)
            System.out.println("Thursday");
        else if(givenNum==5)
            System.out.println("Friday");
        else if(givenNum==6)
            System.out.println("Saturday");
        else if(givenNum==7)
            System.out.println("Sunday");
        }
    }
public class DayName {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number Like 1 for monday,2 for tuesday etc");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        findDay t = new findDay(num);
        t.getDay();
    }
}