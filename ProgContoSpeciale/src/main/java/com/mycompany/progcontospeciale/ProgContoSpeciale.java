package com.mycompany.progcontospeciale;

import java.io.*;

class ProgContoSpeciale {
    public static void main(String argv[]) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);

        // creazione degli oggetti
        ContoSpeciale conto = new ContoSpeciale();
        System.out.print("Quanto saldo hai: ");
        double sus = Double.valueOf(tastiera.readLine());
        conto.setSaldo(sus);
        Assegno versamento = new Assegno();
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
