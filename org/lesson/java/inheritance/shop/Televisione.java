package org.lesson.java.inheritance.shop;

public class Televisione extends Prodotto {
    private int pollici;
    private boolean smartTv;

    public Televisione(String nome, String marca, String descrizione, float prezzo, float iva, int pollici,
            boolean smartTv) {
        super(nome, marca, descrizione, prezzo);
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
    public void setPollici(int pollici) {
        if (pollici <= 16)
            this.pollici = pollici;
        else {
            System.out.println("perfavore inserisci delle misure valide");
        }

    }

    @Override
    public String toString() {
        return super.getNomeEsteso() + "Pollici: " + pollici + " Smart TV: " + (smartTv ? "Sì" : "No");

    }
}
