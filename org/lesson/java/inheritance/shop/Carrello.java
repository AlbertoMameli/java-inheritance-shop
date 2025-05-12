package org.lesson.java.inheritance.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Prodotto[] carrello = new Prodotto[2];
        int prodottoSelezionato = 0;

        while (true) {
            System.out.println("Inserisci un prodotto");
            String prodottoScelto = scanner.nextLine().trim().toLowerCase();

            if (prodottoSelezionato == carrello.length) {
                Prodotto[] nuovoCarrello = new Prodotto[carrello.length * 2];
                for (int i = 0; i < carrello.length; i++) {
                    nuovoCarrello[i] = carrello[i];
                }
                carrello = nuovoCarrello;

            }

            //chiesdiamo all'utente le infi del prodotto

            scanner.close();

        }
    }
}
