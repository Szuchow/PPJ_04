package com.company;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        //zad.1
        double i = 2;
        double o = Math.sqrt(i);
        double sum1 = o * 2 - 2;
        System.out.println(sum1);
        System.out.println();
        //zad.2
        double sqTwo = Math.sqrt(2);
        double sum2 = sqTwo * 2 - 2;
        System.out.println(sum2);
        if (sum1 == sum2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println();
        //zad.3
        java.util.Scanner in = new java.util.Scanner(System.in);
        byte wrt = in.nextByte();
        System.out.println(wrt);
        System.out.println();
        //zad.4
        int wrt2 = 1;
        System.out.println(wrt > 1 ? "A, bo > 1" : wrt < 0 ? "B, bo < 0" : "C, bo <0,1>");
        System.out.println();
        //zad.5
        if ((wrt >= -4) && (wrt <= -3)) {
            System.out.println("true");

        } else {
            System.out.println(false);
        }
        System.out.println();
        //zad6

    }
}
