package org.lesson.java.inheritance.shop;
import org.lesson.java.inheritance.shop.Prodotto;
//Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
public class Smartphone extends Prodotto {  //estendo la la classe smatphone alla classe prodotto e aggiungo le caratteristiche dell'oggetto da creare
    private String imei;
    private int memoria;

    // costruttore
    public Smartphone(String nome, String marca, String descrizione, float prezzo, float iva, String imei, int memoria) { // non ritorna nulla ma costruisce
        super(nome, marca, descrizione, prezzo, iva);//invocazione metodo
        this.memoria = memoria;
        this.imei = imei;

    }

    public String getCodiceImei(){
        return this.imei;
    }

}
