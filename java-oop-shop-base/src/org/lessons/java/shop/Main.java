package org.lessons.java.shop;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {

        // ultimo tentativo prima di svenire
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        // creazione nuovo prodotto
        Prodotto shampoo = new Prodotto(0, "Shampoo Solido per uso frequente", "Grazie alle proprietà addolcenti ed emollienti degli estratti di Camomilla e Calendula di nostra produzione, offre una detersione efficace e delicata, adatta a tutti i tipi di capelli e ai lavaggi frequenti. Nella formula sono presenti inoltre l’olio di Cocco vergine, biologico ed equosolidale, perfetto per prevenire l’inaridimento dei capelli, e l’olio di Jojoba, che dona morbidezza e lucentezza alla capigliatura.", 8.90f, 0);

        System.out.println(shampoo.getName());
        System.out.println(shampoo.getCode());
        System.out.println(shampoo.getExtendedName());
        System.out.println(shampoo.getPrice());
        System.out.println("€ \u20AC");
        System.out.println("Euro symbol: €");
        System.out.println("System Encoding: " + System.getProperty("file.encoding"));

        // tutti i miei terminali si rifiutano sistematicamente di mostrare €, spero solo che il resto funzioni
    }
}
