package org.lesson.java.inheritance.shop;
import java.util.Random;

import org.lesson.java.inheritance.shop.Prodotto;
//Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
public class Smartphone extends Prodotto {  //estendo la la classe smartphone alla classe prodotto e aggiungo le caratteristiche dell'oggetto da creare
    private String imei;
    private int memoria;

    // costruttore
    public Smartphone(String nome, String marca, String descrizione, float prezzo, float iva, String imei, int memoria) { // non ritorna nulla ma costruisce
        super(nome, marca, descrizione, prezzo);//invocazione metodo
        this.memoria = memoria;
        this.imei = generaImei();

    }

    //getter per leggere i valori

    public String getCodiceImei(){
        return this.imei;
    }
    public int getMemoria(){
        return this.memoria;
    }


    //setter per controllare i valori
    public void setImei (String imei){
        this.imei = imei;
    }

    public void setMemoria (int memoria){
        if (memoria < 0){
            this.memoria = memoria;
        }
        else {
            System.out.println("Inserisci un'opzione valida.");
        }
    
    }


    //genera imei randomico
    public String generaImei(){
        Random rand = new Random();
        StringBuilder generatedImei = new StringBuilder();  //creo un contenitore vuoto per contenere i numeri che andrò a generare
        for (int i = 0; i < 15; i ++){
            generatedImei.append(rand.nextInt(10));//genero numero casuale tra 0 e 10 e lo aggiungo con append alla stringa
        }
        return generatedImei.toString(); // mi ritorna una stringa
    }
@Override //implementiamo un metodo della sottoclasse alla nostra superclasse
public String toString(){
    return super.toString() + " " + imei + " " + memoria + " GB";
}
}
