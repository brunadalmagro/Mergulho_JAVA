package com.algaworks.banco.app.modelo;

import com.algaworks.banco.app.app.Pessoa;

public class Principal {
    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa();
        titular1.setNome("João da Silva");
        titular1.setDocumento("123123123");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria");
        titular2.setDocumento("223123123");

        Conta minhaConta = new Conta(titular1, 123, 987);
        minhaConta.depositar(14_000);
        minhaConta.sacar(1_000, 10);

        Conta suaConta = new Conta(titular2, 222, 333);
        suaConta.depositar(30_000);

        System.out.println("Titular:" + suaConta.getTitular().getNome());
        System.out.println("Saldo: " + suaConta.getSaldo());

        System.out.println("Titular: " + minhaConta.getTitular().getNome());
        System.out.println("Saldo: " + minhaConta.getSaldo());
    }
}
