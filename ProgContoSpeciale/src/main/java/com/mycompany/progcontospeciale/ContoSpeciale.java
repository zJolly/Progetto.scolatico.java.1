package com.mycompany.progcontospeciale;

class ContoSpeciale extends ContoCorrente {
  private final double LIMITE = 200.0;

  // overriding: metodo sovrascritto public void preleva(double importo)
  public void preleva(double importo) {
    // verifica il limite di prelevamento
    if (importo <= LIMITE) {
      // verifica la disponibilita' del saldo
      if (importo <= getSaldo()) {
        super.preleva(importo);
      } else {
        System.out.println("Prelevamento non disponibile.");
      }
    } else {
      System.out.println("Prelevamento rifiutato");
      System.out.println("Limite superato (200.EURO.MAX)");
    }
  }

  // overloading: metodo sovraccaricato
  public void versa(Assegno p_assegno) {
    super.versa(p_assegno.importo);
  }
}
