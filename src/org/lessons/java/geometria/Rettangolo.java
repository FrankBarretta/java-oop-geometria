package org.lessons.java.geometria;

public class Rettangolo {

    int base;
    int altezza;

    Rettangolo(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
        System.out.println("Base: " + this.base + "\nAltezza: " + this.altezza);
    }

    int calcolaArea(){
        int area = base * altezza;
        return area;
    }

    int calcolaPerimetro(){
        int perimetro = (base * 2) + (altezza * 2);
        return perimetro;
    }

    void disegna(){

        for (int i = 0; i < altezza; i++) {
            String disegnaLinea = "";

            if (i == 0 || i == altezza-1) {

                for (int j = 0; j < base; j++) {
                    disegnaLinea += "0";
                }

                System.out.println(disegnaLinea);
            } else {
                disegnaLinea = "0";
                for (int j = 0; j < base; j++) {
                    disegnaLinea += " ";
                }
                disegnaLinea += "0";
                System.out.println(disegnaLinea);
            }


        }

    }
}
