package com.company;
import java.util.Scanner;

class findMaximumMinimum{
    int firstNo,secondNo,thirdNo;
    findMaximumMinimum(int a, int b, int c){
        firstNo=a;
        secondNo=b;
        thirdNo=c;
    }
    void checkMax(){
        if(firstNo>secondNo) {
            if (firstNo > thirdNo) {
                System.out.println("Largest is " + firstNo);
            } else {
                System.out.println("Largest is " + thirdNo);
            }
        }else{
                if(secondNo>thirdNo){
                    System.out.println("Largest is "+secondNo);
                }
                else
                    System.out.println("Largest is "+thirdNo);
            }
        }
    void checkMin(){
        if(firstNo<secondNo) {
            if (thirdNo < firstNo) {
                System.out.println("Smallest is " + thirdNo);
            } else {
                System.out.println("Smallest is " + firstNo);
            }
        }else{
            if(secondNo<thirdNo){
                System.out.println("Smallest is "+secondNo);
            }
            else
                System.out.println("Smallest is "+thirdNo);
        }
    }
    }

public class MaximumMinimum{
    public static void main(String[] args) {
        int x,y,z;
        System.out.print("Enter three numbers");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        findMaximumMinimum d=new findMaximumMinimum(x,y,z);
        d.checkMax();
        d.checkMin();
    }
}
