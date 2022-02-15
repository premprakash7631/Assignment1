package com.company;
import java.util.Scanner;

class evenOddCheck1{
    int givenNum;
    evenOddCheck1(int a) {
        givenNum = a;
    }
    void checkEvenOdd() {
        String res= givenNum%2==0 ? "Even" : "Odd";
        System.out.println("Number is "+res);
    }
}

public class EvenOrOdd2 {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter a number");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        evenOddCheck1 t = new evenOddCheck1(num);
        t.checkEvenOdd();
    }
}