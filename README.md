# Calculadora Strategy

Aplicação Java para realizar as quatro operações básicas da matemática
(soma, subtração, multiplicação e divisão) entre dois números, utilizando
o **padrão de projeto Strategy**.

## Estrutura do projeto

```
CalculadoraStrategy/
└── src/
    └── com/
        └── fabrica/
            └── calculadora/
                ├── Operacao.java        -> Interface Strategy (contrato das operações)
                ├── Soma.java            -> Estratégia concreta: adição
                ├── Subtracao.java       -> Estratégia concreta: subtração
                ├── Multiplicacao.java   -> Estratégia concreta: multiplicação
                ├── Divisao.java         -> Estratégia concreta: divisão (trata divisão por zero)
                ├── Calculadora.java     -> Contexto do Strategy (delega o cálculo à estratégia atual)
                └── Controle.java        -> Classe de controle (main), instancia e testa tudo
```

## Padrão de projeto aplicado: Strategy

- **Operacao** — interface que define o contrato `calcular(numero1, numero2)`
  que toda estratégia de cálculo deve seguir.
- **Soma, Subtracao, Multiplicacao, Divisao** — implementações concretas da
  interface `Operacao`, cada uma encapsulando o algoritmo de uma operação
  matemática específica.
- **Calculadora** — classe de contexto. Mantém uma referência a uma
  `Operacao` e delega a ela a execução do cálculo, permitindo trocar a
  estratégia em tempo de execução através de `setOperacao(...)`.
- **Controle** — classe de controle com o método `main`, responsável por
  instanciar a `Calculadora` e cada uma das estratégias, alternando entre
  elas e exibindo os resultados no console (inclui também um teste de
  divisão por zero, para validar o tratamento de exceção).

## Como compilar e executar

A partir da raiz do projeto (`CalculadoraStrategy/`):

```bash
javac -d bin src/com/fabrica/calculadora/*.java
java -cp bin com.fabrica.calculadora.Controle
```

## Saída esperada

```
=========================================
 Calculadora - Padrão de Projeto Strategy 
=========================================
Número 1: 10.0
Número 2: 5.0
-----------------------------------------
Soma (+)             => 15.00
Subtração (-)        => 5.00
Multiplicação (*)    => 50.00
Divisão (/)          => 2.00
-----------------------------------------
Testando divisão por zero:
Erro esperado capturado: Não é possível dividir por zero.
=========================================
```
