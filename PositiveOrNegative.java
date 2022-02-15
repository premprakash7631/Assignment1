package com.company;
import java.util.Scanner;

class numCheck{
    int givenNum;
    numCheck(int a) {
        givenNum = a;
    }
    void checkNum() {
        if(givenNum>=0)
            System.out.println("Positive No");
        else
            System.out.println("Negative No");
    }
}

public class PositiveOrNegative {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter a number");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        numCheck t = new numCheck(num);
        t.checkNum();
    }
}
