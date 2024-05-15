package org.lessions.MetGala;

import java.util.Scanner;

public class MetGala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] guestList = {"Jennifer Lopez", "Zendaya", "Chris Hemsworth", "Bad Bunny", "Cara Delevingne", "Kendall Jenner", "Uma Thurman", "Damiano David", "Luca Guadagnino"};

        System.out.println("Come ti chiami?");
        String guestName = scanner.nextLine();

        boolean flag = false;
        for (int i = 0; i < guestList.length; i++) {
            if (guestList[i].equals(guestName)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Sei presente sulla lista puoi entrare!");
        } else {
            System.out.println("Non sei presente sulla lista non entrare!");

        }
    }
}
