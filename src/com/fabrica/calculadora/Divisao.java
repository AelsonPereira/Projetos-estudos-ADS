package com.fabrica.calculadora;

public class Divisao implements Operacao {

    @Override
    public double calcular(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return numero1 / numero2;
    }

    @Override
    public String getNome() {
        return "Divisão (/)";
    }
}
