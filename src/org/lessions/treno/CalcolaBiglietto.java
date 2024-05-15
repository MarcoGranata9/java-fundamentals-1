package org.lessions.treno;

import java.util.Scanner;

public class CalcolaBiglietto {
    public static void main(String[] args) {
        // scanner per input
        Scanner scanner = new Scanner(System.in);

        // input user
        int userKm, userAge;
        // prezzo biglietto
        double tiketPrice = 0.21;
        // prelevare input
        System.out.println("Numero di km da percorrere: ");
        userKm = Integer.parseInt(scanner.nextLine());
        System.out.println("Età del passeggero: ");
        userAge = Integer.parseInt(scanner.nextLine());

        // settare sconto
        int discount = 0;
        if (userAge >= 65) {
            discount = 40;
        } else if (userAge < 18) {
            discount = 20;
        }

        // calcolo del biglietto
        double totalPrice = userKm * tiketPrice;
        if (discount != 0) {
            double discoutedPrice = (userKm * tiketPrice / 100) * discount;
            totalPrice = userKm * tiketPrice - discoutedPrice;
        }

        // print prezzo
        System.out.println("Il prezzo del biglietto è:" + totalPrice);

        // scanner chiuso
        scanner.close();
    }
}
