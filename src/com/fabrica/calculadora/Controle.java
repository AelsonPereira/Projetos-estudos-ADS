package com.fabrica.calculadora;

public class Controle {

    public static void main(String[] args) {

        double numero1 = 10;
        double numero2 = 5;

        Calculadora calculadora = new Calculadora();

        System.out.println("=========================================");
        System.out.println(" Calculadora - Padrão de Projeto Strategy ");
        System.out.println("=========================================");
        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);
        System.out.println("-----------------------------------------");

        calculadora.setOperacao(new Soma());
        exibirResultado(calculadora, numero1, numero2);

        calculadora.setOperacao(new Subtracao());
        exibirResultado(calculadora, numero1, numero2);

        calculadora.setOperacao(new Multiplicacao());
        exibirResultado(calculadora, numero1, numero2);

        calculadora.setOperacao(new Divisao());
        exibirResultado(calculadora, numero1, numero2);

        System.out.println("-----------------------------------------");
        System.out.println("Testando divisão por zero:");
        try {
            calculadora.executar(numero1, 0);
        } catch (ArithmeticException e) {
            System.out.println("Erro esperado capturado: " + e.getMessage());
        }

        System.out.println("=========================================");
    }

    private static void exibirResultado(Calculadora calculadora, double numero1, double numero2) {
        double resultado = calculadora.executar(numero1, numero2);
        System.out.printf("%-20s => %.2f%n", calculadora.getOperacao().getNome(), resultado);
    }
}
