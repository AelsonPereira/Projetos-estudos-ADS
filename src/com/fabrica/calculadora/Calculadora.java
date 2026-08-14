package com.fabrica.calculadora;

public class Calculadora {

    private Operacao operacao;

    public Calculadora() {
    }

    public Calculadora(Operacao operacao) {
        this.operacao = operacao;
    }

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    public Operacao getOperacao() {
        return operacao;
    }

    public double executar(double numero1, double numero2) {
        if (operacao == null) {
            throw new IllegalStateException("Nenhuma operação (estratégia) foi definida para a calculadora.");
        }
        return operacao.calcular(numero1, numero2);
    }
}
