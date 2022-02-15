package com.company;
import java.util.Scanner;

class numCheck1{
    int givenNum;
    numCheck1(int a) {
        givenNum = a;
    }
    void checkNum1() {
        String res=givenNum>=0?"Positive":"Negative";
        System.out.println("Number is "+res);
    }
}

public class PositiveOrNegative2 {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter a number");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        numCheck1 t = new numCheck1(num);
        t.checkNum1();
    }
}