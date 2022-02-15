package com.company;
import java.util.Scanner;

class palindromeCheck{
    int givenNum,n;
    palindromeCheck(int a) {
        givenNum = a;
    }
    void checkPalindrome() {
        int rem,s=0;
        givenNum=n;
        while(n>0) {
            rem=n%10;
            s=10*s+rem;
            n=n/10;
            }
        if(n==s)
            System.out.print( "Palindrome No");
        else
            System.out.print("Not Palindrome No");
    }
}

public class Palindrome {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        palindromeCheck t = new palindromeCheck(num);
        t.checkPalindrome();
    }
}