package org.example;

public class ContaCorrente extends ContaBancaria{
    public double limiteChequeEspecial;

    public ContaCorrente(int numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limiteChequeEspecial >= valor) {
            saldo -= valor;
        }
    }
}
