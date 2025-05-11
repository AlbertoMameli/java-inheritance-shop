package org.lesson.java.inheritance.shop;

import java.text.DecimalFormat;
import java.util.Random;

/*Creare un nuovo progetto java-inheritance-shop
Creare la classe Prodotto che gestisce i prodotti dello shop.
Un prodotto è caratterizzato da:
codice (numero intero)
nome
marca
prezzo
iva
Lo shop gestisce diversi tipi di prodotto:
Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.
Buon lavoro! */
public class Prodotto {
    // Creo variabili d'istanza
    protected int codice; // genero un codice randomico
    protected String nome;
    protected String marca;
    protected String descrizione;
    protected float prezzo;
    protected float iva;

    // Costruttore
    public Prodotto(String nome, String marca, String descrizione, float prezzo, float iva) {
        Random codiceRandomico = new Random();
        this.codice = codiceRandomico.nextInt(1111111, 9999999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;

    }
    //getter

    public float getPrezzoBase() {
        return prezzo;
    }

    public float getPrezzoIvato() {
        return prezzo + (prezzo * iva / 100);
    }

    public String getNomeEsteso() {
        return ("Ecco il nuovo " + nome + " con codice " + codice + " a soli " + getPrezzoIvato());
    }

    public String getPrezzoFormattatoConIva(){
        DecimalFormat prezzoFormattato = new DecimalFormat("0.00");
        return prezzoFormattato.format(getPrezzoIvato()) + " euro";
    }

}
