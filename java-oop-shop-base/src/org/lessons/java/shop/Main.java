package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        // creazione nuovo prodotto
        Prodotto shampoo = new Prodotto(0, "Shampoo Solido per uso frequente", "Grazie alle proprietà addolcenti ed emollienti degli estratti di Camomilla e Calendula di nostra produzione, offre una detersione efficace e delicata, adatta a tutti i tipi di capelli e ai lavaggi frequenti. Nella formula sono presenti inoltre l’olio di Cocco vergine, biologico ed equosolidale, perfetto per prevenire l’inaridimento dei capelli, e l’olio di Jojoba, che dona morbidezza e lucentezza alla capigliatura.", 8.90f, 0);

        System.out.println(shampoo.nome);
    }
}
