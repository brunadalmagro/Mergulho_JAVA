package com.algaworks.banco.app.modelo;

import com.algaworks.banco.app.app.Pessoa;

import java.util.Objects;

public class Conta {
    private Pessoa titular;
    private int agencia;
    private int numero;
    private double saldo;

    Conta(Pessoa titular, int agencia, int numero){
        Objects.requireNonNull(titular);
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    void depositar(double valor) {
        if (valor <= 0){
            throw new IllegalStateException("Valor deve ser maior que 0");
        }
        saldo = saldo + valor;
    }

    void sacar(double valor){
        if (valor <= 0){
            throw new IllegalStateException("Valor deve ser maior que 0");
        }

        if (saldo - valor <0) {
            throw new IllegalStateException(("Saldo insuficiente"));
        }
        saldo = saldo - valor;
    }

    void sacar(double valor, double taxaSaque){
        sacar(valor+taxaSaque);
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
