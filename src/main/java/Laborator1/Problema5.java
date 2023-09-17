package Laborator1;

import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);
        System.out.println("Ghiciti nr");
        int nrGhicit = nr.nextInt();
        int nr1 =nrGhicit-1;
        int nr2 =nr1+1;
        int nr3 =nr2+1;
        int nr4 =nr3+1;
        int nr5 =nr4+1;
        System.out.println("Ion a spus nr"+" "+nr);
        System.out.println(nr1);
        System.out.println(nr2);
        System.out.println(nr3);
        System.out.println(nr4);
        System.out.println(nr5);
    }
}
