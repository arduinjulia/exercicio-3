package org.example;

public class ContaSalario extends ContaCorrente{
    int saquesGratuitos = 1;

    public ContaSalario(int numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo, limiteChequeEspecial);
    }


    @Override
    public void sacar(double valor) {
        if (saquesGratuitos > 0) {
            saquesGratuitos--;
            super.sacar(valor);
        } else {
            super.sacar(valor + 5.0);
        }
    }

}
