package com.company;
import java.util.Scanner;

class evenOddCheck{
    int givenNum,n;
    evenOddCheck(int a) {
        givenNum = a;
    }
    void checkEvenOdd() {
        if(givenNum%2==0)
            System.out.print( "Even No");
        else
            System.out.print("Odd No");
    }
}

public class EvenOrOdd {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter a number");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        evenOddCheck t = new evenOddCheck(num);
        t.checkEvenOdd();
    }
}