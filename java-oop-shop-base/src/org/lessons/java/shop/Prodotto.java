// Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di "utilità" per fare in modo che:
// - esistano almeno due costruttori diversi
// - il codice prodotto sia accessibile solo in lettura
// - gli altri attributi siano accessibili sia in lettura che in scrittura
package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

// consigliato BigDecimal

public class Prodotto {

    // caratteristiche
    private int codice; // da randomizzare
    private String nome;
    private String descrizione;
    private BigDecimal prezzo;
    private BigDecimal iva;

    // costruttore con tutte le caratteristiche
    public Prodotto(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva) {
        Random nuovoCodice = new Random();

        this.codice = nuovoCodice.nextInt(100000); // in questo modo però dà sempre un nuovo codice
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // costruttore prodotto senza IVA
    public Prodotto(String nome, String descrizione, BigDecimal prezzo) {
        Random nuovoCodice = new Random();

        this.codice = nuovoCodice.nextInt(1000);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    // costruttore senza descrizione
    public Prodotto(String nome, BigDecimal prezzo, BigDecimal iva) {
        Random nuovoCodice = new Random();

        this.codice = nuovoCodice.nextInt(100000);
        this.nome = nome;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // metodi
    public String getName() {
        return this.nome;
    }

    public void setName(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
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

    public void setDescription(String descrizione) {
        if (descrizione != null) {
            this.descrizione = descrizione;
        }
    }

    public BigDecimal getPrice() {
        return prezzo.setScale(2, RoundingMode.DOWN);
    }

    public void setPrice(BigDecimal prezzo) {
        this.prezzo = prezzo; // serve un modo diverso perchè non si usano gli operatori nello stesso modo
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    // ecco perchè è consigliato BigDecimal
    public BigDecimal getIVAPrice() {
        if (iva != null) {
            BigDecimal IVAPrice = (this.prezzo.add(this.prezzo.multiply(iva)));
            return IVAPrice.setScale(2, RoundingMode.DOWN);
        } else {
            return prezzo.setScale(2, RoundingMode.DOWN);
        }
    }
}
