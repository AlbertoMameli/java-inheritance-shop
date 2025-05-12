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
    public Prodotto(String nome, String marca, String descrizione, float prezzo) {
        Random codiceRandomico = new Random();
        this.codice = codiceRandomico.nextInt(1111111, 9999999);
        this.nome = nome;
        this.marca = marca;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = 22.0f;

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

    public void setNome ( String nome){
        if (nome == null || nome.trim().isEmpty()){
            System.out.println("Inserire un nome");
            return;
        }
        this.nome = nome;

    }

    public void setMarca (String marca){
        if (marca == null || marca.isBlank()){
            System.out.println("Inserisci una marca");
            return;
        }
        this.marca = marca;
    }


    public void setDescrizione(String descrizione){
        if (descrizione == null || descrizione.trim().isEmpty()){
            System.out.println("Inserisci descrizione");
            return;

        }
        this.descrizione = descrizione;
    }
    public void setPrezzo (float prezzo){
        if(prezzo <= 0){
            System.out.println("Inserisci il prezzo");
            return;
        }
        this.prezzo = prezzo;
    }

}
