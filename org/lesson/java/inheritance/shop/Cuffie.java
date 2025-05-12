package org.lesson.java.inheritance.shop;

public class Cuffie extends Prodotto {
    private String colore;
    private boolean wirless;

    public Cuffie(String nome, String colore, float prezzo, float iva, boolean wirless) {
        super(nome, nome, colore, prezzo, iva);

        this.colore = colore;
        this.wirless = wirless;
    }
    //metodi

    public String GetColore (){
        return this.colore;
    }

    public boolean isWireless(){
        return this.wirless;
    }

    public void setColore (String colore){
        if( colore.length() < 2)
        this.colore = colore;

    }

}
