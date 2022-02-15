package com.company;
import java.util.Scanner;

class primeCheck{
    int givenNum;
    primeCheck(int a) {
        givenNum = a;
    }

    void checkPrime() {
        boolean isPrime = true;
        for (int i = 2; i < givenNum; i++) {
            if (givenNum % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println(givenNum + " is Prime no");
        else
            System.out.println(givenNum + " is Not Prime No");
    }
}

public class Prime{
    public static void main(String[] args){
        int num;
        System.out.println("Enter a number");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        primeCheck t=new primeCheck(num);
        t.checkPrime();
    }
}