package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaBancaria cc = new ContaCorrente(12345, "João", 500.0, 200.0);
        ContaBancaria cp = new ContaPoupanca(67890, "Maria", 1000.0);
        ContaBancaria ci = new ContaInvestimento(54321, "Carlos", 5000.0);
        ContaBancaria cs = new ContaSalario(11111, "Ana", 1500.0, 100.0);
        ContaBancaria cia = new ContaInvestimentoAltoRisco(22222, "Bruno", 12000.0);

        System.out.println("Antes dos saques:");
        cc.exibirInformacoes();
        cp.exibirInformacoes();
        ci.exibirInformacoes();
        cs.exibirInformacoes();
        cia.exibirInformacoes();

        System.out.println("\nRealizando saques...");
        cc.sacar(600);
        cp.sacar(1200);
        ci.sacar(1000);
        cs.sacar(500);
        cs.sacar(200);
        cia.sacar(2000);

        System.out.println("\nDepois dos saques:");
        cc.exibirInformacoes();
        cp.exibirInformacoes();
        ci.exibirInformacoes();
        cs.exibirInformacoes();
        cia.exibirInformacoes();
    }
}


