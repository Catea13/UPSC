package Laborator1;

import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        Scanner nrFete=new Scanner(System.in);
        System.out.println("Dati nr de fete");
        int nr=nrFete.nextInt();
        int nrBaieti=nr*2+10;
        System.out.println("Nr de fete"+" "+nr);
        System.out.println("Nr de baieti"+ " "+nrBaieti);
    }
}
