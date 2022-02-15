package com.company;
import java.util.Scanner;

class factorialFind {
    int givenNum;

    factorialFind(int a) {
        givenNum = a;
    }

    void getFactorial() {
        int fact = 1;
        for (int i = 1; i <= givenNum; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + givenNum + " is " + fact);
    }
}
public class Factorial {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        factorialFind t = new factorialFind(num);
        t.getFactorial();
    }
}