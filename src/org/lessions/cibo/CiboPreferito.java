package org.lessions.cibo;

public class CiboPreferito {
    public static void main(String[] args) {
        String[] favouritePlates = {"Pizza", "Pasta", "Torta al cioccolato", "Formaggio", "Latte"};

        System.out.println("Lunghezza della classifica: " + favouritePlates.length);
        System.out.println("Primo in classifica: " + favouritePlates[0]);
        System.out.println("ultimo in classifica: " + favouritePlates[favouritePlates.length - 1]);
        System.out.println("Metà classifica: " + favouritePlates[favouritePlates.length / 2]);
    }
}
