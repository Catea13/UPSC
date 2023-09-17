package Laborator1;

import java.util.Scanner;

public class Problema6 {
    public static void main(String[] args) {
        Scanner varsta=new Scanner(System.in);
        System.out.println("introduceti varsta");
        int age= varsta.nextInt();
        int greutatea=2*age+8;
        int inaltimea=5*age+80;
        System.out.println("Greutate este"+" "+greutatea);
        System.out.println("Inaltimea este"+""+inaltimea);
    }
}
