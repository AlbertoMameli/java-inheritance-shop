package org.lesson.java.inheritance.shop;

public class Cuffie extends Prodotto {
    private String colore;
    private boolean wirless;

    public Cuffie(String nome, String colore, String descrizione, String marca, float prezzo, float iva,
            boolean wirless) {
        super(nome, marca, descrizione, prezzo);

        this.colore = colore;
        this.wirless = wirless;
    }
    // metodi

    public String GetColore() {
        return this.colore;
    }

    public boolean isWireless() {
        return this.wirless;
    }

    public void setColore(String colore) {
        if (colore == null|| colore.length() < 2){
            System.out.println("Inserisci un colore");
        }else{
            this.colore = colore;
        }

    }
}
