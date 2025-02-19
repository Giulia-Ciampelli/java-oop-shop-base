package org.lessons.java.shop;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {

        // creazione nuovo prodotto
        Prodotto shampoo = new Prodotto("Shampoo Solido per uso frequente", "Grazie alle proprietà addolcenti ed emollienti degli estratti di Camomilla e Calendula di nostra produzione, offre una detersione efficace e delicata, adatta a tutti i tipi di capelli e ai lavaggi frequenti. Nella formula sono presenti inoltre l'olio di Cocco vergine, biologico ed equosolidale, perfetto per prevenire l'inaridimento dei capelli, e l'olio di Jojoba, che dona morbidezza e lucentezza alla capigliatura.", new BigDecimal(8.90), new BigDecimal(0.22));

        Prodotto visita = new Prodotto("Visita medica", "Prenota un elettorcardiogramma (ECG) coi nostri medici!", new BigDecimal(37.04));

        Prodotto collutorio = new Prodotto("Collutorio antibatterico", new BigDecimal(5.39), new BigDecimal(0.10));

        System.out.println(shampoo.getName());
        System.out.println(shampoo.getCode());
        System.out.println(shampoo.getExtendedName());
        System.out.println(shampoo.getPrice());
        System.out.println(shampoo.getIVAPrice());
        System.out.println(shampoo.getDescription());
        System.out.println(visita.getExtendedName());
        System.out.println(collutorio.getIVAPrice());
        

        // tutti i miei terminali si rifiutano sistematicamente di mostrare €, spero solo che il resto funzioni
    }
}
