package org.lessons.java.geometria;

import org.lessons.java.geometria.Rettangolo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Inserisci la base: ");
        int base = Integer.parseInt(scanner.nextLine());

        System.out.println("Inserisci l'altezza: ");
        int altezza = Integer.parseInt(scanner.nextLine());

        Rettangolo rettangolo = new Rettangolo(base, altezza);


        System.out.println("Questa è l'area del rettangolo: " + rettangolo.calcolaArea());

        System.out.println("Questa è l'area del rettangolo: " + rettangolo.calcolaPerimetro());


        rettangolo.disegna();

        scanner.close();
    }
}

