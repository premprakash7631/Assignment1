package com.company;
import java.util.Scanner;
class largest {
    static int highest;
    static void max(int a, int b, int c) {
        highest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.print("Largest number is " + highest);
    }
}
    public class Pb {
        public static void main(String[] args) {
            int a, b, c;
            System.out.print("Enter three numbers");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            largest.max(a, b, c);
        }
    }