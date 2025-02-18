// Nel progetto java-oop-shop, package org.lessons.java.shop, creare la classe Prodotto che gestisce i prodotti dello shop. 

// Un prodotto è caratterizzato da:
// - codice (numero intero)
// - nome
// - descrizione
// - prezzo
// - iva

// Usate opportunamente costruttori, attributi ed eventuali altri metodi di “utilità” per fare in modo che:
// - alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
// - il prodotto esponga un metodo per avere il prezzo base 
// - il prodotto esponga un metodo per avere il prezzo comprensivo di iva
// - il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome

// Nello stesso package aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto.

package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

    // caratteristiche
    int codice; // da randomizzare
    String nome;
    String descrizione;
    float prezzo;
    float iva;

    // costruttore
    public Prodotto(String nome, String descrizione, float prezzo) {
        Random nuovoCodice = new Random();

        this.codice = nuovoCodice.nextInt(10000); // in questo modo però dà sempre un nuovo codice
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    // metodi
    public String getName() {
        return this.nome;
    }

    public int getCode() {
        return this.codice;
    }

    public String getExtendedName() {
        String result = this.nome + "-" + this.codice;
        return result;
    }

    public String getPrice() {
        String price = String.format("%.2f$", this.prezzo); // continua a dare ? nel terminale, anche con locale, formattazione letterale e forzatura di codice Unicode
        // problema con terminale bash e UTF-8
        return price;
    }

    public String getIVAPrice() {
        float IVAPrice = (float) (this.prezzo + (this.prezzo * 0.2));
        String formatIVAPrice = String.format("%.2f$", IVAPrice);
        return formatIVAPrice;
    }
}
