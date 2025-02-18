package org.lessons.java.shop;

import java.util.Random;

// consigliato BigDecimal

public class Prodotto {

    // caratteristiche
    int codice; // da randomizzare
    String nome;
    String descrizione;
    float prezzo;
    float iva;

    // costruttore
    public Prodotto(String nome, String descrizione, float prezzo, float iva) {
        Random nuovoCodice = new Random();

        this.codice = nuovoCodice.nextInt(10000); // in questo modo però dà sempre un nuovo codice
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // metodi
    public String getName() {
        return this.nome;
    }

    public int getCode() {
        return this.codice;
    }

    // RICORDA: devi controllare che esistano le istanze!
    public String getExtendedName() {
        String result = this.nome + "-" + this.codice;
        return result;
    }

    public String getDescription() {
        return this.descrizione;
    }

    public String getPrice() {
        String price = String.format("%.2f$", this.prezzo); // continua a dare ? nel terminale, anche con locale, formattazione letterale e forzatura di codice Unicode
        // problema con terminale bash e UTF-8
        return price;
    }

    public String getIVAPrice() {
        float IVAPrice = (float) (this.prezzo + (this.prezzo * this.iva));
        String formatIVAPrice = String.format("%.2f$", IVAPrice);
        return formatIVAPrice;
    }
}
