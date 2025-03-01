package org.example;

public class ContaInvestimentoAltoRisco extends ContaInvestimento{
    public ContaInvestimentoAltoRisco(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor){
        double taxa;

        if (saldo < 10000) {
            System.out.println("O valor mínimo para saque é 1.000 reais");
        } else {
            taxa = valor * 0.05;
            saldo -= (valor + taxa);
        }

    }

}
