package program;

import entities.ContaBancaria;
import entities.ContaCorrente;

public class Program {
    public static void main(String[] args) {

        ContaBancaria corrente = new ContaCorrente(1000.0, 5521, "Itaú");
        corrente.sacar(100.0);
        corrente.mostrarSaldo();

        ContaBancaria corrente2 = new ContaCorrente(2000.0, 5522, "Itaú");
        corrente2.depositar(100.0);
        corrente2.mostrarSaldo();
    }
}
