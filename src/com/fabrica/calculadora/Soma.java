package com.fabrica.calculadora;

public class Soma implements Operacao {

    @Override
    public double calcular(double numero1, double numero2) {
        return numero1 + numero2;
    }

    @Override
    public String getNome() {
        return "Soma (+)";
    }
}
