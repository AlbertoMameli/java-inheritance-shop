package org.lesson;

import org.lesson.java.inheritance.shop.Prodotto;

public class Televisione extends Prodotto {
    private int pollici;
    private boolean smartTv;
    public Televisione(String nome, String marca, float prezzo, float iva,int pollici, boolean smartTv){
        super(nome, marca, marca, prezzo, iva);
        this.pollici = pollici;
        this.smartTv = smartTv;

    }

    public boolean isSmartTv(){
        return this.smartTv;
    }
    
}
