package Laborator1;

import java.util.Scanner;

public class Problema9 {
    public static void main(String[] args) {
        Scanner nota1=new Scanner(System.in);
        System.out.println("Introduceti nota1");
        int x=nota1.nextInt();
        Scanner nota2=new Scanner(System.in);
        System.out.println("Introduceti nota1");
        int y=nota2.nextInt();
        Scanner nota3=new Scanner(System.in);
        System.out.println("Introduceti nota1");
        int z=nota3.nextInt();
        int media=x+y+z;
        int mediaGenerala=media/3;
        System.out.println(mediaGenerala);
    }
}
