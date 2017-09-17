package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class SaldoInsuficienteException extends Exception {
     public SaldoInsuficienteException() {
        super("O saldo é insuficiente no momento, tente novamente!");
    }
}
