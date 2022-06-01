package com.mycompany.progcontospeciale;

import java.io.*;

class ProgContoSpeciale {
    public static void main(String argv[]) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);

        // creazione degli oggetti
        ContoSpeciale conto = new ContoSpeciale();
        System.out.print("Quanto saldo hai: ");
        try{
            double sus = Double.valueOf(tastiera.readLine());
            conto.setSaldo(sus);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Non hai inserito un numero \"double\"");
            conto.setSaldo(2000.0);
            System.out.println("Il saldo è stato impostato a 2000€");
        }
        // dichiarazione delle variabili
        String valore = "";
        double importo = 0;
        System.out.print("Importo dell'assegno: ");
        try {
            valore = tastiera.readLine();
            importo = Double.valueOf(valore);
            conto.preleva(importo);
            conto.stampaSaldo();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
