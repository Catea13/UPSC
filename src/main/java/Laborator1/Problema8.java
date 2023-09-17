package Laborator1;

import java.util.Scanner;

public class Problema8 {
    public static void main(String[] args) {
        Scanner nr1=new Scanner(System.in);
        System.out.println("Introduceti a");
       int a=nr1.nextInt();
        Scanner nr2=new Scanner(System.in);
        System.out.println("Introduceti b");
        int b=nr2.nextInt();
        int c= (int) (Math.pow(a,2)+Math.pow(b,2));
        System.out.println(c);

    }
}
