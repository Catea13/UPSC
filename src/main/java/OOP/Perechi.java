package OOP;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Perechi  extends Incaltaminte{

    public Perechi(String color, int pret, int size) {
        super(color, pret, size);
    }

    public static void main(String[] args) {
            ArrayList<Incaltaminte> perechi= new ArrayList<>();
            perechi.add(new Incaltaminte("verde",590,39));
            perechi.add(new Incaltaminte("albasrtru", 700, 40));





                Scanner size = new Scanner(System.in);
                System.out.println("Enter the size:");
                int marimea = size.nextInt();
                  for (Incaltaminte variabila : perechi) {
                    if (variabila.size== marimea) {
                        System.out.println(variabila);

                    }
                }
            }
        }



