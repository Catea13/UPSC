package OOP;

import java.util.Scanner;

public class Incaltaminte {
        String color;
        int pret;
        int size;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Incaltaminte(String color, int pret, int size) {
        this.color = color;
        this.pret = pret;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Incaltaminte{" +
                "color='" + color + '\'' +
                ", pret=" + pret +
                ", size=" + size +
                '}';
    }
}



