package org.lesson;

import org.lesson.java.inheritance.shop.Prodotto;

public class Televisione extends Prodotto {
    private int pollici;
    private boolean smartTv;

    public Televisione(String nome, String marca, float prezzo, float iva, int pollici, boolean smartTv) {
        super(nome, marca, marca, prezzo, iva);
        this.pollici = pollici;
        this.smartTv = smartTv;

    }

    // getter
    public boolean isSmartTv() {
        return this.smartTv;
    }

    public int getPollici() {
        return this.pollici;
    }

    // setter
    public void setPollici( int pollici){
        this.pollici =  pollici;
    }

}
