package com.company;
import java.util.Scanner;

class findMaximumMinimum1{
    int firstNo,secondNo,thirdNo;
    findMaximumMinimum1(int a, int b, int c){
        firstNo=a;
        secondNo=b;
        thirdNo=c;
    }
    void checkMax1(){
        int rem,Largest;
        rem = firstNo > secondNo ? firstNo : secondNo;
        Largest=thirdNo>rem?thirdNo:rem;
        System.out.println("The Largest No is "+Largest);

    }
    void checkMin1() {
        int temp,smallest;
        temp = firstNo < secondNo ? firstNo : secondNo;
        smallest=thirdNo<temp?thirdNo:temp;
        System.out.println("The Smallest No is "+smallest);
    }
}

public class MaximumMinimum2{
    public static void main(String[] args) {
        int x,y,z;
        System.out.print("Enter three numbers");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        findMaximumMinimum1 d=new findMaximumMinimum1(x,y,z);
        d.checkMax1();
        d.checkMin1();
    }
}
